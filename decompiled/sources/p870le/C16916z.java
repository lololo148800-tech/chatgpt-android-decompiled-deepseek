package p870le;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import mm.C17309l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p044Bh.C1302o;
import p044Bh.InterfaceC1301n;
import p071Ch.C1663C;
import p071Ch.C1676g;
import p1081wc.C20857C;
import p1081wc.InterfaceC20904w;
import p1113xn.C21307a;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p195Hh.C3430e;
import p324Mn.C5531a;
import p324Mn.C5551u;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6248v;
import p523V9.AbstractC8128k6;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p582Xk.HXHG.TfazcFv;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17678l;
import p929oi.AbstractC18201b;
import p948pi.C18418a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: le.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C16916z {

    /* JADX INFO: renamed from: h */
    public static final long f54344h;

    /* JADX INFO: renamed from: a */
    public final C5531a f54345a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1301n f54346b;

    /* JADX INFO: renamed from: c */
    public final C1676g f54347c;

    /* JADX INFO: renamed from: d */
    public final C18418a f54348d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC20904w f54349e;

    /* JADX INFO: renamed from: f */
    public final C3430e f54350f = AbstractC8168p6.m8749b("ConversationIntegrityTokenGenerator", "Integrity");

    /* JADX INFO: renamed from: g */
    public C16911v f54351g;

    static {
        C21554a c21554a = C21555b.f68260Z;
        f54344h = AbstractC8128k6.m8644j(5, EnumC21557d.MINUTES);
    }

    public C16916z(C5531a c5531a, InterfaceC1301n interfaceC1301n, C1676g c1676g, C18418a c18418a, InterfaceC20904w interfaceC20904w) {
        this.f54345a = c5531a;
        this.f54346b = interfaceC1301n;
        this.f54347c = c1676g;
        this.f54348d = c18418a;
        this.f54349e = interfaceC20904w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m18587b(String str, String str2, AbstractC19687c abstractC19687c) throws NoSuchAlgorithmException {
        C16914x c16914x;
        C5551u c5551uM5929a;
        Boolean boolValueOf;
        C16916z c16916z;
        C5551u c5551u;
        Boolean bool;
        AbstractC6224C c6223b;
        if (abstractC19687c instanceof C16914x) {
            c16914x = (C16914x) abstractC19687c;
            int i10 = c16914x.f54339r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16914x.f54339r0 = i10 - Integer.MIN_VALUE;
            } else {
                c16914x = new C16914x(this, abstractC19687c);
            }
        } else {
            c16914x = new C16914x(this, abstractC19687c);
        }
        Object obj = c16914x.f54337p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16914x.f54339r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c5551uM5929a = this.f54345a.m5929a();
            C16911v c16911v = this.f54351g;
            boolValueOf = c16911v != null ? Boolean.valueOf(m18588c(c16911v, str, str2)) : null;
            boolean zM18089b = AbstractC16544l.m18089b(boolValueOf, Boolean.TRUE);
            C3430e c3430e = this.f54350f;
            if (zM18089b) {
                AbstractC8160o6.m8726a(c3430e, "Cached integrity token was valid", null, 6);
                this.f54351g = null;
                c6223b = new C6223B(c16911v);
                c16916z = this;
            } else {
                AbstractC8160o6.m8726a(c3430e, "No valid token, generating new integrity token", null, 6);
                c16914x.f54334Y = this;
                c16914x.f54335Z = c5551uM5929a;
                c16914x.f54336o0 = boolValueOf;
                c16914x.f54339r0 = 1;
                Object objM18586a = m18586a(str, str2, c16914x);
                if (objM18586a == enumC19250a) {
                    return enumC19250a;
                }
                c16916z = this;
                c5551u = c5551uM5929a;
                obj = objM18586a;
                bool = boolValueOf;
            }
            long jM21835e = C21555b.m21835e(c16916z.f54345a.m5929a().m5946b(c5551uM5929a));
            AbstractC8160o6.m8726a(c16916z.f54350f, AbstractC0168G.m533v("getToken in ", jM21835e, " ms"), null, 6);
            c16916z.f54349e.mo21447a(C20857C.f66332n, AbstractC17659D.m19244f(new C17309l("perceived_latency_ms", new Long(jM21835e)), new C17309l("success", Boolean.valueOf(c6223b instanceof C6223B)), new C17309l("cached", Boolean.valueOf(AbstractC16544l.m18089b(boolValueOf, Boolean.TRUE)))));
            return c6223b;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bool = c16914x.f54336o0;
        c5551u = c16914x.f54335Z;
        c16916z = c16914x.f54334Y;
        AbstractC9233X.m9807c(obj);
        boolValueOf = bool;
        c6223b = (AbstractC6224C) obj;
        c5551uM5929a = c5551u;
        long jM21835e2 = C21555b.m21835e(c16916z.f54345a.m5929a().m5946b(c5551uM5929a));
        AbstractC8160o6.m8726a(c16916z.f54350f, AbstractC0168G.m533v("getToken in ", jM21835e2, " ms"), null, 6);
        c16916z.f54349e.mo21447a(C20857C.f66332n, AbstractC17659D.m19244f(new C17309l("perceived_latency_ms", new Long(jM21835e2)), new C17309l("success", Boolean.valueOf(c6223b instanceof C6223B)), new C17309l("cached", Boolean.valueOf(AbstractC16544l.m18089b(boolValueOf, Boolean.TRUE)))));
        return c6223b;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX INFO: renamed from: c */
    public final boolean m18588c(C16911v c16911v, String str, String str2) {
        boolean zM18089b;
        boolean zM18089b2;
        if (C21555b.m21833c(this.f54345a.m5929a().m5946b(c16911v.f54324c), f54344h) >= 0) {
            return false;
        }
        C16892l0 c16892l0 = c16911v.f54322a;
        String str3 = c16892l0.f54241b;
        if (str3 == null) {
            if (str == null) {
                zM18089b = true;
            } else {
                zM18089b = false;
            }
        } else if (str == null) {
            zM18089b = false;
        } else {
            zM18089b = AbstractC16544l.m18089b(str3, str);
        }
        if (!zM18089b) {
            return false;
        }
        String str4 = c16892l0.f54243d;
        if (str4 == null) {
            if (str2 == null) {
                zM18089b2 = true;
            } else {
                zM18089b2 = false;
            }
        } else if (str2 == null) {
            zM18089b2 = false;
        } else {
            zM18089b2 = AbstractC16544l.m18089b(str4, str2);
        }
        return zM18089b2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m18589d(String str, String str2, AbstractC19687c abstractC19687c) throws NoSuchAlgorithmException {
        C16915y c16915y;
        C16916z c16916z;
        C16911v c16911v;
        if (abstractC19687c instanceof C16915y) {
            c16915y = (C16915y) abstractC19687c;
            int i10 = c16915y.f54343p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16915y.f54343p0 = i10 - Integer.MIN_VALUE;
            } else {
                c16915y = new C16915y(this, abstractC19687c);
            }
        } else {
            c16915y = new C16915y(this, abstractC19687c);
        }
        Object objM18586a = c16915y.f54341Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16915y.f54343p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM18586a);
            C16911v c16911v2 = this.f54351g;
            if (c16911v2 != null && m18588c(c16911v2, str, str2)) {
                return c17296c;
            }
            c16915y.f54340Y = this;
            c16915y.f54343p0 = 1;
            objM18586a = m18586a(str, str2, c16915y);
            if (objM18586a == enumC19250a) {
                return enumC19250a;
            }
            c16916z = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16916z = c16915y.f54340Y;
            AbstractC9233X.m9807c(objM18586a);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM18586a;
        if (!(abstractC6224C instanceof C6223B)) {
            if (abstractC6224C instanceof AbstractC6249w) {
                AbstractC8160o6.m8727b(c16916z.f54350f, "Failed to create integrity token", ((AbstractC6249w) abstractC6224C).f20328a, 4);
            } else {
                if (!(abstractC6224C instanceof C6248v)) {
                    throw new C0644w();
                }
                c16911v = null;
            }
            return c17296c;
        }
        c16911v = (C16911v) ((C6223B) abstractC6224C).f20258a;
        c16916z.f54351g = c16911v;
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m18586a(String str, String str2, AbstractC19687c abstractC19687c) throws NoSuchAlgorithmException {
        C16913w c16913w;
        C16916z c16916z;
        C5551u c5551u;
        C16892l0 c16892l0;
        if (abstractC19687c instanceof C16913w) {
            c16913w = (C16913w) abstractC19687c;
            int i10 = c16913w.f54333r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c16913w.f54333r0 = i10 - Integer.MIN_VALUE;
            } else {
                c16913w = new C16913w(this, abstractC19687c);
            }
        } else {
            c16913w = new C16913w(this, abstractC19687c);
        }
        Object obj = c16913w.f54331p0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c16913w.f54333r0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C5551u c5551uM5929a = this.f54345a.m5929a();
            C16892l0 c16892l1 = new C16892l0(this.f54348d.f58775c, str, this.f54347c.m2506a(), str2);
            String strM12905d = AbstractC18201b.f58034a.m12905d(C16892l0.Companion.serializer(), c16892l1);
            AbstractC8160o6.m8726a(this.f54350f, TfazcFv.OYbtxZWDXowy + c16892l1, null, 6);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = strM12905d.getBytes(C21307a.f67720a);
            AbstractC16544l.m18093f(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            AbstractC16544l.m18091d(bArrDigest);
            String strM19282E = AbstractC17678l.m19282E(bArrDigest, "", C16883h.f54207t0, 30);
            c16913w.f54328Y = this;
            c16913w.f54329Z = c5551uM5929a;
            c16913w.f54330o0 = c16892l1;
            c16913w.f54333r0 = 1;
            Object objM2494a = ((C1663C) this.f54346b).m2494a(strM19282E, false, c16913w);
            if (objM2494a == enumC19250a) {
                return enumC19250a;
            }
            c16916z = this;
            c5551u = c5551uM5929a;
            obj = objM2494a;
            c16892l0 = c16892l1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c16892l0 = c16913w.f54330o0;
            c5551u = c16913w.f54329Z;
            c16916z = c16913w.f54328Y;
            AbstractC9233X.m9807c(obj);
        }
        Object c6223b = (AbstractC6224C) obj;
        if (c6223b instanceof C6223B) {
            c6223b = new C6223B(new C16911v(c16892l0, (C1302o) ((C6223B) c6223b).f20258a, c5551u));
        } else if (!(c6223b instanceof C6248v) && !(c6223b instanceof AbstractC6249w)) {
            throw new C0644w();
        }
        AbstractC8160o6.m8726a(c16916z.f54350f, "Generated integrity token in " + C21555b.m21842l(c16916z.f54345a.m5929a().m5946b(c5551u)), null, 6);
        return c6223b;
    }
}
