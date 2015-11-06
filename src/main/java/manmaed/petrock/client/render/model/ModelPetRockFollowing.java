package manmaed.petrock.client.render.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelPetRockFollowing extends ModelBase
{
  //fields
    public ModelRenderer Leg1;
    public ModelRenderer Leg2;
    public ModelRenderer Body;
    public ModelRenderer Arm1;
    public ModelRenderer Arm2;
    public ModelRenderer head;
  
  public ModelPetRockFollowing(float par1)
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Leg1 = new ModelRenderer(this, 0, 18);
      Leg1.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg1.setRotationPoint(-2F, 20F, 0F);
      Leg1.setTextureSize(64, 32);
      Leg1.mirror = true;
      setRotation(Leg1, 0F, 0F, 0F);
      Leg2 = new ModelRenderer(this, 8, 18);
      Leg2.addBox(-1F, 0F, -1F, 2, 4, 2);
      Leg2.setRotationPoint(2F, 20F, 0F);
      Leg2.setTextureSize(64, 32);
      Leg2.mirror = true;
      setRotation(Leg2, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(-1F, 0F, -1F, 8, 7, 4);
      Body.setRotationPoint(-3F, 13F, -1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 0, 24);
      Arm1.addBox(-1F, -1F, -1F, 1, 4, 2);
      Arm1.setRotationPoint(-4F, 15F, 0F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, 0F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 6, 24);
      Arm2.addBox(0F, -1F, -1F, 1, 4, 2);
      Arm2.setRotationPoint(4F, 15F, 0F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, 0F, 0F, 0F);
      head = new ModelRenderer(this, 24, 0);
      head.addBox(-3F, -5F, -3F, 6, 5, 6);
      head.setRotationPoint(0F, 13F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Leg1.render(f5);
    Leg2.render(f5);
    Body.render(f5);
    Arm1.render(f5);
    Arm2.render(f5);
    head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.head.rotateAngleX = f4 / (180F / (float)Math.PI);
    this.head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Arm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Arm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
  }

}
