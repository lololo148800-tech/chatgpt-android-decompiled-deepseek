package p338Ne;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p015Ad.AbstractC0434i;
import p025An.C0644w;
import p067Cd.C1632f;
import p068Ce.C1637e;
import p068Ce.C1638f;
import p068Ce.C1639g;
import p068Ce.C1641i;
import p093Dd.C2011c;
import p093Dd.C2014f;
import p093Dd.C2017i;
import p1111xl.C21296a;
import p1113xn.AbstractC21322p;
import p1126yd.C21462c;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C21984a1;
import p225Im.InterfaceC3756d;
import p225Im.InterfaceC3777y;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p381Pe.C6394e;
import p403Qd.C6604J;
import p403Qd.C6636i;
import p403Qd.EnumC6624c;
import p571X9.AbstractC9144I;
import p571X9.AbstractC9233X;
import p575Xd.C9436E;
import p621Zd.C10282c;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p925oe.C18077B;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ne.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5718f {

    /* JADX INFO: renamed from: a */
    public final C1641i f18521a;

    /* JADX INFO: renamed from: b */
    public final C18077B f18522b;

    public C5718f(C1641i c1641i, C18077B c18077b) {
        this.f18521a = c1641i;
        this.f18522b = c18077b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m6152a(String str, String str2, AbstractC19687c abstractC19687c, boolean z6) {
        C5713a c5713a;
        if (abstractC19687c instanceof C5713a) {
            c5713a = (C5713a) abstractC19687c;
            int i10 = c5713a.f18507o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5713a.f18507o0 = i10 - Integer.MIN_VALUE;
            } else {
                c5713a = new C5713a(this, abstractC19687c);
            }
        } else {
            c5713a = new C5713a(this, abstractC19687c);
        }
        Object objM9690b = c5713a.f18505Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5713a.f18507o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c5713a.f18507o0 = 1;
            C1641i c1641i = this.f18521a;
            C2011c c2011c = new C2011c(str, str2, z6);
            InterfaceC3777y interfaceC3777yM18075c = null;
            C1637e c1637e = new C1637e(c2011c, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C2014f.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C2014f.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c1641i.f4645a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1637e, c5713a);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (abstractC6224C instanceof C6223B) {
            C2014f c2014f = (C2014f) ((C6223B) abstractC6224C).f20258a;
            AbstractC16544l.m18094g(c2014f, "<this>");
            return new C21952P1(new C2017i(c2014f.f6173a, c2014f.f6174b, c2014f.f6178f));
        }
        if (abstractC6224C instanceof C6248v) {
            return C21929J1.f69476a;
        }
        if (!(abstractC6224C instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        abstractC6224C.getClass();
        return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m6153b(String str, AbstractC19687c abstractC19687c) {
        C5714b c5714b;
        if (abstractC19687c instanceof C5714b) {
            c5714b = (C5714b) abstractC19687c;
            int i10 = c5714b.f18510o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5714b.f18510o0 = i10 - Integer.MIN_VALUE;
            } else {
                c5714b = new C5714b(this, abstractC19687c);
            }
        } else {
            c5714b = new C5714b(this, abstractC19687c);
        }
        Object objM9690b = c5714b.f18508Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5714b.f18510o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c5714b.f18510o0 = 1;
            C1641i c1641i = this.f18521a;
            InterfaceC3777y interfaceC3777yM18075c = null;
            C1638f c1638f = new C1638f(str, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C17296C.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C17296C.class);
            } catch (Throwable unused) {
            }
            objM9690b = AbstractC9144I.m9690b(c1641i.f4645a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1638f, c5714b);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM9690b);
        }
        return ((AbstractC6224C) objM9690b).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: c */
    public final Object m6154c(String str, AbstractC19687c abstractC19687c) {
        C5715c c5715c;
        InterfaceC3777y interfaceC3777yM18075c;
        String str2 = str;
        if (abstractC19687c instanceof C5715c) {
            c5715c = (C5715c) abstractC19687c;
            int i10 = c5715c.f18514p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5715c.f18514p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5715c = new C5715c(this, abstractC19687c);
            }
        } else {
            c5715c = new C5715c(this, abstractC19687c);
        }
        Object objM9690b = c5715c.f18512Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5715c.f18514p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM9690b);
            c5715c.f18511Y = str2;
            c5715c.f18514p0 = 1;
            C1641i c1641i = this.f18521a;
            C1639g c1639g = new C1639g(str2, null);
            InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(C21462c.class);
            try {
                interfaceC3777yM18075c = AbstractC16526C.m18075c(C21462c.class);
            } catch (Throwable unused) {
                interfaceC3777yM18075c = null;
            }
            objM9690b = AbstractC9144I.m9690b(c1641i.f4645a, new C21296a(interfaceC3756dMo5693b, interfaceC3777yM18075c), c1639g, c5715c);
            if (objM9690b == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c5715c.f18511Y;
            AbstractC9233X.m9807c(objM9690b);
        }
        String value = str2;
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM9690b;
        if (!(abstractC6224C instanceof C6223B)) {
            if (abstractC6224C instanceof C6248v) {
                return C21929J1.f69476a;
            }
            if (!(abstractC6224C instanceof AbstractC6249w)) {
                throw new C0644w();
            }
            abstractC6224C.getClass();
            return AbstractC6224C.m6734a((AbstractC6249w) abstractC6224C);
        }
        AbstractC16544l.m18094g(value, "value");
        C21462c toDomainConversation = (C21462c) ((C6223B) abstractC6224C).f20258a;
        AbstractC16544l.m18094g(toDomainConversation, "$this$toDomainConversation");
        C10282c.Companion.getClass();
        String str3 = toDomainConversation.f68051a;
        C10282c c10282c = new C10282c(str3, str3 == null || str3.length() == 0, true, (String) null, false, 24);
        C6394e c6394eM1092d = AbstractC0434i.m1092d(toDomainConversation.f68057g, value, c10282c);
        String str4 = toDomainConversation.f68053c;
        String string = str4 != null ? AbstractC21322p.m21711s0(str4).toString() : null;
        List list = toDomainConversation.f68058h;
        int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(list, 10));
        if (iM19257b < 16) {
            iM19257b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
        for (Object obj : list) {
            linkedHashMap.put(new C21984a1(((C1632f) obj).f4622a), obj);
        }
        C6636i c6636i = new C6636i(value, value, toDomainConversation.f68055e, toDomainConversation.f68056f, toDomainConversation.f68054d, string, (Map) linkedHashMap, (C9436E) null, (String) null, toDomainConversation.f68060j, toDomainConversation.f68061k, (String) null, (EnumC6624c) null, (String) null, false, c6394eM1092d, 1045376);
        Boolean bool = toDomainConversation.f68052b;
        return new C21952P1(new C6604J(c6636i, c10282c, bool != null ? bool.booleanValue() : false));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m6155d(String str, String str2, AbstractC19687c abstractC19687c, boolean z6) {
        C5716d c5716d;
        if (abstractC19687c instanceof C5716d) {
            c5716d = (C5716d) abstractC19687c;
            int i10 = c5716d.f18517o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5716d.f18517o0 = i10 - Integer.MIN_VALUE;
            } else {
                c5716d = new C5716d(this, abstractC19687c);
            }
        } else {
            c5716d = new C5716d(this, abstractC19687c);
        }
        C5716d c5716d2 = c5716d;
        Object objM2487a = c5716d2.f18515Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5716d2.f18517o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM2487a);
            Boolean boolValueOf = Boolean.valueOf(z6);
            c5716d2.f18517o0 = 1;
            objM2487a = C1641i.m2487a(this.f18521a, str, boolValueOf, str2, true, null, c5716d2, 16);
            if (objM2487a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM2487a);
        }
        return ((AbstractC6224C) objM2487a).m6735b();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m6156e(String str, String str2, AbstractC19687c abstractC19687c) {
        C5717e c5717e;
        if (abstractC19687c instanceof C5717e) {
            c5717e = (C5717e) abstractC19687c;
            int i10 = c5717e.f18520o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5717e.f18520o0 = i10 - Integer.MIN_VALUE;
            } else {
                c5717e = new C5717e(this, abstractC19687c);
            }
        } else {
            c5717e = new C5717e(this, abstractC19687c);
        }
        C5717e c5717e2 = c5717e;
        Object objM2487a = c5717e2.f18518Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5717e2.f18520o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM2487a);
            c5717e2.f18520o0 = 1;
            objM2487a = C1641i.m2487a(this.f18521a, str, null, null, false, str2, c5717e2, 14);
            if (objM2487a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objM2487a);
        }
        return ((AbstractC6224C) objM2487a).m6735b();
    }
}
