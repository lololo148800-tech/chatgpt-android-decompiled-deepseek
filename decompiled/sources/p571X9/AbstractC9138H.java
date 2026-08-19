package p571X9;

import android.util.Log;
import io.sentry.android.core.AbstractC15256t;
import java.util.concurrent.CancellationException;
import p049Bm.InterfaceC1436k;
import p060C6.AbstractC1604a;
import p109E3.C2292p;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6231e;
import p364Oh.AbstractC6249w;
import p364Oh.C6223B;
import p364Oh.C6235i;
import p364Oh.C6236j;
import p364Oh.C6248v;
import p364Oh.C6251y;
import p364Oh.InterfaceC6247u;
import p432Rh.C6888a;
import p523V9.AbstractC8160o6;
import p917o6.C17853f;
import p917o6.InterfaceC17841I;
import p917o6.InterfaceC17842J;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: X9.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9138H {
    /* JADX INFO: renamed from: a */
    public static void m9682a(String str) {
        if (Log.isLoggable("InstallReferrerClient", 2)) {
            Log.v("InstallReferrerClient", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9683b(String str) {
        if (Log.isLoggable("InstallReferrerClient", 5)) {
            AbstractC15256t.m16482t("InstallReferrerClient", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public static Object m9684c(C6888a c6888a, InterfaceC1436k interfaceC1436k, AbstractC19687c abstractC19687c) {
        C6235i c6235i;
        C6888a c6888a2;
        if (abstractC19687c instanceof C6235i) {
            c6235i = (C6235i) abstractC19687c;
            int i10 = c6235i.f20307p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6235i.f20307p0 = i10 - Integer.MIN_VALUE;
            } else {
                c6235i = new C6235i(abstractC19687c);
            }
        } else {
            c6235i = new C6235i(abstractC19687c);
        }
        Object objMo6741a = c6235i.f20306o0;
        Object obj = EnumC19250a.f61036Y;
        int i11 = c6235i.f20307p0;
        try {
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        c6888a = c6235i.f20305Z;
                        c6888a2 = c6235i.f20304Y;
                        try {
                            AbstractC9233X.m9807c(objMo6741a);
                        } catch (Exception e10) {
                            C6888a c6888a3 = c6888a2;
                            e = e10;
                            c6888a = c6888a3;
                            InterfaceC6247u interfaceC6247u = c6888a.f22081b;
                            c6235i.f20304Y = null;
                            c6235i.f20305Z = null;
                            c6235i.f20307p0 = 3;
                            objMo6741a = interfaceC6247u.mo6741a(e, c6235i);
                            if (objMo6741a == obj) {
                                return obj;
                            }
                            AbstractC6249w abstractC6249w = (AbstractC6249w) objMo6741a;
                            AbstractC6231e.m6736a(abstractC6249w, null);
                            return abstractC6249w;
                        }
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC9233X.m9807c(objMo6741a);
                            AbstractC6249w abstractC6249w2 = (AbstractC6249w) objMo6741a;
                            AbstractC6231e.m6736a(abstractC6249w2, null);
                            return abstractC6249w2;
                        }
                        c6888a = c6235i.f20304Y;
                        AbstractC9233X.m9807c(objMo6741a);
                    }
                    return (AbstractC6224C) objMo6741a;
                }
                AbstractC9233X.m9807c(objMo6741a);
                c6235i.f20304Y = c6888a;
                c6235i.f20305Z = c6888a;
                c6235i.f20307p0 = 1;
                objMo6741a = interfaceC1436k.invoke(c6235i);
                if (objMo6741a == obj) {
                    return obj;
                }
                c6888a2 = c6888a;
                c6235i.f20304Y = c6888a2;
                c6235i.f20305Z = null;
                c6235i.f20307p0 = 2;
                objMo6741a = m9685d(c6888a, (C17853f) objMo6741a, c6235i);
                if (objMo6741a == obj) {
                    return obj;
                }
                c6888a = c6888a2;
                return (AbstractC6224C) objMo6741a;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (CancellationException unused) {
            return C6248v.f20327a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: d */
    public static Object m9685d(C6888a c6888a, C17853f c17853f, AbstractC19687c abstractC19687c) {
        C6236j c6236j;
        AbstractC6249w c6251y;
        if (abstractC19687c instanceof C6236j) {
            c6236j = (C6236j) abstractC19687c;
            int i10 = c6236j.f20310o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c6236j.f20310o0 = i10 - Integer.MIN_VALUE;
            } else {
                c6236j = new C6236j(abstractC19687c);
            }
        } else {
            c6236j = new C6236j(abstractC19687c);
        }
        Object objMo6741a = c6236j.f20309Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c6236j.f20310o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo6741a);
            AbstractC1604a abstractC1604a = c17853f.f56935e;
            if (abstractC1604a == null) {
                ?? r6 = c17853f.f56934d;
                InterfaceC17842J interfaceC17842J = c17853f.f56932b;
                InterfaceC17841I interfaceC17841I = c17853f.f56933c;
                if (interfaceC17841I == null) {
                    if (r6 != 0) {
                        c6251y = AbstractC6231e.m6737b(r6);
                        AbstractC6231e.m6736a(c6251y, interfaceC17842J);
                    } else {
                        c6251y = new C6251y(new C2292p("Apollo missing data, but no errors"));
                        AbstractC6231e.m6736a(c6251y, interfaceC17842J);
                    }
                    return c6251y;
                }
                if (r6 != 0) {
                    AbstractC8160o6.m8731f(AbstractC6231e.f20293a, "Apollo partial errors for operation " + interfaceC17842J.name() + ":  " + ((Object) r6), null, null, 6);
                }
                return new C6223B(interfaceC17841I);
            }
            InterfaceC6247u interfaceC6247u = c6888a.f22081b;
            c6236j.f20308Y = c17853f;
            c6236j.f20310o0 = 1;
            objMo6741a = interfaceC6247u.mo6741a(abstractC1604a, c6236j);
            if (objMo6741a == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c17853f = c6236j.f20308Y;
            AbstractC9233X.m9807c(objMo6741a);
        }
        AbstractC6249w abstractC6249w = (AbstractC6249w) objMo6741a;
        AbstractC6231e.m6736a(abstractC6249w, c17853f.f56932b);
        return abstractC6249w;
    }
}
