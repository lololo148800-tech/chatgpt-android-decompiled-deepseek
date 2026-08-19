package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import p760g2.C13806c;
import p760g2.C13807d;
import p760g2.C13808e;
import p760g2.C13809f;
import p760g2.C13810g;
import p760g2.C13811h;
import p775h2.C14372b;
import p775h2.InterfaceC14373c;
import p822j2.AbstractC16059p;
import p822j2.AbstractC16061r;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC16061r {

    /* JADX INFO: renamed from: x0 */
    public C13810g f32836x0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p822j2.AbstractC16061r, p822j2.AbstractC16045b
    /* JADX INFO: renamed from: g */
    public final void mo11358g(AttributeSet attributeSet) {
        super.mo11358g(attributeSet);
        C13810g c13810g = new C13810g();
        c13810g.f43767t0 = 0;
        c13810g.f43768u0 = 0;
        c13810g.f43769v0 = 0;
        c13810g.f43770w0 = 0;
        c13810g.f43771x0 = 0;
        c13810g.f43772y0 = 0;
        c13810g.f43773z0 = false;
        c13810g.f43738A0 = 0;
        c13810g.f43739B0 = 0;
        c13810g.f43740C0 = new C14372b();
        c13810g.f43741D0 = null;
        c13810g.f43742E0 = -1;
        c13810g.f43743F0 = -1;
        c13810g.f43744G0 = -1;
        c13810g.f43745H0 = -1;
        c13810g.f43746I0 = -1;
        c13810g.f43747J0 = -1;
        c13810g.f43748K0 = 0.5f;
        c13810g.f43749L0 = 0.5f;
        c13810g.f43750M0 = 0.5f;
        c13810g.f43751N0 = 0.5f;
        c13810g.f43752O0 = 0.5f;
        c13810g.f43753P0 = 0.5f;
        c13810g.f43754Q0 = 0;
        c13810g.f43755R0 = 0;
        c13810g.f43756S0 = 2;
        c13810g.f43757T0 = 2;
        c13810g.f43758U0 = 0;
        c13810g.f43759V0 = -1;
        c13810g.f43760W0 = 0;
        c13810g.f43761X0 = new ArrayList();
        c13810g.f43762Y0 = null;
        c13810g.f43763Z0 = null;
        c13810g.f43764a1 = null;
        c13810g.f43766c1 = 0;
        this.f32836x0 = c13810g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f32836x0.f43760W0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C13810g c13810g2 = this.f32836x0;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c13810g2.f43767t0 = dimensionPixelSize;
                    c13810g2.f43768u0 = dimensionPixelSize;
                    c13810g2.f43769v0 = dimensionPixelSize;
                    c13810g2.f43770w0 = dimensionPixelSize;
                } else if (index == 18) {
                    C13810g c13810g3 = this.f32836x0;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c13810g3.f43769v0 = dimensionPixelSize2;
                    c13810g3.f43771x0 = dimensionPixelSize2;
                    c13810g3.f43772y0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f32836x0.f43770w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f32836x0.f43771x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f32836x0.f43767t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f32836x0.f43772y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f32836x0.f43768u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f32836x0.f43758U0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f32836x0.f43742E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f32836x0.f43743F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f32836x0.f43744G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f32836x0.f43746I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f32836x0.f43745H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f32836x0.f43747J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f32836x0.f43748K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f32836x0.f43750M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f32836x0.f43752O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f32836x0.f43751N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f32836x0.f43753P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f32836x0.f43749L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f32836x0.f43756S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f32836x0.f43757T0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f32836x0.f43754Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f32836x0.f43755R0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f32836x0.f43759V0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f49498r0 = this.f32836x0;
        m17616i();
    }

    @Override // p822j2.AbstractC16045b
    /* JADX INFO: renamed from: h */
    public final void mo11359h(C13807d c13807d, boolean z6) {
        C13810g c13810g = this.f32836x0;
        int i10 = c13810g.f43769v0;
        if (i10 > 0 || c13810g.f43770w0 > 0) {
            if (z6) {
                c13810g.f43771x0 = c13810g.f43770w0;
                c13810g.f43772y0 = i10;
            } else {
                c13810g.f43771x0 = i10;
                c13810g.f43772y0 = c13810g.f43770w0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01af  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:113:0x021d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0228  */
    /* JADX WARN: Code duplicated, block: B:117:0x0238  */
    /* JADX WARN: Code duplicated, block: B:133:0x0259  */
    /* JADX WARN: Code duplicated, block: B:135:0x0278  */
    /* JADX WARN: Code duplicated, block: B:137:0x027c  */
    /* JADX WARN: Code duplicated, block: B:146:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x02df  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:166:0x032e  */
    /* JADX WARN: Code duplicated, block: B:168:0x033a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0340  */
    /* JADX WARN: Code duplicated, block: B:171:0x0353  */
    /* JADX WARN: Code duplicated, block: B:174:0x0387  */
    /* JADX WARN: Code duplicated, block: B:178:0x039c  */
    /* JADX WARN: Code duplicated, block: B:180:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:184:0x03be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:192:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:196:0x03da  */
    /* JADX WARN: Code duplicated, block: B:198:0x03de  */
    /* JADX WARN: Code duplicated, block: B:200:0x03e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:208:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0401  */
    /* JADX WARN: Code duplicated, block: B:223:0x0413 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0415  */
    /* JADX WARN: Code duplicated, block: B:225:0x041f  */
    /* JADX WARN: Code duplicated, block: B:230:0x042f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0446  */
    /* JADX WARN: Code duplicated, block: B:242:0x044d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0450  */
    /* JADX WARN: Code duplicated, block: B:246:0x0456  */
    /* JADX WARN: Code duplicated, block: B:257:0x0474  */
    /* JADX WARN: Code duplicated, block: B:262:0x0488  */
    /* JADX WARN: Code duplicated, block: B:267:0x049c  */
    /* JADX WARN: Code duplicated, block: B:269:0x04a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:275:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:277:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:278:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:283:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:286:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:287:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:295:0x050c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0527  */
    /* JADX WARN: Code duplicated, block: B:299:0x052d  */
    /* JADX WARN: Code duplicated, block: B:301:0x053b  */
    /* JADX WARN: Code duplicated, block: B:318:0x055e  */
    /* JADX WARN: Code duplicated, block: B:320:0x0587  */
    /* JADX WARN: Code duplicated, block: B:322:0x058e  */
    /* JADX WARN: Code duplicated, block: B:325:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:327:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:329:0x05be  */
    /* JADX WARN: Code duplicated, block: B:346:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:348:0x0608  */
    /* JADX WARN: Code duplicated, block: B:350:0x060e  */
    /* JADX WARN: Code duplicated, block: B:358:0x0637  */
    /* JADX WARN: Code duplicated, block: B:363:0x063f  */
    /* JADX WARN: Code duplicated, block: B:365:0x0647  */
    /* JADX WARN: Code duplicated, block: B:366:0x0651  */
    /* JADX WARN: Code duplicated, block: B:370:0x066c  */
    /* JADX WARN: Code duplicated, block: B:372:0x0674  */
    /* JADX WARN: Code duplicated, block: B:374:0x0678  */
    /* JADX WARN: Code duplicated, block: B:375:0x0689  */
    /* JADX WARN: Code duplicated, block: B:378:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:380:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:382:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:383:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:386:0x0714  */
    /* JADX WARN: Code duplicated, block: B:390:0x0729  */
    /* JADX WARN: Code duplicated, block: B:393:0x0746  */
    /* JADX WARN: Code duplicated, block: B:395:0x074c  */
    /* JADX WARN: Code duplicated, block: B:396:0x0762  */
    /* JADX WARN: Code duplicated, block: B:399:0x07a5 A[LOOP:18: B:398:0x07a3->B:399:0x07a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:403:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:404:0x07d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:405:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:407:0x07df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:408:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:409:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a  */
    /* JADX WARN: Code duplicated, block: B:411:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:412:0x07eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:413:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:414:0x07f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:415:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:416:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:419:0x0807  */
    /* JADX WARN: Code duplicated, block: B:420:0x0809  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:430:0x00cc A[EDGE_INSN: B:430:0x00cc->B:59:0x00cc BREAK  A[LOOP:1: B:53:0x00b8->B:58:0x00c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x03d6 A[EDGE_INSN: B:449:0x03d6->B:194:0x03d6 BREAK  A[LOOP:7: B:183:0x03bc->B:193:0x03d3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:465:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:470:0x03fb A[EDGE_INSN: B:470:0x03fb->B:210:0x03fb BREAK  A[LOOP:13: B:199:0x03e1->B:209:0x03f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:472:0x03f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a  */
    /* JADX WARN: Code duplicated, block: B:76:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0136  */
    /* JADX WARN: Code duplicated, block: B:83:0x013b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0172  */
    /* JADX WARN: Code duplicated, block: B:87:0x0178  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p822j2.AbstractC16061r
    /* JADX INFO: renamed from: j */
    public final void mo11360j(C13810g c13810g, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        C13807d[] c13807dArr;
        int i18;
        int i19;
        int i20;
        int i21;
        int[] iArr2;
        int i22;
        C13807d[] c13807dArr2;
        int i23;
        ArrayList arrayList;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int[] iArr3;
        int i33;
        C13809f c13809f;
        int i34;
        char c9;
        char c10;
        int i35;
        int i36;
        int i37;
        int iMin;
        int iMin2;
        boolean z6;
        C13806c c13806c;
        C13806c c13806c2;
        C13806c c13806c3;
        C13806c c13806c4;
        int[] iArr4;
        C13807d[] c13807dArr3;
        int i38;
        ArrayList arrayList2;
        int i39;
        C13809f c13809f2;
        int[] iArr5;
        int i40;
        C13809f c13809f3;
        int i41;
        int i42;
        int i43;
        C13807d c13807d;
        int iM15410X;
        boolean z10;
        C13807d[] c13807dArr4;
        int i44;
        int size;
        int i45;
        int i46;
        boolean z11;
        int i47;
        C13806c c13806c5;
        C13806c c13806c6;
        C13806c c13806c7;
        int i48;
        int i49;
        int i50;
        int i51;
        C13806c c13806c8;
        C13809f c13809f4;
        ArrayList arrayList3;
        int iM15406d;
        int iM15405c;
        int i52;
        C13809f c13809f5;
        C13809f c13809f6;
        int i53;
        int i54;
        C13807d c13807d2;
        int iM15411Y;
        boolean z12;
        int[] iArr6;
        C13807d c13807d3;
        int i55;
        int i56;
        C13807d[] c13807dArr5;
        int i57;
        int i58;
        int iCeil;
        int iCeil2;
        int i59;
        int i60;
        int i61;
        C13807d c13807d4;
        int iM15410X2;
        boolean z13;
        C13807d[] c13807dArr6;
        Object obj;
        C13807d[] c13807dArr7;
        int i62;
        int i63;
        int iM15411Y2;
        int i64;
        int iM15410X3;
        C13807d c13807d5;
        C13807d c13807d6;
        int i65;
        int i66;
        C13807d[] c13807dArr8;
        C13807d c13807d7;
        C13807d c13807d8;
        C13807d c13807d9;
        int i67;
        int i68;
        int i69;
        C13807d c13807d10;
        int iM15411Y3;
        int i70;
        C13809f c13809f7;
        int i71;
        ArrayList arrayList4;
        int i72;
        int i73;
        int i74;
        int i75;
        int i76;
        C13807d c13807d11;
        int i77;
        int iM15410X4;
        boolean z14;
        C13807d[] c13807dArr9;
        int i78;
        int size2;
        int i79;
        int i80;
        int i81;
        boolean z15;
        int i82;
        C13806c c13806c9;
        C13806c c13806c10;
        C13806c c13806c11;
        C13806c c13806c12;
        int i83;
        int i84;
        int i85;
        C13809f c13809f8;
        ArrayList arrayList5;
        int iM15406d2;
        int iM15405c2;
        int i86;
        C13809f c13809f9;
        int i87;
        int i88;
        int i89;
        int i90;
        C13807d c13807d12;
        int i91;
        int iM15411Y4;
        boolean z16;
        int i92;
        int i93;
        int i94;
        C13807d c13807d13;
        int mode = View.MeasureSpec.getMode(i10);
        int size3 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size4 = View.MeasureSpec.getSize(i11);
        if (c13810g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (c13810g.f43781s0 <= 0) {
            i12 = c13810g.f43771x0;
            i13 = c13810g.f43772y0;
            i14 = c13810g.f43767t0;
            i15 = c13810g.f43768u0;
            iArr = new int[2];
            i16 = (size3 - i12) - i13;
            i17 = c13810g.f43760W0;
            if (i17 == 1) {
                i16 = (size4 - i14) - i15;
            }
            if (i17 == 0) {
                if (c13810g.f43742E0 == -1) {
                    c13810g.f43742E0 = 0;
                }
                if (c13810g.f43743F0 == -1) {
                    c13810g.f43743F0 = 0;
                }
            } else {
                if (c13810g.f43742E0 == -1) {
                    c13810g.f43742E0 = 0;
                }
                if (c13810g.f43743F0 == -1) {
                    c13810g.f43743F0 = 0;
                }
            }
            c13807dArr = c13810g.f43780r0;
            i18 = 0;
            i19 = 0;
            while (true) {
                i20 = c13810g.f43781s0;
                if (i18 < i20) {
                    break;
                }
                if (c13810g.f43780r0[i18].f43670h0 == 8) {
                    i19++;
                }
                i18++;
            }
            if (i19 > 0) {
                c13807dArr = new C13807d[i20 - i19];
                i94 = 0;
                i22 = 0;
                while (i94 < c13810g.f43781s0) {
                    c13807d13 = c13810g.f43780r0[i94];
                    int i95 = i16;
                    int[] iArr7 = iArr;
                    if (c13807d13.f43670h0 != 8) {
                        c13807dArr[i22] = c13807d13;
                        i22++;
                    }
                    i94++;
                    i16 = i95;
                    iArr = iArr7;
                }
                i21 = i16;
                iArr2 = iArr;
            } else {
                i21 = i16;
                iArr2 = iArr;
                i22 = i20;
            }
            c13807dArr2 = c13807dArr;
            c13810g.f43765b1 = c13807dArr2;
            c13810g.f43766c1 = i22;
            i23 = c13810g.f43758U0;
            arrayList = c13810g.f43761X0;
            if (i23 != 0) {
                c13806c = c13810g.f43639K;
                c13806c2 = c13810g.f43638J;
                c13806c3 = c13810g.f43640L;
                c13806c4 = c13810g.f43641M;
                iArr4 = c13810g.f43688q0;
                if (i23 != 1) {
                    i31 = size4;
                    if (i23 != 2) {
                        i24 = i15;
                        i25 = i14;
                        i26 = i13;
                        i27 = i12;
                        i28 = mode;
                        i29 = size3;
                        i30 = mode2;
                        c13807dArr5 = c13807dArr2;
                        i57 = i21;
                        iArr3 = iArr2;
                        i58 = c13810g.f43760W0;
                        if (i58 == 0) {
                            i67 = c13810g.f43759V0;
                            if (i67 <= 0) {
                                i69 = 0;
                                iCeil2 = 0;
                                for (i68 = 0; i68 < i22; i68++) {
                                    if (i68 > 0) {
                                        i69 += c13810g.f43754Q0;
                                    }
                                    c13807d10 = c13807dArr5[i68];
                                    if (c13807d10 != null) {
                                        iM15411Y3 = c13810g.m15411Y(c13807d10, i57) + i69;
                                        if (iM15411Y3 > i57) {
                                            break;
                                        }
                                        iCeil2++;
                                        i69 = iM15411Y3;
                                    }
                                }
                            } else {
                                iCeil2 = i67;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = c13810g.f43759V0;
                            if (iCeil <= 0) {
                                i60 = 0;
                                i61 = 0;
                                for (i59 = 0; i59 < i22; i59++) {
                                    if (i59 > 0) {
                                        i60 += c13810g.f43755R0;
                                    }
                                    c13807d4 = c13807dArr5[i59];
                                    if (c13807d4 != null) {
                                        iM15410X2 = c13810g.m15410X(c13807d4, i57) + i60;
                                        if (iM15410X2 > i57) {
                                            break;
                                        }
                                        i61++;
                                        i60 = iM15410X2;
                                    }
                                }
                                iCeil = i61;
                            }
                            iCeil2 = 0;
                        }
                        if (c13810g.f43764a1 == null) {
                            c13810g.f43764a1 = new int[2];
                        }
                        z13 = (iCeil != 0 && i58 == 1) || (iCeil2 == 0 && i58 == 0);
                        while (!z13) {
                            if (i58 == 0) {
                                iCeil = (int) Math.ceil(i22 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i22 / iCeil);
                            }
                            c13807dArr6 = c13810g.f43763Z0;
                            if (c13807dArr6 != null || c13807dArr6.length < iCeil2) {
                                obj = null;
                                c13810g.f43763Z0 = new C13807d[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(c13807dArr6, (Object) null);
                            }
                            c13807dArr7 = c13810g.f43762Y0;
                            if (c13807dArr7 != null || c13807dArr7.length < iCeil) {
                                c13810g.f43762Y0 = new C13807d[iCeil];
                            } else {
                                Arrays.fill(c13807dArr7, obj);
                            }
                            for (i62 = 0; i62 < iCeil2; i62++) {
                                i65 = 0;
                                while (i65 < iCeil) {
                                    i66 = (i65 * iCeil2) + i62;
                                    if (i58 == 1) {
                                        i66 = (i62 * iCeil) + i65;
                                    }
                                    c13807dArr8 = c13807dArr5;
                                    if (i66 < c13807dArr8.length && (c13807d7 = c13807dArr8[i66]) != null) {
                                        int iM15411Y5 = c13810g.m15411Y(c13807d7, i57);
                                        c13807d8 = c13810g.f43763Z0[i62];
                                        if (c13807d8 != null || c13807d8.m15387r() < iM15411Y5) {
                                            c13810g.f43763Z0[i62] = c13807d7;
                                        }
                                        int iM15410X5 = c13810g.m15410X(c13807d7, i57);
                                        c13807d9 = c13810g.f43762Y0[i65];
                                        if (c13807d9 != null || c13807d9.m15383l() < iM15410X5) {
                                            c13810g.f43762Y0[i65] = c13807d7;
                                        }
                                    }
                                    i65++;
                                    c13807dArr5 = c13807dArr8;
                                }
                            }
                            C13807d[] c13807dArr10 = c13807dArr5;
                            iM15411Y2 = 0;
                            for (i63 = 0; i63 < iCeil2; i63++) {
                                c13807d6 = c13810g.f43763Z0[i63];
                                if (c13807d6 == null) {
                                    if (i63 > 0) {
                                        iM15411Y2 += c13810g.f43754Q0;
                                    }
                                    iM15411Y2 = c13810g.m15411Y(c13807d6, i57) + iM15411Y2;
                                }
                            }
                            iM15410X3 = 0;
                            for (i64 = 0; i64 < iCeil; i64++) {
                                c13807d5 = c13810g.f43762Y0[i64];
                                if (c13807d5 == null) {
                                    if (i64 > 0) {
                                        iM15410X3 += c13810g.f43755R0;
                                    }
                                    iM15410X3 = c13810g.m15410X(c13807d5, i57) + iM15410X3;
                                }
                            }
                            iArr3[0] = iM15411Y2;
                            iArr3[1] = iM15410X3;
                            if (i58 == 0) {
                                if (iM15411Y2 > i57 || iCeil2 <= 1) {
                                    z13 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iM15410X3 > i57 || iCeil <= 1) {
                                z13 = true;
                            } else {
                                iCeil--;
                            }
                            c13807dArr5 = c13807dArr10;
                        }
                        int[] iArr8 = c13810g.f43764a1;
                        iArr8[0] = iCeil2;
                        iArr8[1] = iCeil;
                    } else if (i23 != 3) {
                        i24 = i15;
                        i25 = i14;
                        i26 = i13;
                        i27 = i12;
                        i28 = mode;
                        i29 = size3;
                        i30 = mode2;
                        iArr3 = iArr2;
                    } else {
                        i70 = c13810g.f43760W0;
                        if (i22 == 0) {
                            i24 = i15;
                            i25 = i14;
                            i26 = i13;
                            i27 = i12;
                            i28 = mode;
                            i29 = size3;
                            i30 = mode2;
                            iArr3 = iArr2;
                        } else {
                            arrayList.clear();
                            i71 = i21;
                            iArr3 = iArr2;
                            i24 = i15;
                            i25 = i14;
                            i26 = i13;
                            i27 = i12;
                            arrayList4 = arrayList;
                            c13809f7 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i71);
                            arrayList4.add(c13809f7);
                            if (i70 == 0) {
                                i87 = 0;
                                i76 = 0;
                                i88 = 0;
                                i89 = 0;
                                while (i89 < i22) {
                                    i90 = i87 + 1;
                                    c13807d12 = c13807dArr2[i89];
                                    i91 = i71;
                                    iM15411Y4 = c13810g.m15411Y(c13807d12, i91);
                                    if (c13807d12.f43688q0[0] == 3) {
                                        i76++;
                                    }
                                    int i96 = i76;
                                    z16 = (i88 != i91 || (c13810g.f43754Q0 + i88) + iM15411Y4 > i91) && c13809f7.f43721b != null;
                                    if (!z16 && i89 > 0 && (i93 = c13810g.f43759V0) > 0 && i90 > i93) {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        i71 = i91;
                                        i92 = i89;
                                        C13809f c13809f10 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i71);
                                        c13809f10.f43733n = i92;
                                        arrayList4.add(c13809f10);
                                        c13809f7 = c13809f10;
                                        i88 = iM15411Y4;
                                        i87 = i90;
                                    } else {
                                        i71 = i91;
                                        i92 = i89;
                                        if (i92 > 0) {
                                            i88 = c13810g.f43754Q0 + iM15411Y4 + i88;
                                        } else {
                                            i88 = iM15411Y4;
                                        }
                                        i87 = 0;
                                    }
                                    c13809f7.m15403a(c13807d12);
                                    i89 = i92 + 1;
                                    i76 = i96;
                                    mode2 = mode2;
                                    size3 = size3;
                                    mode = mode;
                                }
                                i28 = mode;
                                i29 = size3;
                                i30 = mode2;
                                i75 = i71;
                            } else {
                                i28 = mode;
                                i29 = size3;
                                i30 = mode2;
                                i72 = 0;
                                i73 = 0;
                                i74 = 0;
                                while (i74 < i22) {
                                    c13807d11 = c13807dArr2[i74];
                                    i77 = i71;
                                    iM15410X4 = c13810g.m15410X(c13807d11, i77);
                                    if (c13807d11.f43688q0[1] == 3) {
                                        i72++;
                                    }
                                    int i97 = i72;
                                    z14 = (i73 != i77 || (c13810g.f43755R0 + i73) + iM15410X4 > i77) && c13809f7.f43721b != null;
                                    if (!z14 && i74 > 0 && (i78 = c13810g.f43759V0) > 0 && i78 < 0) {
                                        z14 = true;
                                    }
                                    if (z14) {
                                        c13807dArr9 = c13807dArr2;
                                        C13809f c13809f11 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i77);
                                        c13809f11.f43733n = i74;
                                        arrayList4.add(c13809f11);
                                        c13809f7 = c13809f11;
                                    } else {
                                        c13807dArr9 = c13807dArr2;
                                        if (i74 > 0) {
                                            i73 = c13810g.f43755R0 + iM15410X4 + i73;
                                        }
                                        c13809f7.m15403a(c13807d11);
                                        i74++;
                                        i72 = i97;
                                        c13807dArr2 = c13807dArr9;
                                        i71 = i77;
                                    }
                                    i73 = iM15410X4;
                                    c13809f7.m15403a(c13807d11);
                                    i74++;
                                    i72 = i97;
                                    c13807dArr2 = c13807dArr9;
                                    i71 = i77;
                                }
                                i75 = i71;
                                i76 = i72;
                            }
                            size2 = arrayList4.size();
                            int i98 = c13810g.f43771x0;
                            i79 = c13810g.f43767t0;
                            i80 = c13810g.f43772y0;
                            i81 = c13810g.f43768u0;
                            if (iArr4[0] != 2 || iArr4[1] == 2) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (i76 > 0 && z15) {
                                for (i86 = 0; i86 < size2; i86++) {
                                    c13809f9 = (C13809f) arrayList4.get(i86);
                                    if (i70 == 0) {
                                        c13809f9.m15407e(i75 - c13809f9.m15406d());
                                    } else {
                                        c13809f9.m15407e(i75 - c13809f9.m15405c());
                                    }
                                }
                            }
                            i82 = i98;
                            c13806c9 = c13806c;
                            c13806c10 = c13806c2;
                            c13806c11 = c13806c3;
                            c13806c12 = c13806c4;
                            i83 = 0;
                            i84 = 0;
                            i85 = 0;
                            while (i83 < size2) {
                                c13809f8 = (C13809f) arrayList4.get(i83);
                                if (i70 == 0) {
                                    if (i83 < size2 - 1) {
                                        c13806c12 = ((C13809f) arrayList4.get(i83 + 1)).f43721b.f43639K;
                                        i81 = 0;
                                    } else {
                                        i81 = c13810g.f43768u0;
                                        c13806c12 = c13806c4;
                                    }
                                    C13806c c13806c13 = c13809f8.f43721b.f43641M;
                                    c13809f8.m15408f(i70, c13806c10, c13806c9, c13806c11, c13806c12, i82, i79, i80, i81, i75);
                                    int iMax = Math.max(i84, c13809f8.m15406d());
                                    iM15405c2 = c13809f8.m15405c() + i85;
                                    if (i83 > 0) {
                                        iM15405c2 += c13810g.f43755R0;
                                    }
                                    size2 = size2;
                                    i84 = iMax;
                                    i85 = iM15405c2;
                                    c13806c9 = c13806c13;
                                    arrayList4 = arrayList4;
                                    i79 = 0;
                                } else {
                                    arrayList5 = arrayList4;
                                    if (i83 < size2 - 1) {
                                        arrayList4 = arrayList5;
                                        c13806c11 = ((C13809f) arrayList4.get(i83 + 1)).f43721b.f43638J;
                                        i80 = 0;
                                    } else {
                                        arrayList4 = arrayList5;
                                        i80 = c13810g.f43772y0;
                                        c13806c11 = c13806c3;
                                    }
                                    C13806c c13806c14 = c13809f8.f43721b.f43640L;
                                    c13809f8.m15408f(i70, c13806c10, c13806c9, c13806c11, c13806c12, i82, i79, i80, i81, i75);
                                    iM15406d2 = c13809f8.m15406d() + i84;
                                    int iMax2 = Math.max(i85, c13809f8.m15405c());
                                    if (i83 > 0) {
                                        iM15406d2 += c13810g.f43754Q0;
                                    }
                                    i84 = iM15406d2;
                                    c13806c10 = c13806c14;
                                    i85 = iMax2;
                                    i82 = 0;
                                }
                                i83++;
                                size2 = size2;
                            }
                            iArr3[0] = i84;
                            iArr3[1] = i85;
                        }
                    }
                } else {
                    i24 = i15;
                    i25 = i14;
                    i26 = i13;
                    i27 = i12;
                    i28 = mode;
                    i29 = size3;
                    i30 = mode2;
                    i31 = size4;
                    c13807dArr3 = c13807dArr2;
                    i38 = i21;
                    iArr3 = iArr2;
                    arrayList2 = arrayList;
                    i39 = c13810g.f43760W0;
                    if (i22 != 0) {
                        arrayList2.clear();
                        c13809f2 = new C13809f(c13810g, i39, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                        arrayList2.add(c13809f2);
                        if (i39 == 0) {
                            i42 = 0;
                            i53 = 0;
                            i54 = 0;
                            while (i54 < i22) {
                                c13807d2 = c13807dArr3[i54];
                                iM15411Y = c13810g.m15411Y(c13807d2, i38);
                                if (c13807d2.f43688q0[0] == 3) {
                                    c13809f6 = c13809f2;
                                    i42++;
                                }
                                c13809f6 = c13809f2;
                                int i99 = i42;
                                z12 = (i53 != i38 || (c13810g.f43754Q0 + i53) + iM15411Y > i38) && c13809f6.f43721b != null;
                                if (!z12 && i54 > 0 && (i56 = c13810g.f43759V0) > 0 && i54 % i56 == 0) {
                                    z12 = true;
                                }
                                if (z12) {
                                    iArr6 = iArr4;
                                    c13807d3 = c13807d2;
                                    i55 = i39;
                                    C13809f c13809f12 = new C13809f(c13810g, i39, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                                    c13809f12.f43733n = i54;
                                    arrayList2.add(c13809f12);
                                    c13809f6 = c13809f12;
                                } else {
                                    iArr6 = iArr4;
                                    c13807d3 = c13807d2;
                                    i55 = i39;
                                    if (i54 > 0) {
                                        i53 = c13810g.f43754Q0 + iM15411Y + i53;
                                    }
                                    c13809f6.m15403a(c13807d3);
                                    i54++;
                                    i42 = i99;
                                    iArr4 = iArr6;
                                    i39 = i55;
                                }
                                i53 = iM15411Y;
                                c13809f6.m15403a(c13807d3);
                                i54++;
                                i42 = i99;
                                iArr4 = iArr6;
                                i39 = i55;
                            }
                            c13809f6 = c13809f2;
                            iArr5 = iArr4;
                            i40 = i39;
                        } else {
                            iArr5 = iArr4;
                            i40 = i39;
                            i41 = 0;
                            i42 = 0;
                            i43 = 0;
                            while (i41 < i22) {
                                c13807d = c13807dArr3[i41];
                                iM15410X = c13810g.m15410X(c13807d, i38);
                                if (c13807d.f43688q0[1] == 3) {
                                    c13809f3 = c13809f2;
                                    i42++;
                                }
                                c13809f3 = c13809f2;
                                int i100 = i42;
                                z10 = (i43 != i38 || (c13810g.f43755R0 + i43) + iM15410X > i38) && c13809f3.f43721b != null;
                                if (!z10 && i41 > 0 && (i44 = c13810g.f43759V0) > 0 && i41 % i44 == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    c13807dArr4 = c13807dArr3;
                                    C13809f c13809f13 = new C13809f(c13810g, i40, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                                    c13809f13.f43733n = i41;
                                    arrayList2.add(c13809f13);
                                    c13809f3 = c13809f13;
                                } else {
                                    c13807dArr4 = c13807dArr3;
                                    if (i41 > 0) {
                                        i43 = c13810g.f43755R0 + iM15410X + i43;
                                    }
                                    c13809f3.m15403a(c13807d);
                                    i41++;
                                    i42 = i100;
                                    c13807dArr3 = c13807dArr4;
                                }
                                i43 = iM15410X;
                                c13809f3.m15403a(c13807d);
                                i41++;
                                i42 = i100;
                                c13807dArr3 = c13807dArr4;
                            }
                            c13809f3 = c13809f2;
                        }
                        size = arrayList2.size();
                        int i101 = c13810g.f43771x0;
                        int i102 = c13810g.f43767t0;
                        i45 = c13810g.f43772y0;
                        i46 = c13810g.f43768u0;
                        if (iArr5[0] != 2 || iArr5[1] == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i42 > 0 && z11) {
                            for (i52 = 0; i52 < size; i52++) {
                                c13809f5 = (C13809f) arrayList2.get(i52);
                                if (i40 == 0) {
                                    c13809f5.m15407e(i38 - c13809f5.m15406d());
                                } else {
                                    c13809f5.m15407e(i38 - c13809f5.m15405c());
                                }
                            }
                        }
                        i47 = i102;
                        c13806c5 = c13806c2;
                        c13806c6 = c13806c3;
                        c13806c7 = c13806c4;
                        i48 = 0;
                        i49 = 0;
                        i50 = 0;
                        i51 = i101;
                        c13806c8 = c13806c;
                        while (i48 < size) {
                            c13809f4 = (C13809f) arrayList2.get(i48);
                            if (i40 == 0) {
                                if (i48 < size - 1) {
                                    c13806c7 = ((C13809f) arrayList2.get(i48 + 1)).f43721b.f43639K;
                                    i46 = 0;
                                } else {
                                    i46 = c13810g.f43768u0;
                                    c13806c7 = c13806c4;
                                }
                                C13806c c13806c15 = c13809f4.f43721b.f43641M;
                                c13809f4.m15408f(i40, c13806c5, c13806c8, c13806c6, c13806c7, i51, i47, i45, i46, i38);
                                int iMax3 = Math.max(i49, c13809f4.m15406d());
                                iM15405c = c13809f4.m15405c() + i50;
                                if (i48 > 0) {
                                    iM15405c += c13810g.f43755R0;
                                }
                                size = size;
                                i49 = iMax3;
                                i50 = iM15405c;
                                c13806c8 = c13806c15;
                                arrayList2 = arrayList2;
                                i47 = 0;
                            } else {
                                arrayList3 = arrayList2;
                                if (i48 < size - 1) {
                                    arrayList2 = arrayList3;
                                    c13806c6 = ((C13809f) arrayList2.get(i48 + 1)).f43721b.f43638J;
                                    i45 = 0;
                                } else {
                                    arrayList2 = arrayList3;
                                    i45 = c13810g.f43772y0;
                                    c13806c6 = c13806c3;
                                }
                                C13806c c13806c16 = c13809f4.f43721b.f43640L;
                                c13809f4.m15408f(i40, c13806c5, c13806c8, c13806c6, c13806c7, i51, i47, i45, i46, i38);
                                iM15406d = c13809f4.m15406d() + i49;
                                int iMax4 = Math.max(i50, c13809f4.m15405c());
                                if (i48 > 0) {
                                    iM15406d += c13810g.f43754Q0;
                                }
                                i49 = iM15406d;
                                i50 = iMax4;
                                i51 = 0;
                                c13806c5 = c13806c16;
                            }
                            i48++;
                            size = size;
                        }
                        iArr3[0] = i49;
                        iArr3[1] = i50;
                    }
                }
            } else {
                i24 = i15;
                i25 = i14;
                i26 = i13;
                i27 = i12;
                i28 = mode;
                i29 = size3;
                i30 = mode2;
                i31 = size4;
                i32 = i21;
                iArr3 = iArr2;
                i33 = c13810g.f43760W0;
                if (i22 == 0) {
                    if (arrayList.size() == 0) {
                        c13809f = new C13809f(c13810g, i33, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i32);
                        arrayList.add(c13809f);
                    } else {
                        c13809f = (C13809f) arrayList.get(0);
                        c13809f.f43722c = 0;
                        c13809f.f43721b = null;
                        c13809f.f43731l = 0;
                        c13809f.f43732m = 0;
                        c13809f.f43733n = 0;
                        c13809f.f43734o = 0;
                        c13809f.f43735p = 0;
                        c13809f.m15408f(i33, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, c13810g.f43771x0, c13810g.f43767t0, c13810g.f43772y0, c13810g.f43768u0, i32);
                    }
                    for (i34 = 0; i34 < i22; i34++) {
                        c13809f.m15403a(c13807dArr2[i34]);
                    }
                    c9 = 0;
                    iArr3[0] = c13809f.m15406d();
                    c10 = 1;
                    iArr3[1] = c13809f.m15405c();
                }
                i35 = iArr3[c9] + i27 + i26;
                i36 = iArr3[c10] + i25 + i24;
                i37 = i28;
                if (i37 == 1073741824) {
                    iMin = i29;
                } else if (i37 == Integer.MIN_VALUE) {
                    iMin = Math.min(i35, i29);
                } else if (i37 == 0) {
                    iMin = i35;
                } else {
                    iMin = 0;
                }
                if (i30 == 1073741824) {
                    iMin2 = i31;
                } else if (i30 == -2147483648) {
                    iMin2 = Math.min(i36, i31);
                } else if (i30 == 0) {
                    iMin2 = i36;
                } else {
                    iMin2 = 0;
                }
                c13810g.f43738A0 = iMin;
                c13810g.f43739B0 = iMin2;
                c13810g.m15371R(iMin);
                c13810g.m15366M(iMin2);
                if (c13810g.f43781s0 > 0) {
                    z6 = c10;
                } else {
                    z6 = 0;
                }
                c13810g.f43773z0 = z6;
            }
            c9 = 0;
            c10 = 1;
            i35 = iArr3[c9] + i27 + i26;
            i36 = iArr3[c10] + i25 + i24;
            i37 = i28;
            if (i37 == 1073741824) {
                iMin = i29;
            } else if (i37 == Integer.MIN_VALUE) {
                iMin = Math.min(i35, i29);
            } else if (i37 == 0) {
                iMin = i35;
            } else {
                iMin = 0;
            }
            if (i30 == 1073741824) {
                iMin2 = i31;
            } else if (i30 == -2147483648) {
                iMin2 = Math.min(i36, i31);
            } else if (i30 == 0) {
                iMin2 = i36;
            } else {
                iMin2 = 0;
            }
            c13810g.f43738A0 = iMin;
            c13810g.f43739B0 = iMin2;
            c13810g.m15371R(iMin);
            c13810g.m15366M(iMin2);
            if (c13810g.f43781s0 > 0) {
                z6 = c10;
            } else {
                z6 = 0;
            }
            c13810g.f43773z0 = z6;
        } else {
            C13808e c13808e = c13810g.f43649U;
            InterfaceC14373c interfaceC14373c = c13808e != null ? c13808e.f43715v0 : null;
            if (interfaceC14373c == null) {
                c13810g.f43738A0 = 0;
                c13810g.f43739B0 = 0;
                c13810g.f43773z0 = false;
            } else {
                for (int i103 = 0; i103 < c13810g.f43781s0; i103++) {
                    C13807d c13807d14 = c13810g.f43780r0[i103];
                    if (c13807d14 != null && !(c13807d14 instanceof C13811h)) {
                        int iM15382k = c13807d14.m15382k(0);
                        int iM15382k2 = c13807d14.m15382k(1);
                        if (iM15382k != 3 || c13807d14.f43690s == 1 || iM15382k2 != 3 || c13807d14.f43691t == 1) {
                            if (iM15382k == 3) {
                                iM15382k = 2;
                            }
                            if (iM15382k2 == 3) {
                                iM15382k2 = 2;
                            }
                            C14372b c14372b = c13810g.f43740C0;
                            c14372b.f45067a = iM15382k;
                            c14372b.f45068b = iM15382k2;
                            c14372b.f45069c = c13807d14.m15387r();
                            c14372b.f45070d = c13807d14.m15383l();
                            interfaceC14373c.mo10946b(c13807d14, c14372b);
                            c13807d14.m15371R(c14372b.f45071e);
                            c13807d14.m15366M(c14372b.f45072f);
                            c13807d14.m15363J(c14372b.f45073g);
                        }
                    }
                }
                i12 = c13810g.f43771x0;
                i13 = c13810g.f43772y0;
                i14 = c13810g.f43767t0;
                i15 = c13810g.f43768u0;
                iArr = new int[2];
                i16 = (size3 - i12) - i13;
                i17 = c13810g.f43760W0;
                if (i17 == 1) {
                    i16 = (size4 - i14) - i15;
                }
                if (i17 == 0) {
                    if (c13810g.f43742E0 == -1) {
                        c13810g.f43742E0 = 0;
                    }
                    if (c13810g.f43743F0 == -1) {
                        c13810g.f43743F0 = 0;
                    }
                } else {
                    if (c13810g.f43742E0 == -1) {
                        c13810g.f43742E0 = 0;
                    }
                    if (c13810g.f43743F0 == -1) {
                        c13810g.f43743F0 = 0;
                    }
                }
                c13807dArr = c13810g.f43780r0;
                i18 = 0;
                i19 = 0;
                while (true) {
                    i20 = c13810g.f43781s0;
                    if (i18 < i20) {
                        break;
                        break;
                    } else {
                        if (c13810g.f43780r0[i18].f43670h0 == 8) {
                            i19++;
                        }
                        i18++;
                    }
                }
                if (i19 > 0) {
                    c13807dArr = new C13807d[i20 - i19];
                    i94 = 0;
                    i22 = 0;
                    while (i94 < c13810g.f43781s0) {
                        c13807d13 = c13810g.f43780r0[i94];
                        int i910 = i16;
                        int[] iArr9 = iArr;
                        if (c13807d13.f43670h0 != 8) {
                            c13807dArr[i22] = c13807d13;
                            i22++;
                        }
                        i94++;
                        i16 = i910;
                        iArr = iArr9;
                    }
                    i21 = i16;
                    iArr2 = iArr;
                } else {
                    i21 = i16;
                    iArr2 = iArr;
                    i22 = i20;
                }
                c13807dArr2 = c13807dArr;
                c13810g.f43765b1 = c13807dArr2;
                c13810g.f43766c1 = i22;
                i23 = c13810g.f43758U0;
                arrayList = c13810g.f43761X0;
                if (i23 != 0) {
                    c13806c = c13810g.f43639K;
                    c13806c2 = c13810g.f43638J;
                    c13806c3 = c13810g.f43640L;
                    c13806c4 = c13810g.f43641M;
                    iArr4 = c13810g.f43688q0;
                    if (i23 != 1) {
                        i31 = size4;
                        if (i23 != 2) {
                            i24 = i15;
                            i25 = i14;
                            i26 = i13;
                            i27 = i12;
                            i28 = mode;
                            i29 = size3;
                            i30 = mode2;
                            c13807dArr5 = c13807dArr2;
                            i57 = i21;
                            iArr3 = iArr2;
                            i58 = c13810g.f43760W0;
                            if (i58 == 0) {
                                i67 = c13810g.f43759V0;
                                if (i67 <= 0) {
                                    i69 = 0;
                                    iCeil2 = 0;
                                    while (i68 < i22) {
                                        if (i68 > 0) {
                                            i69 += c13810g.f43754Q0;
                                        }
                                        c13807d10 = c13807dArr5[i68];
                                        if (c13807d10 != null) {
                                            iM15411Y3 = c13810g.m15411Y(c13807d10, i57) + i69;
                                            if (iM15411Y3 > i57) {
                                                break;
                                                break;
                                            } else {
                                                iCeil2++;
                                                i69 = iM15411Y3;
                                            }
                                        }
                                    }
                                } else {
                                    iCeil2 = i67;
                                }
                                iCeil = 0;
                            } else {
                                iCeil = c13810g.f43759V0;
                                if (iCeil <= 0) {
                                    i60 = 0;
                                    i61 = 0;
                                    while (i59 < i22) {
                                        if (i59 > 0) {
                                            i60 += c13810g.f43755R0;
                                        }
                                        c13807d4 = c13807dArr5[i59];
                                        if (c13807d4 != null) {
                                            iM15410X2 = c13810g.m15410X(c13807d4, i57) + i60;
                                            if (iM15410X2 > i57) {
                                                break;
                                                break;
                                            } else {
                                                i61++;
                                                i60 = iM15410X2;
                                            }
                                        }
                                    }
                                    iCeil = i61;
                                }
                                iCeil2 = 0;
                            }
                            if (c13810g.f43764a1 == null) {
                                c13810g.f43764a1 = new int[2];
                            }
                            if (iCeil != 0) {
                            }
                            while (!z13) {
                                if (i58 == 0) {
                                    iCeil = (int) Math.ceil(i22 / iCeil2);
                                } else {
                                    iCeil2 = (int) Math.ceil(i22 / iCeil);
                                }
                                c13807dArr6 = c13810g.f43763Z0;
                                if (c13807dArr6 != null) {
                                    obj = null;
                                    c13810g.f43763Z0 = new C13807d[iCeil2];
                                } else {
                                    obj = null;
                                    c13810g.f43763Z0 = new C13807d[iCeil2];
                                }
                                c13807dArr7 = c13810g.f43762Y0;
                                if (c13807dArr7 != null) {
                                    c13810g.f43762Y0 = new C13807d[iCeil];
                                } else {
                                    c13810g.f43762Y0 = new C13807d[iCeil];
                                }
                                while (i62 < iCeil2) {
                                    i65 = 0;
                                    while (i65 < iCeil) {
                                        i66 = (i65 * iCeil2) + i62;
                                        if (i58 == 1) {
                                            i66 = (i62 * iCeil) + i65;
                                        }
                                        c13807dArr8 = c13807dArr5;
                                        if (i66 < c13807dArr8.length) {
                                            int iM15411Y6 = c13810g.m15411Y(c13807d7, i57);
                                            c13807d8 = c13810g.f43763Z0[i62];
                                            if (c13807d8 != null) {
                                                c13810g.f43763Z0[i62] = c13807d7;
                                            } else {
                                                c13810g.f43763Z0[i62] = c13807d7;
                                            }
                                            int iM15410X6 = c13810g.m15410X(c13807d7, i57);
                                            c13807d9 = c13810g.f43762Y0[i65];
                                            if (c13807d9 != null) {
                                                c13810g.f43762Y0[i65] = c13807d7;
                                            } else {
                                                c13810g.f43762Y0[i65] = c13807d7;
                                            }
                                        }
                                        i65++;
                                        c13807dArr5 = c13807dArr8;
                                    }
                                }
                                C13807d[] c13807dArr11 = c13807dArr5;
                                iM15411Y2 = 0;
                                while (i63 < iCeil2) {
                                    c13807d6 = c13810g.f43763Z0[i63];
                                    if (c13807d6 == null) {
                                        if (i63 > 0) {
                                            iM15411Y2 += c13810g.f43754Q0;
                                        }
                                        iM15411Y2 = c13810g.m15411Y(c13807d6, i57) + iM15411Y2;
                                    }
                                }
                                iM15410X3 = 0;
                                while (i64 < iCeil) {
                                    c13807d5 = c13810g.f43762Y0[i64];
                                    if (c13807d5 == null) {
                                        if (i64 > 0) {
                                            iM15410X3 += c13810g.f43755R0;
                                        }
                                        iM15410X3 = c13810g.m15410X(c13807d5, i57) + iM15410X3;
                                    }
                                }
                                iArr3[0] = iM15411Y2;
                                iArr3[1] = iM15410X3;
                                if (i58 == 0) {
                                    if (iM15411Y2 > i57) {
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                    }
                                } else if (iM15410X3 > i57) {
                                    z13 = true;
                                } else {
                                    z13 = true;
                                }
                                c13807dArr5 = c13807dArr11;
                            }
                            int[] iArr10 = c13810g.f43764a1;
                            iArr10[0] = iCeil2;
                            iArr10[1] = iCeil;
                        } else if (i23 != 3) {
                            i24 = i15;
                            i25 = i14;
                            i26 = i13;
                            i27 = i12;
                            i28 = mode;
                            i29 = size3;
                            i30 = mode2;
                            iArr3 = iArr2;
                        } else {
                            i70 = c13810g.f43760W0;
                            if (i22 == 0) {
                                i24 = i15;
                                i25 = i14;
                                i26 = i13;
                                i27 = i12;
                                i28 = mode;
                                i29 = size3;
                                i30 = mode2;
                                iArr3 = iArr2;
                            } else {
                                arrayList.clear();
                                i71 = i21;
                                iArr3 = iArr2;
                                i24 = i15;
                                i25 = i14;
                                i26 = i13;
                                i27 = i12;
                                arrayList4 = arrayList;
                                c13809f7 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i71);
                                arrayList4.add(c13809f7);
                                if (i70 == 0) {
                                    i87 = 0;
                                    i76 = 0;
                                    i88 = 0;
                                    i89 = 0;
                                    while (i89 < i22) {
                                        i90 = i87 + 1;
                                        c13807d12 = c13807dArr2[i89];
                                        i91 = i71;
                                        iM15411Y4 = c13810g.m15411Y(c13807d12, i91);
                                        if (c13807d12.f43688q0[0] == 3) {
                                            i76++;
                                        }
                                        int i911 = i76;
                                        if (i88 != i91) {
                                        }
                                        if (!z16) {
                                            z16 = true;
                                        }
                                        if (z16) {
                                            i71 = i91;
                                            i92 = i89;
                                            C13809f c13809f14 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i71);
                                            c13809f14.f43733n = i92;
                                            arrayList4.add(c13809f14);
                                            c13809f7 = c13809f14;
                                            i88 = iM15411Y4;
                                            i87 = i90;
                                        } else {
                                            i71 = i91;
                                            i92 = i89;
                                            if (i92 > 0) {
                                                i88 = c13810g.f43754Q0 + iM15411Y4 + i88;
                                            } else {
                                                i88 = iM15411Y4;
                                            }
                                            i87 = 0;
                                        }
                                        c13809f7.m15403a(c13807d12);
                                        i89 = i92 + 1;
                                        i76 = i911;
                                        mode2 = mode2;
                                        size3 = size3;
                                        mode = mode;
                                    }
                                    i28 = mode;
                                    i29 = size3;
                                    i30 = mode2;
                                    i75 = i71;
                                } else {
                                    i28 = mode;
                                    i29 = size3;
                                    i30 = mode2;
                                    i72 = 0;
                                    i73 = 0;
                                    i74 = 0;
                                    while (i74 < i22) {
                                        c13807d11 = c13807dArr2[i74];
                                        i77 = i71;
                                        iM15410X4 = c13810g.m15410X(c13807d11, i77);
                                        if (c13807d11.f43688q0[1] == 3) {
                                            i72++;
                                        }
                                        int i912 = i72;
                                        if (i73 != i77) {
                                        }
                                        if (!z14) {
                                            z14 = true;
                                        }
                                        if (z14) {
                                            c13807dArr9 = c13807dArr2;
                                            C13809f c13809f15 = new C13809f(c13810g, i70, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i77);
                                            c13809f15.f43733n = i74;
                                            arrayList4.add(c13809f15);
                                            c13809f7 = c13809f15;
                                        } else {
                                            c13807dArr9 = c13807dArr2;
                                            if (i74 > 0) {
                                                i73 = c13810g.f43755R0 + iM15410X4 + i73;
                                            }
                                            c13809f7.m15403a(c13807d11);
                                            i74++;
                                            i72 = i912;
                                            c13807dArr2 = c13807dArr9;
                                            i71 = i77;
                                        }
                                        i73 = iM15410X4;
                                        c13809f7.m15403a(c13807d11);
                                        i74++;
                                        i72 = i912;
                                        c13807dArr2 = c13807dArr9;
                                        i71 = i77;
                                    }
                                    i75 = i71;
                                    i76 = i72;
                                }
                                size2 = arrayList4.size();
                                int i913 = c13810g.f43771x0;
                                i79 = c13810g.f43767t0;
                                i80 = c13810g.f43772y0;
                                i81 = c13810g.f43768u0;
                                if (iArr4[0] != 2) {
                                    z15 = true;
                                } else {
                                    z15 = true;
                                }
                                if (i76 > 0) {
                                    while (i86 < size2) {
                                        c13809f9 = (C13809f) arrayList4.get(i86);
                                        if (i70 == 0) {
                                            c13809f9.m15407e(i75 - c13809f9.m15406d());
                                        } else {
                                            c13809f9.m15407e(i75 - c13809f9.m15405c());
                                        }
                                    }
                                }
                                i82 = i913;
                                c13806c9 = c13806c;
                                c13806c10 = c13806c2;
                                c13806c11 = c13806c3;
                                c13806c12 = c13806c4;
                                i83 = 0;
                                i84 = 0;
                                i85 = 0;
                                while (i83 < size2) {
                                    c13809f8 = (C13809f) arrayList4.get(i83);
                                    if (i70 == 0) {
                                        if (i83 < size2 - 1) {
                                            c13806c12 = ((C13809f) arrayList4.get(i83 + 1)).f43721b.f43639K;
                                            i81 = 0;
                                        } else {
                                            i81 = c13810g.f43768u0;
                                            c13806c12 = c13806c4;
                                        }
                                        C13806c c13806c17 = c13809f8.f43721b.f43641M;
                                        c13809f8.m15408f(i70, c13806c10, c13806c9, c13806c11, c13806c12, i82, i79, i80, i81, i75);
                                        int iMax5 = Math.max(i84, c13809f8.m15406d());
                                        iM15405c2 = c13809f8.m15405c() + i85;
                                        if (i83 > 0) {
                                            iM15405c2 += c13810g.f43755R0;
                                        }
                                        size2 = size2;
                                        i84 = iMax5;
                                        i85 = iM15405c2;
                                        c13806c9 = c13806c17;
                                        arrayList4 = arrayList4;
                                        i79 = 0;
                                    } else {
                                        arrayList5 = arrayList4;
                                        if (i83 < size2 - 1) {
                                            arrayList4 = arrayList5;
                                            c13806c11 = ((C13809f) arrayList4.get(i83 + 1)).f43721b.f43638J;
                                            i80 = 0;
                                        } else {
                                            arrayList4 = arrayList5;
                                            i80 = c13810g.f43772y0;
                                            c13806c11 = c13806c3;
                                        }
                                        C13806c c13806c18 = c13809f8.f43721b.f43640L;
                                        c13809f8.m15408f(i70, c13806c10, c13806c9, c13806c11, c13806c12, i82, i79, i80, i81, i75);
                                        iM15406d2 = c13809f8.m15406d() + i84;
                                        int iMax6 = Math.max(i85, c13809f8.m15405c());
                                        if (i83 > 0) {
                                            iM15406d2 += c13810g.f43754Q0;
                                        }
                                        i84 = iM15406d2;
                                        c13806c10 = c13806c18;
                                        i85 = iMax6;
                                        i82 = 0;
                                    }
                                    i83++;
                                    size2 = size2;
                                }
                                iArr3[0] = i84;
                                iArr3[1] = i85;
                            }
                        }
                    } else {
                        i24 = i15;
                        i25 = i14;
                        i26 = i13;
                        i27 = i12;
                        i28 = mode;
                        i29 = size3;
                        i30 = mode2;
                        i31 = size4;
                        c13807dArr3 = c13807dArr2;
                        i38 = i21;
                        iArr3 = iArr2;
                        arrayList2 = arrayList;
                        i39 = c13810g.f43760W0;
                        if (i22 != 0) {
                            arrayList2.clear();
                            c13809f2 = new C13809f(c13810g, i39, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                            arrayList2.add(c13809f2);
                            if (i39 == 0) {
                                i42 = 0;
                                i53 = 0;
                                i54 = 0;
                                while (i54 < i22) {
                                    c13807d2 = c13807dArr3[i54];
                                    iM15411Y = c13810g.m15411Y(c13807d2, i38);
                                    if (c13807d2.f43688q0[0] == 3) {
                                        c13809f6 = c13809f2;
                                        i42++;
                                    }
                                    c13809f6 = c13809f2;
                                    int i914 = i42;
                                    if (i53 != i38) {
                                    }
                                    if (!z12) {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        iArr6 = iArr4;
                                        c13807d3 = c13807d2;
                                        i55 = i39;
                                        C13809f c13809f16 = new C13809f(c13810g, i39, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                                        c13809f16.f43733n = i54;
                                        arrayList2.add(c13809f16);
                                        c13809f6 = c13809f16;
                                    } else {
                                        iArr6 = iArr4;
                                        c13807d3 = c13807d2;
                                        i55 = i39;
                                        if (i54 > 0) {
                                            i53 = c13810g.f43754Q0 + iM15411Y + i53;
                                        }
                                        c13809f6.m15403a(c13807d3);
                                        i54++;
                                        i42 = i914;
                                        iArr4 = iArr6;
                                        i39 = i55;
                                    }
                                    i53 = iM15411Y;
                                    c13809f6.m15403a(c13807d3);
                                    i54++;
                                    i42 = i914;
                                    iArr4 = iArr6;
                                    i39 = i55;
                                }
                                c13809f6 = c13809f2;
                                iArr5 = iArr4;
                                i40 = i39;
                            } else {
                                iArr5 = iArr4;
                                i40 = i39;
                                i41 = 0;
                                i42 = 0;
                                i43 = 0;
                                while (i41 < i22) {
                                    c13807d = c13807dArr3[i41];
                                    iM15410X = c13810g.m15410X(c13807d, i38);
                                    if (c13807d.f43688q0[1] == 3) {
                                        c13809f3 = c13809f2;
                                        i42++;
                                    }
                                    c13809f3 = c13809f2;
                                    int i104 = i42;
                                    if (i43 != i38) {
                                    }
                                    if (!z10) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        c13807dArr4 = c13807dArr3;
                                        C13809f c13809f17 = new C13809f(c13810g, i40, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i38);
                                        c13809f17.f43733n = i41;
                                        arrayList2.add(c13809f17);
                                        c13809f3 = c13809f17;
                                    } else {
                                        c13807dArr4 = c13807dArr3;
                                        if (i41 > 0) {
                                            i43 = c13810g.f43755R0 + iM15410X + i43;
                                        }
                                        c13809f3.m15403a(c13807d);
                                        i41++;
                                        i42 = i104;
                                        c13807dArr3 = c13807dArr4;
                                    }
                                    i43 = iM15410X;
                                    c13809f3.m15403a(c13807d);
                                    i41++;
                                    i42 = i104;
                                    c13807dArr3 = c13807dArr4;
                                }
                                c13809f3 = c13809f2;
                            }
                            size = arrayList2.size();
                            int i105 = c13810g.f43771x0;
                            int i106 = c13810g.f43767t0;
                            i45 = c13810g.f43772y0;
                            i46 = c13810g.f43768u0;
                            if (iArr5[0] != 2) {
                                z11 = true;
                            } else {
                                z11 = true;
                            }
                            if (i42 > 0) {
                                while (i52 < size) {
                                    c13809f5 = (C13809f) arrayList2.get(i52);
                                    if (i40 == 0) {
                                        c13809f5.m15407e(i38 - c13809f5.m15406d());
                                    } else {
                                        c13809f5.m15407e(i38 - c13809f5.m15405c());
                                    }
                                }
                            }
                            i47 = i106;
                            c13806c5 = c13806c2;
                            c13806c6 = c13806c3;
                            c13806c7 = c13806c4;
                            i48 = 0;
                            i49 = 0;
                            i50 = 0;
                            i51 = i105;
                            c13806c8 = c13806c;
                            while (i48 < size) {
                                c13809f4 = (C13809f) arrayList2.get(i48);
                                if (i40 == 0) {
                                    if (i48 < size - 1) {
                                        c13806c7 = ((C13809f) arrayList2.get(i48 + 1)).f43721b.f43639K;
                                        i46 = 0;
                                    } else {
                                        i46 = c13810g.f43768u0;
                                        c13806c7 = c13806c4;
                                    }
                                    C13806c c13806c19 = c13809f4.f43721b.f43641M;
                                    c13809f4.m15408f(i40, c13806c5, c13806c8, c13806c6, c13806c7, i51, i47, i45, i46, i38);
                                    int iMax7 = Math.max(i49, c13809f4.m15406d());
                                    iM15405c = c13809f4.m15405c() + i50;
                                    if (i48 > 0) {
                                        iM15405c += c13810g.f43755R0;
                                    }
                                    size = size;
                                    i49 = iMax7;
                                    i50 = iM15405c;
                                    c13806c8 = c13806c19;
                                    arrayList2 = arrayList2;
                                    i47 = 0;
                                } else {
                                    arrayList3 = arrayList2;
                                    if (i48 < size - 1) {
                                        arrayList2 = arrayList3;
                                        c13806c6 = ((C13809f) arrayList2.get(i48 + 1)).f43721b.f43638J;
                                        i45 = 0;
                                    } else {
                                        arrayList2 = arrayList3;
                                        i45 = c13810g.f43772y0;
                                        c13806c6 = c13806c3;
                                    }
                                    C13806c c13806c110 = c13809f4.f43721b.f43640L;
                                    c13809f4.m15408f(i40, c13806c5, c13806c8, c13806c6, c13806c7, i51, i47, i45, i46, i38);
                                    iM15406d = c13809f4.m15406d() + i49;
                                    int iMax8 = Math.max(i50, c13809f4.m15405c());
                                    if (i48 > 0) {
                                        iM15406d += c13810g.f43754Q0;
                                    }
                                    i49 = iM15406d;
                                    i50 = iMax8;
                                    i51 = 0;
                                    c13806c5 = c13806c110;
                                }
                                i48++;
                                size = size;
                            }
                            iArr3[0] = i49;
                            iArr3[1] = i50;
                        }
                    }
                } else {
                    i24 = i15;
                    i25 = i14;
                    i26 = i13;
                    i27 = i12;
                    i28 = mode;
                    i29 = size3;
                    i30 = mode2;
                    i31 = size4;
                    i32 = i21;
                    iArr3 = iArr2;
                    i33 = c13810g.f43760W0;
                    if (i22 == 0) {
                        if (arrayList.size() == 0) {
                            c13809f = new C13809f(c13810g, i33, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, i32);
                            arrayList.add(c13809f);
                        } else {
                            c13809f = (C13809f) arrayList.get(0);
                            c13809f.f43722c = 0;
                            c13809f.f43721b = null;
                            c13809f.f43731l = 0;
                            c13809f.f43732m = 0;
                            c13809f.f43733n = 0;
                            c13809f.f43734o = 0;
                            c13809f.f43735p = 0;
                            c13809f.m15408f(i33, c13810g.f43638J, c13810g.f43639K, c13810g.f43640L, c13810g.f43641M, c13810g.f43771x0, c13810g.f43767t0, c13810g.f43772y0, c13810g.f43768u0, i32);
                        }
                        while (i34 < i22) {
                            c13809f.m15403a(c13807dArr2[i34]);
                        }
                        c9 = 0;
                        iArr3[0] = c13809f.m15406d();
                        c10 = 1;
                        iArr3[1] = c13809f.m15405c();
                    }
                    i35 = iArr3[c9] + i27 + i26;
                    i36 = iArr3[c10] + i25 + i24;
                    i37 = i28;
                    if (i37 == 1073741824) {
                        iMin = i29;
                    } else if (i37 == Integer.MIN_VALUE) {
                        iMin = Math.min(i35, i29);
                    } else if (i37 == 0) {
                        iMin = i35;
                    } else {
                        iMin = 0;
                    }
                    if (i30 == 1073741824) {
                        iMin2 = i31;
                    } else if (i30 == -2147483648) {
                        iMin2 = Math.min(i36, i31);
                    } else if (i30 == 0) {
                        iMin2 = i36;
                    } else {
                        iMin2 = 0;
                    }
                    c13810g.f43738A0 = iMin;
                    c13810g.f43739B0 = iMin2;
                    c13810g.m15371R(iMin);
                    c13810g.m15366M(iMin2);
                    if (c13810g.f43781s0 > 0) {
                        z6 = c10;
                    } else {
                        z6 = 0;
                    }
                    c13810g.f43773z0 = z6;
                }
                c9 = 0;
                c10 = 1;
                i35 = iArr3[c9] + i27 + i26;
                i36 = iArr3[c10] + i25 + i24;
                i37 = i28;
                if (i37 == 1073741824) {
                    iMin = i29;
                } else if (i37 == Integer.MIN_VALUE) {
                    iMin = Math.min(i35, i29);
                } else if (i37 == 0) {
                    iMin = i35;
                } else {
                    iMin = 0;
                }
                if (i30 == 1073741824) {
                    iMin2 = i31;
                } else if (i30 == -2147483648) {
                    iMin2 = Math.min(i36, i31);
                } else if (i30 == 0) {
                    iMin2 = i36;
                } else {
                    iMin2 = 0;
                }
                c13810g.f43738A0 = iMin;
                c13810g.f43739B0 = iMin2;
                c13810g.m15371R(iMin);
                c13810g.m15366M(iMin2);
                if (c13810g.f43781s0 > 0) {
                    z6 = c10;
                } else {
                    z6 = 0;
                }
                c13810g.f43773z0 = z6;
            }
        }
        setMeasuredDimension(c13810g.f43738A0, c13810g.f43739B0);
    }

    @Override // p822j2.AbstractC16045b, android.view.View
    public final void onMeasure(int i10, int i11) {
        mo11360j(this.f32836x0, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f32836x0.f43750M0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f32836x0.f43744G0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f32836x0.f43751N0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f32836x0.f43745H0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f32836x0.f43756S0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f32836x0.f43748K0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f32836x0.f43754Q0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f32836x0.f43742E0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f32836x0.f43752O0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f32836x0.f43746I0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f32836x0.f43753P0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f32836x0.f43747J0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f32836x0.f43759V0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f32836x0.f43760W0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        C13810g c13810g = this.f32836x0;
        c13810g.f43767t0 = i10;
        c13810g.f43768u0 = i10;
        c13810g.f43769v0 = i10;
        c13810g.f43770w0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f32836x0.f43768u0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f32836x0.f43771x0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f32836x0.f43772y0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f32836x0.f43767t0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f32836x0.f43757T0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f32836x0.f43749L0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f32836x0.f43755R0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f32836x0.f43743F0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f32836x0.f43758U0 = i10;
        requestLayout();
    }
}
