package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSpearow extends ModelBase {
	// fields
	ModelRenderer Body1;
	ModelRenderer Body2;
	ModelRenderer Body3;
	ModelRenderer Body4;
	ModelRenderer Body5;
	ModelRenderer Body6;
	ModelRenderer ThighR;
	ModelRenderer ThighL;
	ModelRenderer Body7;
	ModelRenderer Chest1;
	ModelRenderer TailFeather;
	ModelRenderer TailFeatherR;
	ModelRenderer TailFeatherL;
	ModelRenderer TailFeatherL1;
	ModelRenderer TailFeatherR2;
	ModelRenderer Bum;
	ModelRenderer LegL;
	ModelRenderer LegR;
	ModelRenderer AnkleR;
	ModelRenderer AnkleL;
	ModelRenderer RToe;
	ModelRenderer LToe;
	ModelRenderer LToe1;
	ModelRenderer RToe1;
	ModelRenderer RToeR;
	ModelRenderer LToe2;
	ModelRenderer LFeather;
	ModelRenderer Rwing;
	ModelRenderer Lwing;
	ModelRenderer Rfeather;
	ModelRenderer Lwing1;
	ModelRenderer Rwing1;
	ModelRenderer Rwing2;
	ModelRenderer Lwing2;
	ModelRenderer Rfeather1;
	ModelRenderer Lfeather1;
	ModelRenderer Rfeather2;
	ModelRenderer Lfeather2;
	ModelRenderer Rfeather3;
	ModelRenderer Lfeather3;
	ModelRenderer Lclaw;
	ModelRenderer Rclaw;
	ModelRenderer Lclaw1;
	ModelRenderer Rclaw1;
	ModelRenderer Rclaw2;
	ModelRenderer Lclaw2;
	ModelRenderer Neck2;
	ModelRenderer Beak1;
	ModelRenderer Beak2;
	ModelRenderer Beak3;
	ModelRenderer Beak4;
	ModelRenderer Beak5;
	ModelRenderer Head;
	ModelRenderer Beak6;
	ModelRenderer Beak7;
	ModelRenderer Head2;
	ModelRenderer Head3;
	ModelRenderer Head4;
	ModelRenderer Eye1;
	ModelRenderer Eye2;
	ModelRenderer Mane1;
	ModelRenderer Mane2;
	ModelRenderer Mane3;
	ModelRenderer Mane4;
	ModelRenderer Mane5;
	ModelRenderer Head5;
	ModelRenderer Mane6;
	ModelRenderer Mane7;
	ModelRenderer Mane8;
	ModelRenderer Mane9;
	ModelRenderer Mane10;
	ModelRenderer Mane11;
	ModelRenderer Mane12;
	ModelRenderer Mane13;
	ModelRenderer Mane14;
	ModelRenderer Face;
	ModelRenderer Forehead;
	ModelRenderer HeadBase;
	ModelRenderer LeftLeg;
	ModelRenderer RightLeg;

	public ModelSpearow() {
		textureWidth = 128;
		textureHeight = 128;

		Body1 = new ModelRenderer(this, 0, 38);
		Body1.addBox(-3F, -0.2F, 0F, 6, 6, 10);
		Body1.setRotationPoint(0F, 11F, -3F);
		Body1.setTextureSize(128, 128);
		Body1.mirror = true;
		setRotation(Body1, -0.296706F, 0F, 0F);
		Body2 = new ModelRenderer(this, 0, 32);
		Body2.addBox(-2.5F, -2.5F, 0F, 5, 2, 3);
		Body2.setRotationPoint(0F, 16.7F, -4.4F);
		Body2.setTextureSize(128, 128);
		Body2.mirror = true;
		setRotation(Body2, 0.418879F, 0F, 0F);
		Body3 = new ModelRenderer(this, 0, 56);
		Body3.addBox(-3F, -0.5F, 0F, 6, 1, 2);
		Body3.setRotationPoint(0F, 16.7F, -3.6F);
		Body3.setTextureSize(128, 128);
		Body3.mirror = true;
		setRotation(Body3, -0.296706F, 0F, 0F);
		Body4 = new ModelRenderer(this, 3, 63);
		Body4.addBox(-3.5F, -3.2F, 1F, 7, 5, 6);
		Body4.setRotationPoint(0F, 16.3F, -2.666667F);
		Body4.setTextureSize(128, 128);
		Body4.mirror = true;
		setRotation(Body4, -0.296706F, 0F, 0F);
		Body5 = new ModelRenderer(this, 0, 93);
		Body5.addBox(-2F, -0.5F, -1.1F, 4, 1, 11);
		Body5.setRotationPoint(0F, 11.4F, 0F);
		Body5.setTextureSize(128, 128);
		Body5.mirror = true;
		setRotation(Body5, -0.3490659F, 0F, 0F);
		Body6 = new ModelRenderer(this, 0, 83);
		Body6.addBox(-2F, -0.5F, -0.5F, 4, 5, 3);
		Body6.setRotationPoint(0F, 14F, 5F);
		Body6.setTextureSize(128, 128);
		Body6.mirror = true;
		setRotation(Body6, -0.296706F, 0F, 0F);
		Body7 = new ModelRenderer(this, 0, 75);
		Body7.addBox(-1.5F, -0.5F, -1.5F, 3, 4, 3);
		Body7.setRotationPoint(0F, 14.6F, 6.5F);
		Body7.setTextureSize(128, 128);
		Body7.mirror = true;
		setRotation(Body7, 0F, 0F, 0F);
		Chest1 = new ModelRenderer(this, 16, 77);
		Chest1.addBox(-2.5F, 0.5F, 0F, 5, 4, 5);
		Chest1.setRotationPoint(0F, 10F, -5.9F);
		Chest1.setTextureSize(128, 128);
		Chest1.mirror = true;
		setRotation(Chest1, 0.1099557F, 0F, 0F);
		TailFeather = new ModelRenderer(this, 75, 0);
		TailFeather.addBox(-1F, -0.5F, -2F, 2, 1, 6);
		TailFeather.setRotationPoint(0F, 14.2F, 10F);
		TailFeather.setTextureSize(128, 128);
		TailFeather.mirror = true;
		setRotation(TailFeather, 0.0698132F, 0F, 0F);
		TailFeatherR = new ModelRenderer(this, 72, 0);
		TailFeatherR.addBox(-0.5F, -0.5F, 0F, 2, 1, 6);
		TailFeatherR.setRotationPoint(0F, 15F, 7F);
		TailFeatherR.setTextureSize(128, 128);
		TailFeatherR.mirror = true;
		setRotation(TailFeatherR, 0.0523599F, 0.3839724F, 0F);
		TailFeatherL = new ModelRenderer(this, 77, 0);
		TailFeatherL.addBox(-1.5F, -0.5F, 0F, 2, 1, 6);
		TailFeatherL.setRotationPoint(0F, 15F, 7F);
		TailFeatherL.setTextureSize(128, 128);
		TailFeatherL.mirror = true;
		setRotation(TailFeatherL, 0.0523599F, -0.3839724F, 0F);
		TailFeatherL1 = new ModelRenderer(this, 78, 0);
		TailFeatherL1.addBox(-0.5F, -0.5F, -1F, 2, 1, 5);
		TailFeatherL1.setRotationPoint(-2.5F, 15.53F, 7F);
		TailFeatherL1.setTextureSize(128, 128);
		TailFeatherL1.mirror = true;
		setRotation(TailFeatherL1, 0.0174533F, -0.3141593F, 0F);
		TailFeatherR2 = new ModelRenderer(this, 70, 0);
		TailFeatherR2.addBox(-1.5F, -0.5F, -2F, 2, 1, 6);
		TailFeatherR2.setRotationPoint(2.5F, 15.5F, 7F);
		TailFeatherR2.setTextureSize(128, 128);
		TailFeatherR2.mirror = true;
		setRotation(TailFeatherR2, 0.0174533F, 0.3141593F, 0F);
		Bum = new ModelRenderer(this, 0, 12);
		Bum.addBox(-1F, -0.5F, 0F, 2, 2, 3);
		Bum.setRotationPoint(0F, 16F, 6.7F);
		Bum.setTextureSize(128, 128);
		Bum.mirror = true;
		setRotation(Bum, 0.4886922F, 0F, 0F);
		LFeather = new ModelRenderer(this, 85, 89);
		LFeather.addBox(-0.5F, -0.5F, -2F, 1, 1, 8);
		LFeather.setRotationPoint(-3.7F, 15.4F, 1F);
		LFeather.setTextureSize(128, 128);
		LFeather.mirror = true;
		setRotation(LFeather, 0F, 0F, 0F);
		Rwing = new ModelRenderer(this, 70, 66);
		Rwing.addBox(-0.5F, -0.5F, 0F, 1, 5, 5);
		Rwing.setRotationPoint(3.5F, 11F, -1F);
		Rwing.setTextureSize(128, 128);
		Rwing.mirror = true;
		setRotation(Rwing, -0.1919862F, 0F, 0F);
		Lwing = new ModelRenderer(this, 70, 66);
		Lwing.addBox(-0.5F, -0.5F, 0F, 1, 5, 5);
		Lwing.setRotationPoint(-3.5F, 11F, -1F);
		Lwing.setTextureSize(128, 128);
		Lwing.mirror = true;
		setRotation(Lwing, -0.1919862F, 0F, 0F);
		Rfeather = new ModelRenderer(this, 71, 66);
		Rfeather.addBox(-0.5F, -0.5F, -2F, 1, 1, 8);
		Rfeather.setRotationPoint(3.7F, 15.4F, 1F);
		Rfeather.setTextureSize(128, 128);
		Rfeather.mirror = true;
		setRotation(Rfeather, 0F, 0F, 0F);
		Lwing1 = new ModelRenderer(this, 70, 98);
		Lwing1.addBox(-0.5F, -0.7F, 0F, 1, 2, 6);
		Lwing1.setRotationPoint(-3.6F, 11F, 0F);
		Lwing1.setTextureSize(128, 128);
		Lwing1.mirror = true;
		setRotation(Lwing1, -0.2617994F, 0F, 0F);
		Rwing1 = new ModelRenderer(this, 70, 70);
		Rwing1.addBox(-0.5F, -0.7F, 0F, 1, 2, 6);
		Rwing1.setRotationPoint(3.6F, 11F, 0F);
		Rwing1.setTextureSize(128, 128);
		Rwing1.mirror = true;
		setRotation(Rwing1, -0.2617994F, 0F, 0F);
		Rwing2 = new ModelRenderer(this, 70, 70);
		Rwing2.addBox(-0.5F, -0.5F, -2F, 1, 4, 6);
		Rwing2.setRotationPoint(3.8F, 11.8F, 0F);
		Rwing2.setTextureSize(128, 128);
		Rwing2.mirror = true;
		setRotation(Rwing2, -0.1047198F, 0F, 0F);
		Lwing2 = new ModelRenderer(this, 70, 70);
		Lwing2.addBox(-0.5F, -0.5F, -2F, 1, 4, 6);
		Lwing2.setRotationPoint(-3.8F, 11.8F, 0F);
		Lwing2.setTextureSize(128, 128);
		Lwing2.mirror = true;
		setRotation(Lwing2, -0.1047198F, 0F, 0F);
		Rfeather1 = new ModelRenderer(this, 70, 70);
		Rfeather1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 5);
		Rfeather1.setRotationPoint(3.7F, 13F, 3F);
		Rfeather1.setTextureSize(128, 128);
		Rfeather1.mirror = true;
		setRotation(Rfeather1, 0F, 0F, 0F);
		Lfeather1 = new ModelRenderer(this, 70, 91);
		Lfeather1.addBox(-0.5F, -0.5F, -0.5F, 1, 1, 5);
		Lfeather1.setRotationPoint(-3.7F, 13F, 3F);
		Lfeather1.setTextureSize(128, 128);
		Lfeather1.mirror = true;
		setRotation(Lfeather1, 0F, 0F, 0F);
		Rfeather2 = new ModelRenderer(this, 70, 70);
		Rfeather2.addBox(-0.5F, -0.5F, 0F, 1, 1, 6);
		Rfeather2.setRotationPoint(3.8F, 14F, 3F);
		Rfeather2.setTextureSize(128, 128);
		Rfeather2.mirror = true;
		setRotation(Rfeather2, 0F, 0F, 0F);
		Lfeather2 = new ModelRenderer(this, 85, 100);
		Lfeather2.addBox(-0.5F, -0.5F, 0F, 1, 1, 6);
		Lfeather2.setRotationPoint(-3.8F, 14F, 3F);
		Lfeather2.setTextureSize(128, 128);
		Lfeather2.mirror = true;
		setRotation(Lfeather2, 0F, 0F, 0F);
		Rfeather3 = new ModelRenderer(this, 70, 70);
		Rfeather3.addBox(-0.5F, -0.5F, 0F, 1, 1, 5);
		Rfeather3.setRotationPoint(3.8F, 15F, 3F);
		Rfeather3.setTextureSize(128, 128);
		Rfeather3.mirror = true;
		setRotation(Rfeather3, 0F, 0F, 0F);
		Lfeather3 = new ModelRenderer(this, 70, 84);
		Lfeather3.addBox(-0.5F, -0.5F, 0F, 1, 1, 5);
		Lfeather3.setRotationPoint(-3.8F, 15F, 3F);
		Lfeather3.setTextureSize(128, 128);
		Lfeather3.mirror = true;
		setRotation(Lfeather3, 0F, 0F, 0F);
		HeadBase = new ModelRenderer(this, "HeadBase");
		HeadBase.setRotationPoint(0F, 10F, -4F);
		setRotation(HeadBase, 0F, 0F, 0F);
		HeadBase.mirror = true;
		Neck2 = new ModelRenderer(this, 0, 95);
		Neck2.addBox(-2F, -1.5F, 0F, 4, 3, 4);
		Neck2.setRotationPoint(0F, -1F, -1.4F);
		Neck2.setTextureSize(128, 128);
		Neck2.mirror = true;
		setRotation(Neck2, 0.122173F, 0F, 0F);
		Head = new ModelRenderer(this, 0, 94);
		Head.addBox(-1.5F, -0.5F, 0F, 3, 3, 4);
		Head.setRotationPoint(0F, -4F, -1.6F);
		Head.setTextureSize(128, 128);
		Head.mirror = true;
		setRotation(Head, 0F, 0F, 0F);
		Head2 = new ModelRenderer(this, 69, 12);
		Head2.addBox(-0.5F, -0.5F, 0F, 3, 5, 4);
		Head2.setRotationPoint(-1.5F, -4F, -2F);
		Head2.setTextureSize(128, 128);
		Head2.mirror = true;
		setRotation(Head2, 0F, -0.0872665F, 0F);
		Head3 = new ModelRenderer(this, 90, 12);
		Head3.addBox(-2.5F, -0.5F, 0F, 3, 5, 4);
		Head3.setRotationPoint(1.5F, -4F, -2F);
		Head3.setTextureSize(128, 128);
		Head3.mirror = true;
		setRotation(Head3, 0F, 0.0872665F, 0F);
		Head4 = new ModelRenderer(this, 85, 0);
		Head4.addBox(-2F, -0.5F, 0F, 4, 4, 4);
		Head4.setRotationPoint(0F, -4.5F, -2.5F);
		Head4.setTextureSize(128, 128);
		Head4.mirror = true;
		setRotation(Head4, 0F, 0F, 0F);
		Head5 = new ModelRenderer(this, 71, 0);
		Head5.addBox(-2F, -0.5F, 0F, 4, 1, 2);
		Head5.setRotationPoint(0F, -5F, -1F);
		Head5.setTextureSize(128, 128);
		Head5.mirror = true;
		setRotation(Head5, 0F, 0F, 0F);
		Forehead = new ModelRenderer(this, 73, 0);
		Forehead.addBox(-1.5F, -0.3F, 0F, 3, 1, 2);
		Forehead.setRotationPoint(0F, -5F, -2F);
		Forehead.setTextureSize(128, 128);
		Forehead.mirror = true;
		setRotation(Forehead, 0.0698132F, 0F, 0F);
		Face = new ModelRenderer(this, 68, 0);
		Face.addBox(-1.5F, -0.5F, 0F, 3, 3, 3);
		Face.setRotationPoint(0F, -4.4F, -2.8F);
		Face.setTextureSize(128, 128);
		Face.mirror = true;
		setRotation(Face, -0.1047198F, 0F, 0F);
		Beak1 = new ModelRenderer(this, 70, 37);
		Beak1.addBox(-0.5F, -0.9F, 0F, 1, 1, 2);
		Beak1.setRotationPoint(0F, -2.1F, -3.7F);
		Beak1.setTextureSize(128, 128);
		Beak1.mirror = true;
		setRotation(Beak1, -0.6108652F, 0F, 0F);
		Beak2 = new ModelRenderer(this, 85, 50);
		Beak2.addBox(-0.5F, -0.5F, -0.1F, 1, 1, 2);
		Beak2.setRotationPoint(0F, -2.8F, -4.3F);
		Beak2.setTextureSize(128, 128);
		Beak2.mirror = true;
		setRotation(Beak2, 0.122173F, 0F, 0F);
		Beak3 = new ModelRenderer(this, 85, 50);
		Beak3.addBox(-0.5F, -0.7F, 0F, 1, 1, 1);
		Beak3.setRotationPoint(0F, -2.8F, -4.9F);
		Beak3.setTextureSize(128, 128);
		Beak3.mirror = true;
		setRotation(Beak3, -0.6981317F, 0F, 0F);
		Beak4 = new ModelRenderer(this, 85, 50);
		Beak4.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Beak4.setRotationPoint(0F, -2.9F, -3.2F);
		Beak4.setTextureSize(128, 128);
		Beak4.mirror = true;
		setRotation(Beak4, 0.4537856F, 0F, 0F);
		Beak5 = new ModelRenderer(this, 85, 50);
		Beak5.addBox(-0.5F, -0.8F, 0F, 1, 1, 1);
		Beak5.setRotationPoint(0F, -2.4F, -4.1F);
		Beak5.setTextureSize(128, 128);
		Beak5.mirror = true;
		setRotation(Beak5, -0.5061455F, 0F, 0F);
		Beak6 = new ModelRenderer(this, 85, 50);
		Beak6.addBox(-0.5F, -0.5F, -1F, 1, 1, 2);
		Beak6.setRotationPoint(0.3F, -2.8F, -3.3F);
		Beak6.setTextureSize(128, 128);
		Beak6.mirror = true;
		setRotation(Beak6, 0F, 0.3839724F, 0F);
		Beak7 = new ModelRenderer(this, 85, 50);
		Beak7.addBox(-0.5F, -0.5F, -1F, 1, 1, 2);
		Beak7.setRotationPoint(-0.3F, -2.8F, -3.3F);
		Beak7.setTextureSize(128, 128);
		Beak7.mirror = true;
		setRotation(Beak7, 0F, -0.3839724F, 0F);
		Eye1 = new ModelRenderer(this, 36, 81);
		Eye1.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Eye1.setRotationPoint(-1.3F, -3.8F, -1.9F);
		Eye1.setTextureSize(128, 128);
		Eye1.mirror = true;
		setRotation(Eye1, -0.2443461F, -0.0698132F, 0.2268928F);
		Eye2 = new ModelRenderer(this, 36, 78);
		Eye2.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
		Eye2.setRotationPoint(1.3F, -3.8F, -1.9F);
		Eye2.setTextureSize(128, 128);
		Eye2.mirror = true;
		setRotation(Eye2, -0.2443461F, 0.0698132F, -0.2268928F);
		Mane1 = new ModelRenderer(this, 71, 0);
		Mane1.addBox(-1.5F, -0.5F, 0F, 0, 3, 4);
		Mane1.setRotationPoint(-0.6F, -3.7F, 0F);
		Mane1.setTextureSize(128, 128);
		Mane1.mirror = true;
		setRotation(Mane1, 0.1919862F, -0.2617994F, 0.3141593F);
		Mane2 = new ModelRenderer(this, 70, 0);
		Mane2.addBox(1.5F, -0.5F, 0F, 0, 3, 4);
		Mane2.setRotationPoint(0.6F, -3.7F, 0F);
		Mane2.setTextureSize(128, 128);
		Mane2.mirror = true;
		setRotation(Mane2, 0.1919862F, 0.2617994F, -0.3316126F);
		Mane3 = new ModelRenderer(this, 67, 0);
		Mane3.addBox(-1.5F, 0.5F, 0F, 2, 0, 4);
		Mane3.setRotationPoint(-0.8F, -5.7F, 0F);
		Mane3.setTextureSize(128, 128);
		Mane3.mirror = true;
		setRotation(Mane3, 0.2792527F, -0.0349066F, -0.4537856F);
		Mane4 = new ModelRenderer(this, 76, 0);
		Mane4.addBox(-0.5F, 0.5F, 0F, 2, 0, 4);
		Mane4.setRotationPoint(0.8F, -5.7F, 0F);
		Mane4.setTextureSize(128, 128);
		Mane4.mirror = true;
		setRotation(Mane4, 0.2792527F, 0.0349066F, 0.4537856F);
		Mane5 = new ModelRenderer(this, 67, 0);
		Mane5.addBox(-0.5F, 0.5F, 1F, 1, 0, 6);
		Mane5.setRotationPoint(0F, -5.3F, -2F);
		Mane5.setTextureSize(128, 128);
		Mane5.mirror = true;
		setRotation(Mane5, 0.3141593F, 0F, 0F);
		Mane6 = new ModelRenderer(this, 70, 0);
		Mane6.addBox(-0.5F, -0.5F, 0F, 0, 2, 6);
		Mane6.setRotationPoint(2.5F, -3.2F, -1F);
		Mane6.setTextureSize(128, 128);
		Mane6.mirror = true;
		setRotation(Mane6, 0F, 0.2443461F, 0F);
		Mane7 = new ModelRenderer(this, 68, 0);
		Mane7.addBox(0.5F, -0.5F, 0F, 0, 2, 6);
		Mane7.setRotationPoint(-2.5F, -3.2F, -1F);
		Mane7.setTextureSize(128, 128);
		Mane7.mirror = true;
		setRotation(Mane7, 0F, -0.2443461F, 0F);
		Mane8 = new ModelRenderer(this, 67, 0);
		Mane8.addBox(1.5F, -0.5F, 0F, 0, 3, 3);
		Mane8.setRotationPoint(-3.6F, -2.3F, -1.3F);
		Mane8.setTextureSize(128, 128);
		Mane8.mirror = true;
		setRotation(Mane8, -0.1570796F, -0.3490659F, 0F);
		Mane9 = new ModelRenderer(this, 70, 0);
		Mane9.addBox(-1.5F, -0.5F, 0F, 0, 3, 3);
		Mane9.setRotationPoint(3.6F, -2.3F, -1.3F);
		Mane9.setTextureSize(128, 128);
		Mane9.mirror = true;
		setRotation(Mane9, -0.1570796F, 0.3490659F, 0F);
		Mane10 = new ModelRenderer(this, 68, 0);
		Mane10.addBox(-0.5F, -0.5F, 0F, 0, 2, 2);
		Mane10.setRotationPoint(2.5F, -1.3F, -2F);
		Mane10.setTextureSize(128, 128);
		Mane10.mirror = true;
		setRotation(Mane10, -0.1919862F, 0.2617994F, -0.3141593F);
		Mane11 = new ModelRenderer(this, 70, 0);
		Mane11.addBox(0.5F, -0.5F, 0F, 0, 2, 2);
		Mane11.setRotationPoint(-2.5F, -1.3F, -2F);
		Mane11.setTextureSize(128, 128);
		Mane11.mirror = true;
		setRotation(Mane11, -0.1919862F, -0.2617994F, 0.3141593F);
		Mane12 = new ModelRenderer(this, 68, 1);
		Mane12.addBox(-0.5F, -0.8F, 1F, 2, 3, 0);
		Mane12.setRotationPoint(-1.6F, -1.3F, -3.2F);
		Mane12.setTextureSize(128, 128);
		Mane12.mirror = true;
		setRotation(Mane12, 0F, 0.1396263F, 0.2792527F);
		Mane13 = new ModelRenderer(this, 70, 0);
		Mane13.addBox(-1.5F, -0.8F, 1F, 2, 3, 0);
		Mane13.setRotationPoint(1.6F, -1.3F, -3.2F);
		Mane13.setTextureSize(128, 128);
		Mane13.mirror = true;
		setRotation(Mane13, 0F, -0.1396263F, -0.2792527F);
		Mane14 = new ModelRenderer(this, 68, 0);
		Mane14.addBox(-2.5F, -0.5F, 1F, 3, 3, 0);
		Mane14.setRotationPoint(0F, -1.3F, -3.2F);
		Mane14.setTextureSize(128, 128);
		Mane14.mirror = true;
		setRotation(Mane14, 0F, 0F, -0.7853982F);

		HeadBase.addChild(Head);
		HeadBase.addChild(Head2);
		HeadBase.addChild(Head3);
		HeadBase.addChild(Head4);
		HeadBase.addChild(Head5);
		HeadBase.addChild(Neck2);
		HeadBase.addChild(Forehead);
		HeadBase.addChild(Face);
		HeadBase.addChild(Beak1);
		HeadBase.addChild(Beak2);
		HeadBase.addChild(Beak3);
		HeadBase.addChild(Beak4);
		HeadBase.addChild(Beak5);
		HeadBase.addChild(Beak6);
		HeadBase.addChild(Beak7);
		HeadBase.addChild(Eye1);
		HeadBase.addChild(Eye2);
		HeadBase.addChild(Mane1);
		HeadBase.addChild(Mane2);
		HeadBase.addChild(Mane3);
		HeadBase.addChild(Mane4);
		HeadBase.addChild(Mane5);
		HeadBase.addChild(Mane6);
		HeadBase.addChild(Mane7);
		HeadBase.addChild(Mane8);
		HeadBase.addChild(Mane9);
		HeadBase.addChild(Mane10);
		HeadBase.addChild(Mane11);
		HeadBase.addChild(Mane12);
		HeadBase.addChild(Mane13);
		HeadBase.addChild(Mane14);

		LeftLeg = new ModelRenderer(this, "LeftLeg");
		LeftLeg.setRotationPoint(2F, 19F, 2F);
		setRotation(LeftLeg, 0F, 0F, 0F);
		LeftLeg.mirror = true;
		ThighL = new ModelRenderer(this, 0, 0);
		ThighL.addBox(-0.5F, -0.5F, 0F, 2, 2, 2);
		ThighL.setRotationPoint(-0.7F, 0F, -1F);
		ThighL.setTextureSize(128, 128);
		ThighL.mirror = true;
		setRotation(ThighL, 0F, 0F, 0F);
		LegL = new ModelRenderer(this, 78, 42);
		LegL.addBox(-0.5F, -0.5F, 0F, 1, 4, 1);
		LegL.setRotationPoint(-0.1F, 1F, -0.5F);
		LegL.setTextureSize(128, 128);
		LegL.mirror = true;
		setRotation(LegL, -0.1047198F, 0F, 0F);
		AnkleL = new ModelRenderer(this, 78, 42);
		AnkleL.addBox(-0.4F, -0.5F, 0F, 2, 1, 1);
		AnkleL.setRotationPoint(-0.7F, 4.5F, -1F);
		AnkleL.setTextureSize(128, 128);
		AnkleL.mirror = true;
		setRotation(AnkleL, 0F, -0.122173F, 0F);
		LToe = new ModelRenderer(this, 78, 42);
		LToe.addBox(-0.5F, -0.5F, 0F, 1, 1, 2);
		LToe.setRotationPoint(-0.1F, 4.4F, -0.7F);
		LToe.setTextureSize(128, 128);
		LToe.mirror = true;
		setRotation(LToe, 0.0174533F, 0F, 0F);
		LToe1 = new ModelRenderer(this, 78, 42);
		LToe1.addBox(-0.5F, -0.5F, -0.1F, 1, 1, 2);
		LToe1.setRotationPoint(1.1F, 4.4F, -1.9F);
		LToe1.setTextureSize(128, 128);
		LToe1.mirror = true;
		setRotation(LToe1, -0.0523599F, -0.4537856F, 0F);
		LToe2 = new ModelRenderer(this, 78, 42);
		LToe2.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 2);
		LToe2.setRotationPoint(-0.8F, 4.4F, -2F);
		LToe2.setTextureSize(128, 128);
		LToe2.mirror = true;
		setRotation(LToe2, -0.0523599F, 0.1396263F, 0F);
		Lclaw = new ModelRenderer(this, 85, 22);
		Lclaw.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Lclaw.setRotationPoint(0F, 4.5F, 0.7F);
		Lclaw.setTextureSize(128, 128);
		Lclaw.mirror = true;
		setRotation(Lclaw, 0F, 0.0698132F, 0F);
		Lclaw1 = new ModelRenderer(this, 85, 20);
		Lclaw1.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Lclaw1.setRotationPoint(1.3F, 4.5F, -2.4F);
		Lclaw1.setTextureSize(128, 128);
		Lclaw1.mirror = true;
		setRotation(Lclaw1, 0F, -0.4537856F, 0F);
		Lclaw2 = new ModelRenderer(this, 85, 20);
		Lclaw2.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Lclaw2.setRotationPoint(-1F, 4.5F, -2.6F);
		Lclaw2.setTextureSize(128, 128);
		Lclaw2.mirror = true;
		setRotation(Lclaw2, 0F, 0.2268928F, 0F);

		LeftLeg.addChild(ThighL);
		LeftLeg.addChild(LegL);
		LeftLeg.addChild(AnkleL);
		LeftLeg.addChild(LToe);
		LeftLeg.addChild(LToe1);
		LeftLeg.addChild(LToe2);
		LeftLeg.addChild(Lclaw);
		LeftLeg.addChild(Lclaw1);
		LeftLeg.addChild(Lclaw2);

		RightLeg = new ModelRenderer(this, "RightLeg");
		RightLeg.setRotationPoint(-2F, 19F, 2F);
		setRotation(RightLeg, 0F, 0F, 0F);
		RightLeg.mirror = true;
		ThighR = new ModelRenderer(this, 0, 0);
		ThighR.addBox(-1.5F, -0.5F, 0F, 2, 2, 2);
		ThighR.setRotationPoint(0.7F, 0F, -1F);
		ThighR.setTextureSize(128, 128);
		ThighR.mirror = true;
		setRotation(ThighR, 0F, 0F, 0F);
		LegR = new ModelRenderer(this, 78, 42);
		LegR.addBox(-0.5F, -0.5F, 0F, 1, 4, 1);
		LegR.setRotationPoint(0.1F, 1F, -0.5F);
		LegR.setTextureSize(128, 128);
		LegR.mirror = true;
		setRotation(LegR, -0.1047198F, 0F, 0F);
		AnkleR = new ModelRenderer(this, 78, 42);
		AnkleR.addBox(-1.6F, -0.5F, 0F, 2, 1, 1);
		AnkleR.setRotationPoint(0.7F, 4.5F, -1F);
		AnkleR.setTextureSize(128, 128);
		AnkleR.mirror = true;
		setRotation(AnkleR, 0F, 0.122173F, 0F);
		RToe = new ModelRenderer(this, 78, 42);
		RToe.addBox(-0.5F, -0.5F, 0F, 1, 1, 2);
		RToe.setRotationPoint(0.1F, 4.4F, -0.7F);
		RToe.setTextureSize(128, 128);
		RToe.mirror = true;
		setRotation(RToe, 0.0174533F, 0F, 0F);
		RToe1 = new ModelRenderer(this, 78, 42);
		RToe1.addBox(-0.5F, -0.5F, -0.1F, 1, 1, 2);
		RToe1.setRotationPoint(-1.1F, 4.4F, -1.9F);
		RToe1.setTextureSize(128, 128);
		RToe1.mirror = true;
		setRotation(RToe1, -0.0523599F, 0.4537856F, 0F);
		RToeR = new ModelRenderer(this, 78, 42);
		RToeR.addBox(-0.5F, -0.5F, -0.2F, 1, 1, 2);
		RToeR.setRotationPoint(0.8F, 4.4F, -2F);
		RToeR.setTextureSize(128, 128);
		RToeR.mirror = true;
		setRotation(RToeR, -0.0523599F, -0.1396263F, 0F);
		Rclaw = new ModelRenderer(this, 85, 22);
		Rclaw.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Rclaw.setRotationPoint(0F, 4.5F, 0.7F);
		Rclaw.setTextureSize(128, 128);
		Rclaw.mirror = true;
		setRotation(Rclaw, 0F, -0.0698132F, 0F);
		Rclaw2 = new ModelRenderer(this, 85, 20);
		Rclaw2.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Rclaw2.setRotationPoint(1F, 4.5F, -2.6F);
		Rclaw2.setTextureSize(128, 128);
		Rclaw2.mirror = true;
		setRotation(Rclaw2, 0F, -0.2268928F, 0F);
		Rclaw1 = new ModelRenderer(this, 85, 20);
		Rclaw1.addBox(-0.5F, -0.5F, 0F, 1, 1, 1);
		Rclaw1.setRotationPoint(-1.3F, 4.5F, -2.4F);
		Rclaw1.setTextureSize(128, 128);
		Rclaw1.mirror = true;
		setRotation(Rclaw1, 0F, 0.4537856F, 0F);

		RightLeg.addChild(ThighR);
		RightLeg.addChild(LegR);
		RightLeg.addChild(AnkleR);
		RightLeg.addChild(RToe);
		RightLeg.addChild(RToe1);
		RightLeg.addChild(RToeR);
		RightLeg.addChild(Rclaw);
		RightLeg.addChild(Rclaw1);
		RightLeg.addChild(Rclaw2);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body1.render(f5);
		Body2.render(f5);
		Body3.render(f5);
		Body4.render(f5);
		Body5.render(f5);
		Body6.render(f5);
		Body7.render(f5);
		Chest1.render(f5);
		TailFeather.render(f5);
		TailFeatherR.render(f5);
		TailFeatherL.render(f5);
		TailFeatherL1.render(f5);
		TailFeatherR2.render(f5);
		Bum.render(f5);
		LFeather.render(f5);
		Rwing.render(f5);
		Lwing.render(f5);
		Rfeather.render(f5);
		Lwing1.render(f5);
		Rwing1.render(f5);
		Rwing2.render(f5);
		Lwing2.render(f5);
		Rfeather1.render(f5);
		Lfeather1.render(f5);
		Rfeather2.render(f5);
		Lfeather2.render(f5);
		Rfeather3.render(f5);
		Lfeather3.render(f5);
		HeadBase.render(f5);
		LeftLeg.render(f5);
		RightLeg.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		HeadBase.rotateAngleY = f3 / (180F / (float) Math.PI);
		HeadBase.rotateAngleX = f4 / (180F / (float) Math.PI);
		RightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 0.7F * f1;
		LeftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * 0.7F * f1;
	}

}
