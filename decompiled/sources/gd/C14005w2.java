package gd;

import android.gov.nist.core.Separators;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.InterfaceC0571F;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p195Hh.C3430e;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8152n6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p722e8.C13298H;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: gd.w2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14005w2 implements InterfaceC13849E {

    /* JADX INFO: renamed from: f */
    public static final long f44082f;

    /* JADX INFO: renamed from: a */
    public final C13985r2 f44083a;

    /* JADX INFO: renamed from: b */
    public final Set f44084b;

    /* JADX INFO: renamed from: c */
    public final C3430e f44085c;

    /* JADX INFO: renamed from: d */
    public final C2153Q0 f44086d;

    /* JADX INFO: renamed from: e */
    public final C2153Q0 f44087e;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f44082f = AbstractC8128k6.m8644j(10, EnumC21557d.SECONDS);
    }

    public C14005w2(InterfaceC0571F interfaceC0571F, C13985r2 c13985r2, Set set) {
        this.f44083a = c13985r2;
        this.f44084b = set;
        C3430e c3430eM8749b = AbstractC8168p6.m8749b("StatsigManager", "Experimentation");
        this.f44085c = c3430eM8749b;
        C2153Q0 c2153q0M3204c = AbstractC2124C.m3204c(EnumC13846D.f43882Y);
        this.f44086d = c2153q0M3204c;
        this.f44087e = c2153q0M3204c;
        AbstractC8160o6.m8726a(c3430eM8749b, "StatsigManager init", null, 6);
        AbstractC0575H.m1156D(c13985r2.f44045a, null, null, new C13981q2(c13985r2, new C13298H(this, 9), null), 3);
        AbstractC0575H.m1156D(interfaceC0571F, null, null, new C13997u2(this, null), 3);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15481a(AbstractC13881O1 key) {
        boolean zCheckGate;
        C3430e c3430e = this.f44085c;
        AbstractC16544l.m18094g(key, "key");
        String str = key.f43920a;
        try {
            zCheckGate = this.f44083a.f44049e.checkGate(str);
        } catch (IllegalStateException e10) {
            AbstractC8160o6.m8731f(c3430e, "Statsig not initialized", e10, null, 4);
            zCheckGate = false;
        }
        AbstractC8160o6.m8726a(c3430e, "Statsig get " + str + Separators.f31991SP + zCheckGate, null, 6);
        AbstractC8168p6.m8748a(this.f44084b, str, Boolean.valueOf(zCheckGate), c3430e);
        return zCheckGate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m15482b(AbstractC13881O1 abstractC13881O1, AbstractC19687c abstractC19687c) {
        C14001v2 c14001v2;
        C14005w2 c14005w2;
        if (abstractC19687c instanceof C14001v2) {
            c14001v2 = (C14001v2) abstractC19687c;
            int i10 = c14001v2.f44078q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c14001v2.f44078q0 = i10 - Integer.MIN_VALUE;
            } else {
                c14001v2 = new C14001v2(this, abstractC19687c);
            }
        } else {
            c14001v2 = new C14001v2(this, abstractC19687c);
        }
        Object obj = c14001v2.f44076o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c14001v2.f44078q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c14001v2.f44074Y = this;
            c14001v2.f44075Z = abstractC13881O1;
            c14001v2.f44078q0 = 1;
            if (AbstractC8152n6.m8700d(this, c14001v2) == enumC19250a) {
                return enumC19250a;
            }
            c14005w2 = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC13881O1 = c14001v2.f44075Z;
            c14005w2 = c14001v2.f44074Y;
            AbstractC9233X.m9807c(obj);
        }
        return Boolean.valueOf(c14005w2.m15481a(abstractC13881O1));
    }
}
