// Date: 4/19/2013 5:00:24 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelMuk extends PixelmonModelBase
{
  //fields
    PixelmonModelRenderer Body;
  
  public ModelMuk()
  {
    textureWidth = 256;
    textureHeight = 128;
    
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 22, 0);
      PixelmonModelRenderer Body_Base = new PixelmonModelRenderer(this, 0, 110);
      Body_Base.addBox(-8F, 0F, -8F, 16, 2, 16);
      Body_Base.setTextureSize(256, 128);
      Body_Base.mirror = true;
      setRotation(Body_Base, 0F, -0.5235988F, 0F);
      PixelmonModelRenderer  Body_Front_Left = new PixelmonModelRenderer(this, 0, 90);
      Body_Front_Left.addBox(-4F, 0F, -4F, 8, 2, 4);
      Body_Front_Left.setRotationPoint(3F, 0F, -5F);
      Body_Front_Left.setTextureSize(256, 128);
      Body_Front_Left.mirror = true;
      setRotation(Body_Front_Left, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer  Body_Front_Right = new PixelmonModelRenderer(this, 0, 82);
      Body_Front_Right.addBox(-4F, 0F, -3F, 4, 2, 6);
      Body_Front_Right.setRotationPoint(-4F, 0F, -5F);
      Body_Front_Right.setTextureSize(256, 128);
      Body_Front_Right.mirror = true;
      setRotation(Body_Front_Right, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer  Body_Right_Middle = new PixelmonModelRenderer(this, 64, 120);
      Body_Right_Middle.addBox(-6F, 0F, -3F, 6, 2, 6);
      Body_Right_Middle.setRotationPoint(-6F, 0F, 4F);
      Body_Right_Middle.setTextureSize(256, 128);
      Body_Right_Middle.mirror = true;
      setRotation(Body_Right_Middle, 0F, -1.047198F, 0F);
      PixelmonModelRenderer  Body_left_middle = new PixelmonModelRenderer(this, 88, 119);
      Body_left_middle.addBox(0F, 0F, -3.5F, 5, 2, 7);
      Body_left_middle.setRotationPoint(5F, 0F, 3F);
      Body_left_middle.setTextureSize(256, 128);
      Body_left_middle.mirror = true;
      setRotation(Body_left_middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Body_Back_Left = new PixelmonModelRenderer(this, 24, 90);
      Body_Back_Left.addBox(0F, 0F, -2F, 3, 2, 4);
      Body_Back_Left.setRotationPoint(4F, 0F, 7F);
      Body_Back_Left.setTextureSize(256, 128);
      Body_Back_Left.mirror = true;
      setRotation(Body_Back_Left, 0F, -0.3490659F, 0F);
      PixelmonModelRenderer  Body_Back_Middle = new PixelmonModelRenderer(this, 112, 119);
      Body_Back_Middle.addBox(0F, 0F, -3.5F, 5, 2, 7);
      Body_Back_Middle.setRotationPoint(-2F, 0F, 5F);
      Body_Back_Middle.setTextureSize(256, 128);
      Body_Back_Middle.mirror = true;
      setRotation(Body_Back_Middle, 0F, -0.9599311F, 0F);
      PixelmonModelRenderer  Body_Right_Back = new PixelmonModelRenderer(this, 20, 82);
      Body_Right_Back.addBox(-3F, 0F, -3F, 3, 2, 6);
      Body_Right_Back.setRotationPoint(-4F, 0F, 5F);
      Body_Right_Back.setTextureSize(256, 128);
      Body_Right_Back.mirror = true;
      setRotation(Body_Right_Back, 0F, 0.3784989F, 0F);
      PixelmonModelRenderer  Body_Right_Front = new PixelmonModelRenderer(this, 0, 76);
      Body_Right_Front.addBox(-2F, 0F, -2F, 2, 2, 4);
      Body_Right_Front.setRotationPoint(-7F, 0F, -2F);
      Body_Right_Front.setTextureSize(256, 128);
      Body_Right_Front.mirror = true;
      setRotation(Body_Right_Front, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  Body_Base_Middle = new PixelmonModelRenderer(this, 0, 96);
      Body_Base_Middle.addBox(-5F, 0F, -6F, 10, 2, 12);
      Body_Base_Middle.setRotationPoint(0F, -2F, 0F);
      Body_Base_Middle.setTextureSize(256, 128);
      Body_Base_Middle.mirror = true;
      setRotation(Body_Base_Middle, 0F, -0.2617994F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Left = new PixelmonModelRenderer(this, 12, 74);
      Body_Base_Middle_Left.addBox(0F, 0F, -2F, 4, 2, 6);
      Body_Base_Middle_Left.setRotationPoint(4F, -2F, 0F);
      Body_Base_Middle_Left.setTextureSize(256, 128);
      Body_Base_Middle_Left.mirror = true;
      setRotation(Body_Base_Middle_Left, 0F, -0.7853982F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Back_Middle = new PixelmonModelRenderer(this, 64, 115);
      Body_Base_Middle_Back_Middle.addBox(-6F, 0F, -2F, 6, 2, 3);
      Body_Base_Middle_Back_Middle.setRotationPoint(4F, -2F, 5F);
      Body_Base_Middle_Back_Middle.setTextureSize(256, 128);
      Body_Base_Middle_Back_Middle.mirror = true;
      setRotation(Body_Base_Middle_Back_Middle, 0F, 0.3490659F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Back_Right = new PixelmonModelRenderer(this, 64, 110);
      Body_Base_Middle_Back_Right.addBox(-4F, 0F, 0F, 7, 2, 3);
      Body_Base_Middle_Back_Right.setRotationPoint(-2.5F, -2F, 3F);
      Body_Base_Middle_Back_Right.setTextureSize(256, 128);
      Body_Base_Middle_Back_Right.mirror = true;
      setRotation(Body_Base_Middle_Back_Right, 0F, -0.8726646F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Front_Right = new PixelmonModelRenderer(this, 136, 120);
      Body_Base_Middle_Front_Right.addBox(-3F, 0F, -3F, 3, 2, 6);
      Body_Base_Middle_Front_Right.setRotationPoint(-2F, -2F, -4F);
      Body_Base_Middle_Front_Right.setTextureSize(256, 128);
      Body_Base_Middle_Front_Right.mirror = true;
      setRotation(Body_Base_Middle_Front_Right, 0F, -0.6108652F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Front_Left = new PixelmonModelRenderer(this, 84, 110);
      Body_Base_Middle_Front_Left.addBox(-2F, 0F, -3F, 4, 2, 3);
      Body_Base_Middle_Front_Left.setRotationPoint(2F, -2F, -4F);
      Body_Base_Middle_Front_Left.setTextureSize(256, 128);
      Body_Base_Middle_Front_Left.mirror = true;
      setRotation(Body_Base_Middle_Front_Left, 0F, -0.5235988F, 0F);
      PixelmonModelRenderer  Body_Base_Tip_Front = new PixelmonModelRenderer(this, 154, 120);
      Body_Base_Tip_Front.addBox(-9F, 0F, -9F, 8, 1, 7);
      Body_Base_Tip_Front.setRotationPoint(9F, 1F, 5F);
      Body_Base_Tip_Front.setTextureSize(256, 128);
      Body_Base_Tip_Front.mirror = true;
      setRotation(Body_Base_Tip_Front, 0F, -0.6108652F, 0F);
      PixelmonModelRenderer  Body_Back_Tip_Middle = new PixelmonModelRenderer(this, 44, 102);
      Body_Back_Tip_Middle.addBox(0F, 0F, -3.5F, 5, 1, 7);
      Body_Back_Tip_Middle.setRotationPoint(3F,1F, 6F);
      Body_Back_Tip_Middle.setTextureSize(256, 128);
      Body_Back_Tip_Middle.mirror = true;
      setRotation(Body_Back_Tip_Middle, 0F, -0.8726646F, 0F);
      PixelmonModelRenderer  Body_Front_Left_Tip_Right = new PixelmonModelRenderer(this, 68, 102);
      Body_Front_Left_Tip_Right.addBox(-3F, 0F, -7F, 6, 1, 7);
      Body_Front_Left_Tip_Right.setRotationPoint(4F, 1F, -5F);
      Body_Front_Left_Tip_Right.setTextureSize(256, 128);
      Body_Front_Left_Tip_Right.mirror = true;
      setRotation(Body_Front_Left_Tip_Right, 0F, 0.4363323F, 0F);
      PixelmonModelRenderer  Body_Front_Left_Tip_Left = new PixelmonModelRenderer(this, 12, 69);
      Body_Front_Left_Tip_Left.addBox(0F, 0F, -2F, 6, 1, 4);
      Body_Front_Left_Tip_Left.setRotationPoint(4F, 1F, -4F);
      Body_Front_Left_Tip_Left.setTextureSize(256, 128);
      Body_Front_Left_Tip_Left.mirror = true;
      setRotation(Body_Front_Left_Tip_Left, 0F, 0.8726646F, 0F);
      PixelmonModelRenderer  Body_Left_Middle_Tip = new PixelmonModelRenderer(this, 44, 94);
      Body_Left_Middle_Tip.addBox(0F, 0F, -3.5F, 5, 1, 7);
      Body_Left_Middle_Tip.setRotationPoint(6F, 1F, 5F);
      Body_Left_Middle_Tip.setTextureSize(256, 128);
      Body_Left_Middle_Tip.mirror = true;
      setRotation(Body_Left_Middle_Tip, 0F, 0.3490659F, 0F);
      PixelmonModelRenderer  Body_Right_Back_Tip = new PixelmonModelRenderer(this, 68, 95);
      Body_Right_Back_Tip.addBox(-3F, 0F, -3F, 3, 1, 6);
      Body_Right_Back_Tip.setRotationPoint(-2.5F, 1F, 8.5F);
      Body_Right_Back_Tip.setTextureSize(256, 128);
      Body_Right_Back_Tip.mirror = true;
      setRotation(Body_Right_Back_Tip, 0F, 0.7853982F, 0F);
      PixelmonModelRenderer  Body_Right_Back_Tip2 = new PixelmonModelRenderer(this, 86, 95);
      Body_Right_Back_Tip2.addBox(-3F, 0F, -3F, 3, 1, 6);
      Body_Right_Back_Tip2.setRotationPoint(-6F, 1F, 6F);
      Body_Right_Back_Tip2.setTextureSize(256, 128);
      Body_Right_Back_Tip2.mirror = true;
      setRotation(Body_Right_Back_Tip2, 0F, 0.3784989F, 0F);
      PixelmonModelRenderer  Body_Right_Middle_Tip = new PixelmonModelRenderer(this, 12, 62);
      Body_Right_Middle_Tip.addBox(-4F, 0F, -3F, 4, 1, 6);
      Body_Right_Middle_Tip.setRotationPoint(-9F, 1F, 1F);
      Body_Right_Middle_Tip.setTextureSize(256, 128);
      Body_Right_Middle_Tip.mirror = true;
      setRotation(Body_Right_Middle_Tip, 0F, 0.2617994F, 0F);
      PixelmonModelRenderer  Body_Right_Front_Tip = new PixelmonModelRenderer(this, 12, 55);
      Body_Right_Front_Tip.addBox(-4F, 0F, -3F, 4, 1, 6);
      Body_Right_Front_Tip.setRotationPoint(-6F, 1F, -5F);
      Body_Right_Front_Tip.setTextureSize(256, 128);
      Body_Right_Front_Tip.mirror = true;
      setRotation(Body_Right_Front_Tip, 0F, -0.4363323F, 0F);
      PixelmonModelRenderer  Body_Right_Tip_Front = new PixelmonModelRenderer(this, 98, 104);
      Body_Right_Tip_Front.addBox(-9F, 0F, -9F, 4, 1, 14);
      Body_Right_Tip_Front.setRotationPoint(-2F, 1F, 0F);
      Body_Right_Tip_Front.setTextureSize(256, 128);
      Body_Right_Tip_Front.mirror = true;
      setRotation(Body_Right_Tip_Front, 0F, -0.7853982F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Front_Right_Tip = new PixelmonModelRenderer(this, 44, 87);
      Body_Base_Middle_Front_Right_Tip.addBox(-5F, 0F, -3F, 5, 1, 6);
      Body_Base_Middle_Front_Right_Tip.setRotationPoint(-1F, -1F, -4F);
      Body_Base_Middle_Front_Right_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Front_Right_Tip.mirror = true;
      setRotation(Body_Base_Middle_Front_Right_Tip, 0F, -0.8726646F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Front_Left_Tip = new PixelmonModelRenderer(this, 12, 50);
      Body_Base_Middle_Front_Left_Tip.addBox(-3F, 0F, -4F, 6, 1, 4);
      Body_Base_Middle_Front_Left_Tip.setRotationPoint(2F, -1F, -4F);
      Body_Base_Middle_Front_Left_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Front_Left_Tip.mirror = true;
      setRotation(Body_Base_Middle_Front_Left_Tip, 0F, -0.7853982F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Left_Tip = new PixelmonModelRenderer(this, 68, 86);
      Body_Base_Middle_Left_Tip.addBox(0F, 0F, -4F, 6, 1, 8);
      Body_Base_Middle_Left_Tip.setRotationPoint(3F, -1F, 1F);
      Body_Base_Middle_Left_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Left_Tip.mirror = true;
      setRotation(Body_Base_Middle_Left_Tip, 0F, 0.4363323F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Back_Middle_Tip = new PixelmonModelRenderer(this, 104, 99);
      Body_Base_Middle_Back_Middle_Tip.addBox(-4.5F, 0F, 0F, 9, 1, 4);
      Body_Base_Middle_Back_Middle_Tip.setRotationPoint(3F, -1F, 4F);
      Body_Base_Middle_Back_Middle_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Back_Middle_Tip.mirror = true;
      setRotation(Body_Base_Middle_Back_Middle_Tip, 0F, 0.9599311F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Right_Front_Tip = new PixelmonModelRenderer(this, 44, 80);
      Body_Base_Middle_Right_Front_Tip.addBox(-5F, 0F, -3F, 5, 1, 6);
      Body_Base_Middle_Right_Front_Tip.setRotationPoint(-3F, -1F, -1F);
      Body_Base_Middle_Right_Front_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Right_Front_Tip.mirror = true;
      setRotation(Body_Base_Middle_Right_Front_Tip, 0F, -0.4363323F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Back_Right_Tip = new PixelmonModelRenderer(this, 104, 95);
      Body_Base_Middle_Back_Right_Tip.addBox(-3F, 0F, 0F, 6, 1, 3);
      Body_Base_Middle_Back_Right_Tip.setRotationPoint(-1F, -1F, 6F);
      Body_Base_Middle_Back_Right_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Back_Right_Tip.mirror = true;
      setRotation(Body_Base_Middle_Back_Right_Tip, 0F, -0.5235988F, 0F);
      PixelmonModelRenderer  Body_Base_Middle_Right_Back_Tip = new PixelmonModelRenderer(this, 96, 91);
      Body_Base_Middle_Right_Back_Tip.addBox(-4F, 0F, 0F, 7, 1, 3);
      Body_Base_Middle_Right_Back_Tip.setRotationPoint(-4.5F, -1F, 3F);
      Body_Base_Middle_Right_Back_Tip.setTextureSize(256, 128);
      Body_Base_Middle_Right_Back_Tip.mirror = true;
      setRotation(Body_Base_Middle_Right_Back_Tip, 0F, -1.48353F, 0F);
      PixelmonModelRenderer  Mouth_Bottom_Middle = new PixelmonModelRenderer(this, 224, 0);
      Mouth_Bottom_Middle.addBox(-4F, 0F, -6F, 8, 2, 8);
      Mouth_Bottom_Middle.setRotationPoint(0F, -4F, -1F);
      Mouth_Bottom_Middle.setTextureSize(256, 128);
      Mouth_Bottom_Middle.mirror = true;
      setRotation(Mouth_Bottom_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Bottom_Front = new PixelmonModelRenderer(this, 210, 0);
      Mouth_Bottom_Front.addBox(-3F, 0F, -1F, 6, 2, 1);
      Mouth_Bottom_Front.setRotationPoint(0F, -4F, -7F);
      Mouth_Bottom_Front.setTextureSize(256, 128);
      Mouth_Bottom_Front.mirror = true;
      setRotation(Mouth_Bottom_Front, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Bottom_Left = new PixelmonModelRenderer(this, 238, 10);
      Mouth_Bottom_Left.addBox(0F, 0F, -3.5F, 2, 2, 7);
      Mouth_Bottom_Left.setRotationPoint(3F, -4F, -2.5F);
      Mouth_Bottom_Left.setTextureSize(256, 128);
      Mouth_Bottom_Left.mirror = true;
      setRotation(Mouth_Bottom_Left, 0F, 0F, 0F);
      PixelmonModelRenderer      Mouth_Bottom_Right = new PixelmonModelRenderer(this, 238, 10);
      Mouth_Bottom_Right.addBox(-2F, 0F, -3.5F, 2, 2, 7);
      Mouth_Bottom_Right.setRotationPoint(-3F, -4F, -2.5F);
      Mouth_Bottom_Right.setTextureSize(256, 128);
      Mouth_Bottom_Right.mirror = true;
      setRotation(Mouth_Bottom_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Bottom_Front_Tip = new PixelmonModelRenderer(this, 228, 10);
      Mouth_Bottom_Front_Tip.addBox(-2F, 0F, -2F, 4, 1, 1);
      Mouth_Bottom_Front_Tip.setRotationPoint(0F, -4F, -7F);
      Mouth_Bottom_Front_Tip.setTextureSize(256, 128);
      Mouth_Bottom_Front_Tip.mirror = true;
      setRotation(Mouth_Bottom_Front_Tip, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Middle = new PixelmonModelRenderer(this, 234, 19);
      Mouth_Middle.addBox(-4F, 0F, -1F, 8, 8, 3);
      Mouth_Middle.setRotationPoint(0F, -9F, 1F);
      Mouth_Middle.setTextureSize(256, 128);
      Mouth_Middle.mirror = true;
      setRotation(Mouth_Middle, 0.1745329F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Back = new PixelmonModelRenderer(this, 232, 30);
      Mouth_Back.addBox(-4F, 0F, -2F, 8, 12, 4);
      Mouth_Back.setRotationPoint(0F, -10F, 1.5F);
      Mouth_Back.setTextureSize(256, 128);
      Mouth_Back.mirror = true;
      setRotation(Mouth_Back, 0.4363323F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Middle_Left = new PixelmonModelRenderer(this, 248, 46);
      Mouth_Middle_Left.addBox(0F, 0F, -2F, 1, 8, 3);
      Mouth_Middle_Left.setRotationPoint(4F, -9F, 1F);
      Mouth_Middle_Left.setTextureSize(256, 128);
      Mouth_Middle_Left.mirror = true;
      setRotation(Mouth_Middle_Left, 0.1745329F, 0F, 0F);
      PixelmonModelRenderer  Tongue = new PixelmonModelRenderer(this, 184, 0);
      Tongue.addBox(-2.5F, 0F, -8F, 5, 1, 8);
      Tongue.setRotationPoint(0F, -5F, 1F);
      Tongue.setTextureSize(256, 128);
      Tongue.mirror = true;
      setRotation(Tongue, 0.0872665F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Middle_Right = new PixelmonModelRenderer(this, 248, 46);
      Mouth_Middle_Right.addBox(-1F, 0F, -2F, 1, 8, 3);
      Mouth_Middle_Right.setRotationPoint(-4F, -9F, 1F);
      Mouth_Middle_Right.setTextureSize(256, 128);
      Mouth_Middle_Right.mirror = true;
      setRotation(Mouth_Middle_Right, 0.1745329F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Top_Middle = new PixelmonModelRenderer(this, 150, 0);
      Mouth_Top_Middle.addBox(-4F, -3F, -9F, 8, 3, 9);
      Mouth_Top_Middle.setRotationPoint(0F, -7F, 2F);
      Mouth_Top_Middle.setTextureSize(256, 128);
      Mouth_Top_Middle.mirror = true;
      setRotation(Mouth_Top_Middle, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Top_Front = new PixelmonModelRenderer(this, 136, 0);
      Mouth_Top_Front.addBox(-3F, -1.5F, -1F, 6, 3, 1);
      Mouth_Top_Front.setRotationPoint(0F, -10.7F, -6F);
      Mouth_Top_Front.setTextureSize(256, 128);
      Mouth_Top_Front.mirror = true;
      setRotation(Mouth_Top_Front, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Top_Top = new PixelmonModelRenderer(this, 184, 9);
      Mouth_Top_Top.addBox(-3F, -3F, -7F, 6, 1, 7);
      Mouth_Top_Top.setRotationPoint(0F, -8F, 1F);
      Mouth_Top_Top.setTextureSize(256, 128);
      Mouth_Top_Top.mirror = true;
      setRotation(Mouth_Top_Top, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Top_Left = new PixelmonModelRenderer(this, 184, 17);
      Mouth_Top_Left.addBox(0F, -2F, -8F, 1, 2, 7);
      Mouth_Top_Left.setRotationPoint(4F, -7F, 2F);
      Mouth_Top_Left.setTextureSize(256, 128);
      Mouth_Top_Left.mirror = true;
      setRotation(Mouth_Top_Left, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Middle_Left2 = new PixelmonModelRenderer(this, 200, 17);
      Mouth_Middle_Left2.addBox(0F, 0F, -1.5F, 2, 10, 3);
      Mouth_Middle_Left2.setRotationPoint(2.5F, -9F, 1.4F);
      Mouth_Middle_Left2.setTextureSize(256, 128);
      Mouth_Middle_Left2.mirror = true;
      setRotation(Mouth_Middle_Left2, 0F, 0F, -0.2617994F);
      PixelmonModelRenderer  Mouth_Middle_Left_Back = new PixelmonModelRenderer(this, 200, 30);
      Mouth_Middle_Left_Back.addBox(0F, 0F, -1.5F, 2, 8, 3);
      Mouth_Middle_Left_Back.setRotationPoint(3F, -8F, 2F);
      Mouth_Middle_Left_Back.setTextureSize(256, 128);
      Mouth_Middle_Left_Back.mirror = true;
      setRotation(Mouth_Middle_Left_Back, 0F, -0.7853982F, -0.2617994F);
      PixelmonModelRenderer  Mouth_Middle_Right2 = new PixelmonModelRenderer(this, 200, 17);
      Mouth_Middle_Right2.addBox(-2F, 0F, -1.5F, 2, 10, 3);
      Mouth_Middle_Right2.setRotationPoint(-2.5F, -9F, 1.4F);
      Mouth_Middle_Right2.setTextureSize(256, 128);
      Mouth_Middle_Right2.mirror = true;
      setRotation(Mouth_Middle_Right2, 0F, 0F, 0.2617994F);
      PixelmonModelRenderer  Mouth_Middle_Right_Back = new PixelmonModelRenderer(this, 200, 30);
      Mouth_Middle_Right_Back.addBox(-2F, 0F, -1.5F, 2, 8, 3);
      Mouth_Middle_Right_Back.setRotationPoint(-3F, -8F, 2F);
      Mouth_Middle_Right_Back.setTextureSize(256, 128);
      Mouth_Middle_Right_Back.mirror = true;
      setRotation(Mouth_Middle_Right_Back, 0F, 0.7853982F, 0.2617994F);
      PixelmonModelRenderer  Mouth_Top_Right = new PixelmonModelRenderer(this, 184, 17);
      Mouth_Top_Right.addBox(-1F, -2F, -8F, 1, 2, 7);
      Mouth_Top_Right.setRotationPoint(-4F, -7F, 2F);
      Mouth_Top_Right.setTextureSize(256, 128);
      Mouth_Top_Right.mirror = true;
      setRotation(Mouth_Top_Right, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Top_Front_Tip = new PixelmonModelRenderer(this, 228, 12);
      Mouth_Top_Front_Tip.addBox(-2F, 0F, -1F, 4, 2, 1);
      Mouth_Top_Front_Tip.setRotationPoint(0F, -11.5F, -6.5F);
      Mouth_Top_Front_Tip.setTextureSize(256, 128);
      Mouth_Top_Front_Tip.mirror = true;
      setRotation(Mouth_Top_Front_Tip, -0.2617994F, 0F, 0F);
      PixelmonModelRenderer      Mouth_Link_Top_Right = new PixelmonModelRenderer(this, 146, 4);
      Mouth_Link_Top_Right.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Mouth_Link_Top_Right.setRotationPoint(-4F,-10F, -4F);
      Mouth_Link_Top_Right.setTextureSize(256, 128);
      Mouth_Link_Top_Right.mirror = true;
      setRotation(Mouth_Link_Top_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Link_Bottom_Right = new PixelmonModelRenderer(this, 142, 4);
      Mouth_Link_Bottom_Right.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Mouth_Link_Bottom_Right.setRotationPoint(-4F, -7F, -4F);
      Mouth_Link_Bottom_Right.setTextureSize(256, 128);
      Mouth_Link_Bottom_Right.mirror = true;
      setRotation(Mouth_Link_Bottom_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Link_Top_Left = new PixelmonModelRenderer(this, 146, 4);
      Mouth_Link_Top_Left.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Mouth_Link_Top_Left.setRotationPoint(4F, -10F, -4F);
      Mouth_Link_Top_Left.setTextureSize(256, 128);
      Mouth_Link_Top_Left.mirror = true;
      setRotation(Mouth_Link_Top_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Link_Bottom_Left = new PixelmonModelRenderer(this, 142, 4);
      Mouth_Link_Bottom_Left.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
      Mouth_Link_Bottom_Left.setRotationPoint(4F, -7F, -4F);
      Mouth_Link_Bottom_Left.setTextureSize(256, 128);
      Mouth_Link_Bottom_Left.mirror = true;
      setRotation(Mouth_Link_Bottom_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Eye_Right = new PixelmonModelRenderer(this, 184, 28);
      Eye_Right.addBox(-1F, -1F, -2F, 1, 2, 4);
      Eye_Right.setRotationPoint(-4F, -11F, -5F);
      Eye_Right.setTextureSize(256, 128);
      Eye_Right.mirror = true;
      setRotation(Eye_Right, -0.2617994F, -0.2617994F, 0.1745329F);
      PixelmonModelRenderer  Eye_Left = new PixelmonModelRenderer(this, 184, 26);
      Eye_Left.addBox(0F, -1F, -2F, 1, 2, 4);
      Eye_Left.setRotationPoint(4F, -11F, -5F);
      Eye_Left.setTextureSize(256, 128);
      Eye_Left.mirror = true;
      setRotation(Eye_Left, -0.2617994F, 0.2617994F, -0.1745329F);
      Body.addChild(Body_Base);
      Body.addChild(Body_Front_Left);
      Body.addChild(Body_Front_Right);
      Body.addChild(Body_Right_Middle);
      Body.addChild(Body_left_middle);
      Body.addChild(Body_Back_Left);
      Body.addChild(Body_Back_Middle);
      Body.addChild(Body_Right_Back);
      Body.addChild(Body_Right_Front);
      Body.addChild(Body_Base_Middle);
      Body.addChild(Body_Base_Middle_Left);
      Body.addChild(Body_Base_Middle_Back_Middle);
      Body.addChild(Body_Base_Middle_Back_Right);
      Body.addChild(Body_Base_Middle_Front_Right);
      Body.addChild(Body_Base_Middle_Front_Left);
      Body.addChild(Body_Base_Tip_Front);
      Body.addChild(Body_Back_Tip_Middle);
      Body.addChild(Body_Front_Left_Tip_Right);
      Body.addChild(Body_Front_Left_Tip_Left);
      Body.addChild(Body_Left_Middle_Tip);
      Body.addChild(Body_Right_Back_Tip);
      Body.addChild(Body_Right_Back_Tip2);
      Body.addChild(Body_Right_Middle_Tip);
      Body.addChild(Body_Right_Front_Tip);
      Body.addChild(Body_Right_Tip_Front);
      Body.addChild(Body_Base_Middle_Front_Right_Tip);
      Body.addChild(Body_Base_Middle_Front_Left_Tip);
      Body.addChild(Body_Base_Middle_Left_Tip);
      Body.addChild(Body_Base_Middle_Back_Middle_Tip);
      Body.addChild(Body_Base_Middle_Right_Front_Tip);
      Body.addChild(Body_Base_Middle_Back_Right_Tip);
      Body.addChild(Body_Base_Middle_Right_Back_Tip);
      Body.addChild(Mouth_Bottom_Middle);
      Body.addChild(Mouth_Bottom_Front);
      Body.addChild(Mouth_Bottom_Left);
      Body.addChild(Mouth_Bottom_Right);
      Body.addChild(Mouth_Bottom_Front_Tip);
      Body.addChild(Mouth_Middle);
      Body.addChild(Mouth_Back);
      Body.addChild(Mouth_Middle_Left);
      Body.addChild(Tongue);
      Body.addChild(Mouth_Middle_Right);
      Body.addChild(Mouth_Top_Middle);
      Body.addChild(Mouth_Top_Front);
      Body.addChild(Mouth_Top_Top);
      Body.addChild(Mouth_Top_Left);
      Body.addChild(Mouth_Middle_Left2);
      Body.addChild(Mouth_Middle_Left_Back);
      Body.addChild(Mouth_Middle_Right2);
      Body.addChild(Mouth_Middle_Right_Back);
      Body.addChild(Mouth_Top_Right);
      Body.addChild(Mouth_Top_Front_Tip);
      Body.addChild(Mouth_Link_Top_Right);
      Body.addChild(Mouth_Link_Bottom_Right);
      Body.addChild(Mouth_Link_Top_Left);
      Body.addChild(Mouth_Link_Bottom_Left);
      Body.addChild(Eye_Right);
      Body.addChild(Eye_Left);
      
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(4, -4, 3);
      PixelmonModelRenderer Arm_Base_Left = new PixelmonModelRenderer(this, 172, 12);
      Arm_Base_Left.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
      Arm_Base_Left.setTextureSize(256, 128);
      Arm_Base_Left.mirror = true;
      setRotation(Arm_Base_Left, 1.047198F, -0.7853982F, 0F);
      PixelmonModelRenderer Arm_Middle_Left = new PixelmonModelRenderer(this, 172, 21);
      Arm_Middle_Left.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
      Arm_Middle_Left.setRotationPoint(3F, -2.5F, -3F);
      Arm_Middle_Left.setTextureSize(256, 128);
      Arm_Middle_Left.mirror = true;
      setRotation(Arm_Middle_Left, 1.047198F, -0.2617994F, -0.2617994F);
      PixelmonModelRenderer Palm_Left = new PixelmonModelRenderer(this, 232, 46);
      Palm_Left.addBox(-2F, -2F, 0F, 4, 2, 4);
      Palm_Left.setRotationPoint(4F, -5F, -7F);
      Palm_Left.setTextureSize(256, 128);
      Palm_Left.mirror = true;
      setRotation(Palm_Left, 1.902306F, -0.2617994F, -0.2617994F);
      PixelmonModelRenderer Finger_2nd_Left = new PixelmonModelRenderer(this, 228, 15);
      Finger_2nd_Left.addBox(-1F, -0.5F, 0F, 2, 1, 3);
      Finger_2nd_Left.setRotationPoint(4F, -8F, -9.5F);
      Finger_2nd_Left.setTextureSize(256, 128);
      Finger_2nd_Left.mirror = true;
      setRotation(Finger_2nd_Left, 2.617994F, -0.2617994F, -0.2617994F);
      PixelmonModelRenderer Finger_1st_Left = new PixelmonModelRenderer(this, 228, 15);
      Finger_1st_Left.addBox(-1F, -0.5F, 0F, 2, 1, 3);
      Finger_1st_Left.setRotationPoint(5.5F, -7F, -8.5F);
      Finger_1st_Left.setTextureSize(256, 128);
      Finger_1st_Left.mirror = true;
      setRotation(Finger_1st_Left, 2.617994F, 0F, 1.047198F);
      PixelmonModelRenderer Finger_3rd_Left = new PixelmonModelRenderer(this, 228, 15);
      Finger_3rd_Left.addBox(-1F, -0.5F, 0F, 2, 1, 3);
      Finger_3rd_Left.setRotationPoint(3F, -6F, -9.5F);
      Finger_3rd_Left.setTextureSize(256, 128);
      Finger_3rd_Left.mirror = true;
      setRotation(Finger_3rd_Left, 2.617994F, 0F, -1.308997F);
      LeftArm.addChild(Arm_Base_Left);
      LeftArm.addChild(Arm_Middle_Left);
      LeftArm.addChild(Palm_Left);
      LeftArm.addChild(Finger_2nd_Left);
      LeftArm.addChild(Finger_1st_Left);
      LeftArm.addChild(Finger_3rd_Left);
      Body.addChild(LeftArm);
      
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-6, -3, 3);
      PixelmonModelRenderer Arm_Base_Right = new PixelmonModelRenderer(this, 172, 12);
      Arm_Base_Right.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
      Arm_Base_Right.setTextureSize(256, 128);
      Arm_Base_Right.mirror = true;
      setRotation(Arm_Base_Right, 1.570796F, 0.3490659F, 0F);
      PixelmonModelRenderer      Arm_Middle_Right = new PixelmonModelRenderer(this, 172, 21);
      Arm_Middle_Right.addBox(-1.5F, -6F, -1.5F, 3, 6, 3);
      Arm_Middle_Right.setRotationPoint(-2F, 0F, -5F);
      Arm_Middle_Right.setTextureSize(256, 128);
      Arm_Middle_Right.mirror = true;
      setRotation(Arm_Middle_Right, 1.832596F, 0.1745329F, 0F);
      PixelmonModelRenderer Palm_Right = new PixelmonModelRenderer(this, 232, 46);
      Palm_Right.addBox(-2F, -2F, 0F, 4, 2, 4);
      Palm_Right.setRotationPoint(-3F, 1F, -10F);
      Palm_Right.setTextureSize(256, 128);
      Palm_Right.mirror = true;
      setRotation(Palm_Right, 3.141593F, 0F, 0F);
      PixelmonModelRenderer Finger_1st_Right = new PixelmonModelRenderer(this, 228, 15);
      Finger_1st_Right.addBox(-1F, -0.5F, -3F, 2, 1, 3);
      Finger_1st_Right.setRotationPoint(-2F, 2F, -13.5F);
      Finger_1st_Right.setTextureSize(256, 128);
      Finger_1st_Right.mirror = true;
      setRotation(Finger_1st_Right, 0.5235988F, -0.4363323F, 0F);
      PixelmonModelRenderer Finger_2nd_Right = new PixelmonModelRenderer(this, 210, 3);
      Finger_2nd_Right.addBox(-1.5F, -0.5F, -3F, 3, 1, 3);
      Finger_2nd_Right.setRotationPoint(-3.7F, 2F, -12.7F);
      Finger_2nd_Right.setTextureSize(256, 128);
      Finger_2nd_Right.mirror = true;
      setRotation(Finger_2nd_Right, 0.5235988F, 0.6981317F, 0F);
      RightArm.addChild(Arm_Base_Right);
      RightArm.addChild(Arm_Middle_Right);
      RightArm.addChild(Palm_Right);
      RightArm.addChild(Finger_1st_Right);
      RightArm.addChild(Finger_2nd_Right);
      Body.addChild(RightArm);
      

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right);

		skeleton = new SkeletonBiped(Body, null, leftArmModule,
				rightArmModule, null, null);
      
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
