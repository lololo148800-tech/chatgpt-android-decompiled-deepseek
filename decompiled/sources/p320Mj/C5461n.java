package p320Mj;

import bj.C11447L;
import com.withpersona.sdk2.inquiry.document.network.SubmitDocumentRequest;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.p689ui.network.TransitionInquiryRequest;
import dj.AbstractC13178c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16529F;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17311n;
import mm.C17312o;
import mo.C17324A;
import mo.C17352s;
import mo.C17353t;
import mo.C17354u;
import no.AbstractC17708b;
import p026Ao.C0678l;
import p1027tp.C20048M;
import p1131yj.InterfaceC21546a;
import p228J.AbstractC3794B0;
import p342Nj.C5813g;
import p571X9.AbstractC9123E2;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9282f0;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p959q8.C18639a;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: Mj.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5461n implements InterfaceC21546a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5448a f17830a;

    /* JADX INFO: renamed from: b */
    public final C11447L f17831b;

    /* JADX INFO: renamed from: c */
    public boolean f17832c;

    /* JADX INFO: renamed from: d */
    public C5462o f17833d;

    public C5461n(InterfaceC5448a apiController, C11447L moshi) {
        AbstractC16544l.m18094g(apiController, "apiController");
        AbstractC16544l.m18094g(moshi, "moshi");
        this.f17830a = apiController;
        this.f17831b = moshi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m5908a(C5813g c5813g, AbstractC19687c abstractC19687c) {
        C5459l c5459l;
        Object objMo5907b;
        C5461n c5461n;
        if (abstractC19687c instanceof C5459l) {
            c5459l = (C5459l) abstractC19687c;
            int i10 = c5459l.f17826p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5459l.f17826p0 = i10 - Integer.MIN_VALUE;
            } else {
                c5459l = new C5459l(this, abstractC19687c);
            }
        } else {
            c5459l = new C5459l(this, abstractC19687c);
        }
        Object obj = c5459l.f17824Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5459l.f17826p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            c5459l.f17823Y = this;
            c5459l.f17826p0 = 1;
            objMo5907b = this.f17830a.mo5907b(c5813g, c5459l);
            if (objMo5907b == enumC19250a) {
                return enumC19250a;
            }
            c5461n = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5461n = c5459l.f17823Y;
            AbstractC9233X.m9807c(obj);
            objMo5907b = ((C17312o) obj).f55139Y;
        }
        if (!(objMo5907b instanceof C17311n)) {
            c5461n.f17833d = (C5462o) objMo5907b;
        }
        if (C17312o.m18979a(objMo5907b) != null) {
            return new InternalErrorInfo.NetworkErrorInfo(0, "Failed to create fallback session.", false, null, 8, null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m5909b(String str, Object obj, AbstractC19687c abstractC19687c) {
        C5460m c5460m;
        C20048M c20048mM20869b;
        if (abstractC19687c instanceof C5460m) {
            c5460m = (C5460m) abstractC19687c;
            int i10 = c5460m.f17829o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c5460m.f17829o0 = i10 - Integer.MIN_VALUE;
            } else {
                c5460m = new C5460m(this, abstractC19687c);
            }
        } else {
            c5460m = new C5460m(this, abstractC19687c);
        }
        Object objMo5906a = c5460m.f17827Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c5460m.f17829o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objMo5906a);
            C5462o c5462o = this.f17833d;
            if (c5462o != null) {
                int i12 = c5462o.f17835b;
                List list = c5462o.f17834a;
                if (i12 != AbstractC17681o.m19381j(list)) {
                    int i13 = c5462o.f17835b + 1;
                    c5462o.f17835b = i13;
                }
            }
            if (obj instanceof SubmitDocumentRequest) {
                return C20048M.m20869b();
            }
            boolean z6 = obj instanceof TransitionInquiryRequest;
            InterfaceC5448a interfaceC5448a = this.f17830a;
            if (z6) {
                C11447L c11447l = this.f17831b;
                c11447l.getClass();
                String json = c11447l.m12850b(TransitionInquiryRequest.class, AbstractC13178c.f41820a, null).toJson(obj);
                AbstractC16544l.m18091d(json);
                Pattern pattern = C17352s.f55296e;
                C17324A c17324aM9653a = AbstractC9123E2.m9653a(json, AbstractC9282f0.m9857c("application/json"));
                c5460m.f17829o0 = 1;
                objMo5906a = interfaceC5448a.mo5906a(str, c17324aM9653a, c5460m);
                return objMo5906a == enumC19250a ? enumC19250a : objMo5906a;
            }
            if (!AbstractC16529F.m18083g(obj) || ((Collection) obj).isEmpty()) {
                return C20048M.m20869b();
            }
            if (AbstractC17680n.m19341Q((List) obj) instanceof C17353t) {
                String strM4498w = AbstractC3794B0.m4498w("randomUUID().toString()");
                C0678l c0678l = C0678l.f1971p0;
                C0678l c0678lM19996n = C18639a.m19996n(strM4498w);
                C17352s c17352s = C17354u.f55304e;
                ArrayList arrayList = new ArrayList();
                ArrayList<C17353t> arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (obj2 instanceof C17353t) {
                        arrayList2.add(obj2);
                    }
                }
                for (C17353t part : arrayList2) {
                    AbstractC16544l.m18094g(part, "part");
                    arrayList.add(part);
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Multipart body must have at least one part.");
                }
                C17354u c17354u = new C17354u(c0678lM19996n, c17352s, AbstractC17708b.m19433y(arrayList));
                c5460m.f17829o0 = 2;
                objMo5906a = interfaceC5448a.mo5906a(str, c17354u, c5460m);
                if (objMo5906a == enumC19250a) {
                    return enumC19250a;
                }
                c20048mM20869b = (C20048M) objMo5906a;
            } else {
                c20048mM20869b = C20048M.m20869b();
            }
        } else {
            if (i11 == 1) {
                AbstractC9233X.m9807c(objMo5906a);
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(objMo5906a);
            c20048mM20869b = (C20048M) objMo5906a;
        }
        AbstractC16544l.m18091d(c20048mM20869b);
        return c20048mM20869b;
    }
}
