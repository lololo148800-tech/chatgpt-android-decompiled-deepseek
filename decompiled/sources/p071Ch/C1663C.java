package p071Ch;

import android.app.Application;
import com.openai.chatgpt.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm.C17309l;
import p044Bh.C1300m;
import p044Bh.InterfaceC1301n;
import p1081wc.C20889h;
import p1081wc.InterfaceC20904w;
import p195Hh.C3430e;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p364Oh.C6222A;
import p364Oh.C6223B;
import p364Oh.C6226E;
import p425Ra.C6828a;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9233X;
import p625Zh.C10396b;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Ch.C */
/* JADX INFO: loaded from: classes3.dex */
public final class C1663C implements InterfaceC1301n {

    /* JADX INFO: renamed from: j */
    public static int f4698j;

    /* JADX INFO: renamed from: k */
    public static final List f4699k = AbstractC17681o.m19382k(-19, -18, -12, -3, -100, -8, -9);

    /* JADX INFO: renamed from: a */
    public final Application f4700a;

    /* JADX INFO: renamed from: b */
    public final C1676g f4701b;

    /* JADX INFO: renamed from: c */
    public final C6226E f4702c;

    /* JADX INFO: renamed from: d */
    public final C10396b f4703d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC20904w f4704e;

    /* JADX INFO: renamed from: g */
    public int f4706g;

    /* JADX INFO: renamed from: h */
    public int f4707h;

    /* JADX INFO: renamed from: f */
    public final C3430e f4705f = AbstractC8168p6.m8749b("PlayIntegrityTokenGenerator", "Integrity");

    /* JADX INFO: renamed from: i */
    public final C1669I f4708i = new C1669I(new C1662B(this, null));

    public C1663C(Application application, C1676g c1676g, C6226E c6226e, C10396b c10396b, InterfaceC20904w interfaceC20904w) {
        this.f4700a = application;
        this.f4701b = c1676g;
        this.f4702c = c6226e;
        this.f4703d = c10396b;
        this.f4704e = interfaceC20904w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m2494a(String str, boolean z6, AbstractC19687c abstractC19687c) {
        C1694y c1694y;
        LinkedHashMap linkedHashMap;
        C1663C c1663c;
        if (abstractC19687c instanceof C1694y) {
            c1694y = (C1694y) abstractC19687c;
            int i10 = c1694y.f4813q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c1694y.f4813q0 = i10 - Integer.MIN_VALUE;
            } else {
                c1694y = new C1694y(this, abstractC19687c);
            }
        } else {
            c1694y = new C1694y(this, abstractC19687c);
        }
        Object objM2495b = c1694y.f4811o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c1694y.f4813q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM2495b);
            C17309l c17309l = new C17309l("pre_auth", Boolean.valueOf(z6));
            int i12 = f4698j;
            f4698j = i12 + 1;
            LinkedHashMap linkedHashMapM19246h = AbstractC17659D.m19246h(c17309l, new C17309l("request_count", new Integer(i12)));
            this.f4704e.mo21447a(C20889h.f66550f, linkedHashMapM19246h);
            c1694y.f4809Y = this;
            c1694y.f4810Z = linkedHashMapM19246h;
            c1694y.f4813q0 = 1;
            objM2495b = m2495b(linkedHashMapM19246h, str, c1694y);
            if (objM2495b == enumC19250a) {
                return enumC19250a;
            }
            linkedHashMap = linkedHashMapM19246h;
            c1663c = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = c1694y.f4810Z;
            c1663c = c1694y.f4809Y;
            AbstractC9233X.m9807c(objM2495b);
        }
        AbstractC6224C abstractC6224C = (AbstractC6224C) objM2495b;
        if (abstractC6224C instanceof C6223B) {
            c1663c.f4704e.mo21447a(C20889h.f66552h, linkedHashMap);
        } else if (abstractC6224C instanceof AbstractC6249w) {
            if (abstractC6224C instanceof C6222A) {
                linkedHashMap.put("error_code", new Integer(((C6222A) abstractC6224C).f20254b));
            }
            String message = ((AbstractC6249w) abstractC6224C).f20328a.getMessage();
            if (message == null) {
                message = "";
            }
            linkedHashMap.put("error", message);
            c1663c.f4704e.mo21447a(C20889h.f66549e, linkedHashMap);
        }
        return objM2495b;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 3651. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m2495b(java.util.LinkedHashMap r21, java.lang.String r22, sm.AbstractC19687c r23) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p071Ch.C1663C.m2495b(java.util.LinkedHashMap, java.lang.String, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final C6222A m2496c(C6828a c6828a, String str) {
        C6222A c6222a;
        int i10 = c6828a.f62870Y.f36052Y;
        Application application = this.f4700a;
        if (i10 == -18) {
            C1300m c1300m = new C1300m(c6828a);
            int i11 = c6828a.f62870Y.f36052Y;
            return new C6222A(c1300m, i11, (String) null, application.getString(R.string.login_client_transient, str, String.valueOf(i11)), 20);
        }
        if (i10 != -12) {
            if (i10 == -9) {
                c6222a = new C6222A(c6828a, i10, (String) null, application.getString(R.string.login_device_integrity_error_play_store, str, String.valueOf(i10)), 20);
            } else if (i10 == -6 || i10 == -15) {
                c6222a = new C6222A(c6828a, i10, (String) null, application.getString(R.string.login_device_integrity_error_play_services, str, String.valueOf(i10)), 20);
            } else {
                if (i10 != -14) {
                    if (i10 != -3) {
                        if (i10 != -2 && i10 != -1) {
                            return new C6222A(c6828a, i10, (String) null, (String) null, 28);
                        }
                    }
                }
                c6222a = new C6222A(c6828a, i10, (String) null, application.getString(R.string.login_device_integrity_error_play_store, str, String.valueOf(i10)), 20);
            }
            return c6222a;
        }
        return new C6222A(c6828a, i10, (String) null, application.getString(R.string.design_error_network), 20);
    }

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap m2497d(Map map) {
        return AbstractC17659D.m19248j(map, AbstractC17659D.m19244f(new C17309l("initialization_retry_count", Integer.valueOf(this.f4706g)), new C17309l("token_retry_count", Integer.valueOf(this.f4707h))));
    }
}
