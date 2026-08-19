package p774h1;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.AbstractC16544l;
import p654b1.AbstractC11212f;
import p797i1.AbstractC14901c;
import p797i1.C14902d;
import p797i1.C14914p;
import p797i1.C14915q;
import p797i1.C14916r;
import p797i1.C14917s;
import p797i1.InterfaceC14907i;
import p817j$.util.function.DoubleUnaryOperator$CC;

/* JADX INFO: renamed from: h1.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC14370z {
    /* JADX WARN: Type inference failed for: r6v0, types: [h1.x] */
    /* JADX WARN: Type inference failed for: r7v0, types: [h1.x] */
    /* JADX INFO: renamed from: a */
    public static final ColorSpace m15812a(AbstractC14901c abstractC14901c) {
        ColorSpace.Rgb.TransferParameters transferParametersM15791f;
        ColorSpace.Rgb rgbM15793h;
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46407c)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46419o)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46420p)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46417m)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46412h)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46411g)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46422r)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46421q)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46413i)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46414j)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46409e)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46410f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46408d)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46415k)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46418n)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC16544l.m18089b(abstractC14901c, C14902d.f46416l)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC14901c instanceof C14915q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        C14915q c14915q = (C14915q) abstractC14901c;
        float[] fArrM16086a = c14915q.f46453d.m16086a();
        C14916r c14916r = c14915q.f46456g;
        if (c14916r != null) {
            AbstractC14367w.m15797l();
            transferParametersM15791f = AbstractC14367w.m15791f(c14916r.f46468b, c14916r.f46469c, c14916r.f46470d, c14916r.f46471e, c14916r.f46472f, c14916r.f46473g, c14916r.f46467a);
        } else {
            transferParametersM15791f = null;
        }
        if (transferParametersM15791f != null) {
            AbstractC14367w.m15809x();
            rgbM15793h = AbstractC14367w.m15792g(abstractC14901c.f46402a, c14915q.f46457h, fArrM16086a, transferParametersM15791f);
        } else {
            AbstractC14367w.m15809x();
            String str = abstractC14901c.f46402a;
            final C14914p c14914p = c14915q.f46461l;
            final int i10 = 0;
            ?? r6 = new DoubleUnaryOperator() { // from class: h1.x
                public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                    int i11 = i10;
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    switch (i10) {
                        case 0:
                            return ((Number) ((C14914p) c14914p).invoke(Double.valueOf(d10))).doubleValue();
                        default:
                            return ((Number) ((C14914p) c14914p).invoke(Double.valueOf(d10))).doubleValue();
                    }
                }

                public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                    int i11 = i10;
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
                }
            };
            final C14914p c14914p2 = c14915q.f46464o;
            final int i11 = 1;
            C14915q c14915q2 = (C14915q) abstractC14901c;
            rgbM15793h = AbstractC14367w.m15793h(str, c14915q.f46457h, fArrM16086a, r6, new DoubleUnaryOperator() { // from class: h1.x
                public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                    int i12 = i11;
                    return DoubleUnaryOperator$CC.$default$andThen(this, doubleUnaryOperator);
                }

                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    switch (i11) {
                        case 0:
                            return ((Number) ((C14914p) c14914p2).invoke(Double.valueOf(d10))).doubleValue();
                        default:
                            return ((Number) ((C14914p) c14914p2).invoke(Double.valueOf(d10))).doubleValue();
                    }
                }

                public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                    int i12 = i11;
                    return DoubleUnaryOperator$CC.$default$compose(this, doubleUnaryOperator);
                }
            }, c14915q2.f46454e, c14915q2.f46455f);
        }
        return AbstractC11212f.m12421k(rgbM15793h);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC14901c m15813b(final ColorSpace colorSpace) {
        C14917s c14917s;
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return C14902d.f46407c;
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return C14902d.f46419o;
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return C14902d.f46420p;
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C14902d.f46417m;
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return C14902d.f46412h;
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return C14902d.f46411g;
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C14902d.f46422r;
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C14902d.f46421q;
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C14902d.f46413i;
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C14902d.f46414j;
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C14902d.f46409e;
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C14902d.f46410f;
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C14902d.f46408d;
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C14902d.f46415k;
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C14902d.f46418n;
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C14902d.f46416l;
        }
        if (!AbstractC11212f.m12425o(colorSpace)) {
            return C14902d.f46407c;
        }
        ColorSpace.Rgb.TransferParameters transferParameters = AbstractC11212f.m12419i(colorSpace).getTransferParameters();
        if (AbstractC11212f.m12419i(colorSpace).getWhitePoint().length == 3) {
            float f10 = AbstractC11212f.m12419i(colorSpace).getWhitePoint()[0];
            float f11 = AbstractC11212f.m12419i(colorSpace).getWhitePoint()[1];
            float f12 = f10 + f11 + AbstractC11212f.m12419i(colorSpace).getWhitePoint()[2];
            c14917s = new C14917s(f10 / f12, f11 / f12);
        } else {
            c14917s = new C14917s(AbstractC11212f.m12419i(colorSpace).getWhitePoint()[0], AbstractC11212f.m12419i(colorSpace).getWhitePoint()[1]);
        }
        C14917s c14917s2 = c14917s;
        C14916r c14916r = transferParameters != null ? new C14916r(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null;
        String name = AbstractC11212f.m12419i(colorSpace).getName();
        float[] primaries = AbstractC11212f.m12419i(colorSpace).getPrimaries();
        float[] transform = AbstractC11212f.m12419i(colorSpace).getTransform();
        final int i10 = 0;
        InterfaceC14907i interfaceC14907i = new InterfaceC14907i() { // from class: h1.y
            @Override // p797i1.InterfaceC14907i
            /* JADX INFO: renamed from: b */
            public final double mo9580b(double d10) {
                switch (i10) {
                    case 0:
                        return AbstractC11212f.m12419i(colorSpace).getOetf().applyAsDouble(d10);
                    default:
                        return AbstractC11212f.m12419i(colorSpace).getEotf().applyAsDouble(d10);
                }
            }
        };
        final int i11 = 1;
        return new C14915q(name, primaries, c14917s2, transform, interfaceC14907i, new InterfaceC14907i() { // from class: h1.y
            @Override // p797i1.InterfaceC14907i
            /* JADX INFO: renamed from: b */
            public final double mo9580b(double d10) {
                switch (i11) {
                    case 0:
                        return AbstractC11212f.m12419i(colorSpace).getOetf().applyAsDouble(d10);
                    default:
                        return AbstractC11212f.m12419i(colorSpace).getEotf().applyAsDouble(d10);
                }
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), c14916r, AbstractC11212f.m12419i(colorSpace).getId());
    }
}
