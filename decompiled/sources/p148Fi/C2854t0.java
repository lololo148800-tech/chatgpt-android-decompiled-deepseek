package p148Fi;

import ai.AbstractC10620k;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.C0644w;
import p044Bh.C1302o;
import p044Bh.InterfaceC1301n;
import p071Ch.C1663C;
import p071Ch.C1676g;
import p1111xl.C21296a;
import p1113xn.C21307a;
import p1155zi.C21902C2;
import p1155zi.EnumC22033m2;
import p172Gi.C3086s;
import p174Gk.uSfJ.HpucjswO;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p317Mg.C5350a;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6226E;
import p364Oh.C6248v;
import p432Rh.C6889b;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17678l;
import p929oi.AbstractC18201b;
import p948pi.C18418a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Fi.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2854t0 {

    /* JADX INFO: renamed from: a */
    public final C6889b f8612a;

    /* JADX INFO: renamed from: b */
    public final C5350a f8613b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1301n f8614c;

    /* JADX INFO: renamed from: d */
    public final C1676g f8615d;

    /* JADX INFO: renamed from: e */
    public final C18418a f8616e;

    /* JADX INFO: renamed from: f */
    public final C6226E f8617f;

    public C2854t0(C6889b requester, C5350a developerSettingsStore, InterfaceC1301n integrityTokenGenerator, C1676g devicePreferences, C18418a accountSession, C6226E servicesConfig) {
        AbstractC16544l.m18094g(requester, "requester");
        AbstractC16544l.m18094g(developerSettingsStore, "developerSettingsStore");
        AbstractC16544l.m18094g(integrityTokenGenerator, "integrityTokenGenerator");
        AbstractC16544l.m18094g(devicePreferences, "devicePreferences");
        AbstractC16544l.m18094g(accountSession, "accountSession");
        AbstractC16544l.m18094g(servicesConfig, "servicesConfig");
        this.f8612a = requester;
        this.f8613b = developerSettingsStore;
        this.f8614c = integrityTokenGenerator;
        this.f8615d = devicePreferences;
        this.f8616e = accountSession;
        this.f8617f = servicesConfig;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: a */
    public final Object m3715a(String str, String str2, EnumC22033m2 enumC22033m2, String str3, AbstractC19687c abstractC19687c) throws NoSuchAlgorithmException {
        C2844o0 c2844o0;
        String strM12905d;
        C2854t0 c2854t0;
        InterfaceC3777y interfaceC3777yM18075c;
        if (abstractC19687c instanceof C2844o0) {
            c2844o0 = (C2844o0) abstractC19687c;
            int i10 = c2844o0.f8594q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2844o0.f8594q0 = i10 - Integer.MIN_VALUE;
            } else {
                c2844o0 = new C2844o0(this, abstractC19687c);
            }
        } else {
            c2844o0 = new C2844o0(this, abstractC19687c);
        }
        Object objM2494a = c2844o0.f8592o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c2844o0.f8594q0;
        if (i11 != 0) {
            if (i11 == 1) {
                strM12905d = c2844o0.f8591Z;
                c2854t0 = c2844o0.f8590Y;
                AbstractC9233X.m9807c(objM2494a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM2494a);
            }
        }
        AbstractC9233X.m9807c(objM2494a);
        strM12905d = AbstractC18201b.f58034a.m12905d(C2838l1.Companion.serializer(), new C2838l1(str, str2, this.f8615d.m2506a() + ":" + this.f8616e.f58776d + ":" + System.currentTimeMillis(), enumC22033m2, AbstractC10620k.f31511a, str3));
        MessageDigest messageDigest = MessageDigest.getInstance(HpucjswO.HzoGvFLAbjrdT);
        byte[] bytes = strM12905d.getBytes(C21307a.f67720a);
        AbstractC16544l.m18093f(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC16544l.m18091d(bArrDigest);
        String strM19282E = AbstractC17678l.m19282E(bArrDigest, "", C2846p0.f8598p0, 30);
        c2844o0.f8590Y = this;
        c2844o0.f8591Z = strM12905d;
        c2844o0.f8594q0 = 1;
        objM2494a = ((C1663C) this.f8614c).m2494a(strM19282E, false, c2844o0);
        if (objM2494a == enumC19250a) {
            return enumC19250a;
        }
        c2854t0 = this;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM2494a;
        if (!(abstractC6224C instanceof C6223B)) {
            if ((abstractC6224C instanceof AbstractC6249w) || (abstractC6224C instanceof C6248v)) {
                return abstractC6224C;
            }
            throw new C0644w();
        }
        C1302o c1302o = (C1302o) ((C6223B) abstractC6224C).f20258a;
        C6889b c6889b = c2854t0.f8612a;
        C2848q0 c2848q0 = new C2848q0(strM12905d, c1302o, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21902C2.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C21902C2.class);
        } catch (Throwable unused) {
            interfaceC3777yM18075c = null;
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        c2844o0.f8590Y = null;
        c2844o0.f8591Z = null;
        c2844o0.f8594q0 = 2;
        c6889b.getClass();
        objM2494a = AbstractC9144I.m9690b(c6889b, c21296a, c2848q0, c2844o0);
        return objM2494a == enumC19250a ? enumC19250a : objM2494a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3716b(C3086s c3086s, AbstractC19694j abstractC19694j) {
        InterfaceC3777y interfaceC3777yM18075c = null;
        C2852s0 c2852s0 = new C2852s0(c3086s, null);
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
        try {
            interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
        } catch (Throwable unused) {
        }
        C21296a c21296a = new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c);
        C6889b c6889b = this.f8612a;
        c6889b.getClass();
        return AbstractC9144I.m9690b(c6889b, c21296a, c2852s0, abstractC19694j);
    }
}
