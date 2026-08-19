package p881m0;

import p1000s0.C19392A;
import p1000s0.C19408d;
import p1000s0.C19414j;
import p1000s0.C19419o;
import p1000s0.C19429y;
import p530Vi.AbstractC8301I;
import p544W9.AbstractC8484G4;
import p860l0.EnumC16673F0;

/* JADX INFO: renamed from: m0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C17127d implements InterfaceC17137n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C19408d f54762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C19419o f54763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C19392A f54764c;

    public C17127d(C19408d c19408d, C19419o c19419o, C19392A c19392a) {
        this.f54762a = c19408d;
        this.f54763b = c19419o;
        this.f54764c = c19392a;
    }

    @Override // p881m0.InterfaceC17137n
    /* JADX INFO: renamed from: a */
    public final float mo18895a(float f10, float f11) {
        C19408d c19408d = this.f54762a;
        int iM20501m = ((C19429y) c19408d.f61452o.getValue()).f61599c + c19408d.m20501m();
        if (iM20501m == 0) {
            return 0.0f;
        }
        int i10 = f10 < 0.0f ? c19408d.f61441d + 1 : c19408d.f61441d;
        int iM8921l = AbstractC8301I.m8921l(((int) (f11 / iM20501m)) + i10, 0, c19408d.mo20500l());
        c19408d.m20501m();
        int i11 = ((C19429y) c19408d.f61452o.getValue()).f61599c;
        long j10 = i10;
        this.f54764c.getClass();
        long j11 = 1;
        int iAbs = Math.abs((AbstractC8301I.m8921l(AbstractC8301I.m8921l(iM8921l, (int) AbstractC8301I.m8916g(j10 - j11, 0L), (int) AbstractC8301I.m8918i(j10 + j11, 2147483647L)), 0, c19408d.mo20500l()) - i10) * iM20501m) - iM20501m;
        int i12 = iAbs >= 0 ? iAbs : 0;
        if (i12 == 0) {
            return i12;
        }
        return Math.signum(f10) * i12;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    @Override // p881m0.InterfaceC17137n
    /* JADX INFO: renamed from: b */
    public final float mo18896b(float f10) {
        C19408d c19408d = this.f54762a;
        InterfaceC17139p interfaceC17139p = c19408d.m20499k().f61611o;
        ?? r10 = c19408d.m20499k().f61597a;
        int size = r10.size();
        float f11 = Float.POSITIVE_INFINITY;
        float f12 = Float.NEGATIVE_INFINITY;
        for (int i10 = 0; i10 < size; i10++) {
            C19414j c19414j = (C19414j) r10.get(i10);
            C19429y c19429yM20499k = c19408d.m20499k();
            int iM20511d = (int) (c19429yM20499k.f61601e == EnumC16673F0.f53401Y ? c19429yM20499k.m20511d() & 4294967295L : c19429yM20499k.m20511d() >> 32);
            int i11 = -c19408d.m20499k().f61602f;
            int i12 = c19408d.m20499k().f61600d;
            float fMo18903a = c19414j.f61533m - interfaceC17139p.mo18903a(iM20511d, c19408d.m20499k().f61598b, i11, i12, c19414j.f61521a, c19408d.mo20500l());
            if (fMo18903a <= 0.0f && fMo18903a > f12) {
                f12 = fMo18903a;
            }
            if (fMo18903a >= 0.0f && fMo18903a < f11) {
                f11 = fMo18903a;
            }
        }
        if (f12 == Float.NEGATIVE_INFINITY) {
            f12 = f11;
        }
        if (f11 == Float.POSITIVE_INFINITY) {
            f11 = f12;
        }
        boolean z6 = AbstractC8484G4.m9136c(c19408d) == 0.0f;
        if (!c19408d.mo5258d()) {
            if (z6 || !AbstractC8484G4.m9137d(c19408d)) {
                f11 = 0.0f;
            } else {
                f12 = 0.0f;
                f11 = 0.0f;
            }
        }
        if (!c19408d.mo5257c()) {
            if (z6 || AbstractC8484G4.m9137d(c19408d)) {
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
                f11 = 0.0f;
            }
        }
        Float fValueOf = Float.valueOf(f12);
        Float fValueOf2 = Float.valueOf(f11);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = ((Number) this.f54763b.invoke(Float.valueOf(f10), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
        if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f) {
            if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
                return 0.0f;
            }
            return fFloatValue3;
        }
        throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
    }
}
