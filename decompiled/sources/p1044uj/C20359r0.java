package p1044uj;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.openai.chatgpt.R;
import fk.C13686g;
import fo.C13711h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import mk.C17282c;
import p025An.C0644w;
import p026Ao.C0678l;
import p1039ud.C20198o;
import p1070w.C20694c;
import p1087wj.C20970A;
import p1087wj.C20978I;
import p1087wj.C20983d;
import p1087wj.C20989j;
import p1087wj.C21001v;
import p1087wj.InterfaceC20971B;
import p1131yj.InterfaceC21546a;
import p385Pj.C6438m;
import p385Pj.C6445t;
import p408Qj.AbstractC6743i;
import p408Qj.C6742h;
import p523V9.AbstractC8012V5;
import p523V9.AbstractC8215v5;
import p531Vj.AbstractC8367f0;
import p531Vj.C8361c0;
import p531Vj.EnumC8334D;
import p544W9.AbstractC8694q;
import p588Y2.C9642z;
import p604Yk.C10077b;
import p729ej.AbstractC13422m;
import p729ej.C13411b;
import p729ej.C13414e;
import p729ej.C13420k;
import p729ej.C13421l;
import p770gk.InterfaceC14185a;
import p813ij.C15026j;
import p839jk.C16245b;
import p839jk.C16246c;
import p839jk.C16247d;
import p839jk.C16248e;
import p839jk.C16251h;
import p839jk.C16263t;
import p839jk.InterfaceC16249f;
import p860l0.C16663C;
import p864l5.InterfaceC16818e;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17680n;
import p909nm.C17689w;
import p928oh.C18194a;
import pk.AbstractC18498c;
import pk.C18500e;
import pk.C18504i;

/* JADX INFO: renamed from: uj.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20359r0 extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16818e f64366a;

    /* JADX INFO: renamed from: b */
    public final Context f64367b;

    /* JADX INFO: renamed from: c */
    public final C8361c0 f64368c;

    /* JADX INFO: renamed from: d */
    public final C20334f f64369d;

    /* JADX INFO: renamed from: e */
    public final C13711h f64370e;

    /* JADX INFO: renamed from: f */
    public final C13414e f64371f;

    /* JADX INFO: renamed from: g */
    public final C9642z f64372g;

    /* JADX INFO: renamed from: h */
    public final C15026j f64373h;

    /* JADX INFO: renamed from: i */
    public final C10077b f64374i;

    /* JADX INFO: renamed from: j */
    public final C20694c f64375j;

    /* JADX INFO: renamed from: k */
    public final C17282c f64376k;

    /* JADX INFO: renamed from: l */
    public final C16251h f64377l;

    public C20359r0(InterfaceC16818e imageLoader, Context context, C8361c0 c8361c0, C20334f c20334f, C13711h c13711h, C13414e c13414e, C9642z c9642z, C15026j c15026j, C10077b c10077b, C20694c c20694c, C17282c navigationStateManager, C16251h externalEventLogger) {
        AbstractC16544l.m18094g(imageLoader, "imageLoader");
        AbstractC16544l.m18094g(navigationStateManager, "navigationStateManager");
        AbstractC16544l.m18094g(externalEventLogger, "externalEventLogger");
        this.f64366a = imageLoader;
        this.f64367b = context;
        this.f64368c = c8361c0;
        this.f64369d = c20334f;
        this.f64370e = c13711h;
        this.f64371f = c13414e;
        this.f64372g = c9642z;
        this.f64373h = c15026j;
        this.f64374i = c10077b;
        this.f64375j = c20694c;
        this.f64376k = navigationStateManager;
        this.f64377l = externalEventLogger;
    }

    /* JADX INFO: renamed from: e */
    public static final void m21042e(C20359r0 c20359r0, C13421l c13421l, AbstractC20358r abstractC20358r) {
        C13411b c13411bM8839a;
        c20359r0.getClass();
        if (abstractC20358r.equals(C20307I.f64194b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64314o0);
        } else if (abstractC20358r.equals(C20306H.f64193b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64315p0);
        } else if (abstractC20358r.equals(C20312N.f64199b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64316q0);
        } else if (abstractC20358r.equals(C20313O.f64200b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64317r0);
        } else if (abstractC20358r.equals(C20315Q.f64202b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64318s0);
        } else if (abstractC20358r.equals(C20310L.f64197b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64319t0);
        } else if (abstractC20358r.equals(C20308J.f64195b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64320u0);
        } else if (abstractC20358r instanceof C20311M) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, new C20198o(abstractC20358r, 2));
        } else if (abstractC20358r.equals(C20309K.f64196b)) {
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64321v0);
        } else {
            if (!abstractC20358r.equals(C20314P.f64201b)) {
                throw new C0644w();
            }
            c13411bM8839a = AbstractC8215v5.m8839a(c20359r0, C20341i0.f64313Z);
        }
        c13421l.f42503Y.mo3400l().mo3393B(c13411bM8839a);
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        C20316S props = (C20316S) obj;
        AbstractC16544l.m18094g(props, "props");
        if (c13420k != null) {
            C0678l c0678lM14962a = c13420k.m14962a();
            Parcelable parcelable = null;
            if (c0678lM14962a.mo1372d() <= 0) {
                c0678lM14962a = null;
            }
            if (c0678lM14962a != null) {
                Parcel parcelObtain = Parcel.obtain();
                AbstractC16544l.m18093f(parcelObtain, "obtain()");
                byte[] bArrMo1382q = c0678lM14962a.mo1382q();
                parcelObtain.unmarshall(bArrMo1382q, 0, bArrMo1382q.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(C13420k.class.getClassLoader());
                AbstractC16544l.m18091d(parcelable);
                parcelObtain.recycle();
            }
            AbstractC20337g0 abstractC20337g0 = (AbstractC20337g0) parcelable;
            if (abstractC20337g0 != null) {
                return abstractC20337g0;
            }
        }
        int iOrdinal = props.f64216n.ordinal();
        if (iOrdinal == 0) {
            return new C20331d0(EnumC20327b0.f64267Y, EnumC20335f0.f64296Y, props.f64215m, false);
        }
        if (iOrdinal == 1) {
            return new C20329c0(C17689w.f56480Y, props.f64215m, null, null, true, null, 220);
        }
        throw new C0644w();
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        InterfaceC16249f interfaceC16249f;
        String str;
        String str2;
        String str3;
        int i10 = 9;
        int i11 = 1;
        C20316S renderProps = (C20316S) obj;
        AbstractC20337g0 renderState = (AbstractC20337g0) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        boolean z6 = renderState instanceof C20333e0;
        C17282c c17282c = this.f64376k;
        c17282c.f55098d = renderProps.f64219q;
        c17282c.f55099e = renderProps.f64220r;
        c17282c.f55100f = !z6;
        c17282c.m18976b();
        int iOrdinal = renderState.mo21033d().ordinal();
        if (iOrdinal == 2) {
            AbstractC8215v5.m8843e(c13421l, this.f64369d, AbstractC16526C.m18075c(C20334f.class), "", new C18194a(this, 15, renderProps));
        } else if (iOrdinal == 3 || iOrdinal == 4) {
            EnumC20327b0 enumC20327b0Mo21033d = renderState.mo21033d();
            EnumC20327b0 enumC20327b0 = EnumC20327b0.f64270p0;
            C13711h c13711h = this.f64370e;
            Context context = (Context) c13711h.f43261p0;
            AbstractC8215v5.m8843e(c13421l, enumC20327b0Mo21033d == enumC20327b0 ? new C6445t("DocumentPicker", context, new C6438m(c13711h, 0)) : new C6445t("PhotoLibraryPicker", context, new C6438m(c13711h, 1)), AbstractC16526C.m18075c(C6445t.class), "", new C16663C(this, renderProps, renderState, i10));
        }
        int iOrdinal2 = renderState.mo21036h().ordinal();
        String sessionToken = renderProps.f64203a;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                List listMo21035g = renderState.mo21035g();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : listMo21035g) {
                    if (obj3 instanceof C20336g) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    c13421l.mo3410z("upload_complete", new C20353o0(c13421l, this, null));
                } else {
                    for (C20336g localDocument : AbstractC17680n.m19373w0(arrayList, 3)) {
                        String strMo21034f = renderState.mo21034f();
                        AbstractC16544l.m18091d(strMo21034f);
                        C15026j c15026j = this.f64373h;
                        AbstractC16544l.m18094g(sessionToken, "sessionToken");
                        AbstractC16544l.m18094g(localDocument, "localDocument");
                        AbstractC8215v5.m8843e(c13421l, new C21001v(sessionToken, (InterfaceC20971B) c15026j.f46724Y, strMo21034f, localDocument, (C13686g) c15026j.f46725Z), AbstractC16526C.m18075c(C21001v.class), localDocument.f64301Y, new C16663C(this, localDocument, renderState, 10));
                    }
                }
            } else if (iOrdinal2 == 2 && (renderState instanceof C20329c0)) {
                AbstractC20340i abstractC20340i = ((C20329c0) renderState).f64278s0;
                C20338h c20338h = abstractC20340i instanceof C20338h ? (C20338h) abstractC20340i : null;
                if (c20338h != null) {
                    AbstractC16544l.m18091d(((C20329c0) renderState).f64275p0);
                    C10077b c10077b = this.f64374i;
                    AbstractC16544l.m18094g(sessionToken, "sessionToken");
                    AbstractC8215v5.m8843e(c13421l, new C20989j(sessionToken, (InterfaceC20971B) c10077b.f29833Z, c20338h), AbstractC16526C.m18075c(C20989j.class), "", new C18194a(this, 19, c20338h));
                }
            }
        } else if (renderState.mo21034f() == null) {
            C13414e c13414e = this.f64371f;
            AbstractC16544l.m18094g(sessionToken, "sessionToken");
            String documentKind = renderProps.f64214l;
            AbstractC16544l.m18094g(documentKind, "documentKind");
            String fieldKeyDocument = renderProps.f64213k;
            AbstractC16544l.m18094g(fieldKeyDocument, "fieldKeyDocument");
            AbstractC8215v5.m8843e(c13421l, new C20983d(sessionToken, (InterfaceC20971B) c13414e.f42490Y, documentKind, renderProps.f64218p, fieldKeyDocument), AbstractC16526C.m18075c(C20983d.class), "", new C20349m0(this, i11));
        }
        if (renderState.mo21033d() == EnumC20327b0.f64269o0) {
            interfaceC16249f = C16248e.f50372a;
        } else if (renderState instanceof C20331d0) {
            interfaceC16249f = C16246c.f50370a;
        } else if (renderState instanceof C20329c0) {
            interfaceC16249f = C16247d.f50371a;
        } else {
            if (!z6) {
                throw new C0644w();
            }
            interfaceC16249f = C16245b.f50369a;
        }
        String str4 = renderProps.f64205c;
        this.f64377l.m17811a(new C16263t(str4, interfaceC16249f));
        boolean z10 = renderState instanceof C20331d0;
        Context context2 = this.f64367b;
        C8361c0 c8361c0 = this.f64368c;
        String str5 = renderProps.f64222t;
        String str6 = renderProps.f64221s;
        C20362t c20362t = renderProps.f64217o;
        if (z10) {
            C18500e c18500eM19884a = AbstractC18498c.m19884a(c20362t.f64379Y);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C20370z c20370z = c20362t.f64379Y;
            String str7 = c20370z.f64395o0;
            C20339h0 c20339h0 = new C20339h0(this, c13421l, 0);
            if (str7 != null) {
                linkedHashMap.put(str7, c20339h0);
            }
            C20339h0 c20339h1 = new C20339h0(this, c13421l, 1);
            String str8 = c20370z.f64396p0;
            if (str8 != null) {
                linkedHashMap.put(str8, c20339h1);
            }
            C20339h0 c20339h2 = new C20339h0(this, c13421l, 2);
            String str9 = c20370z.f64397q0;
            if (str9 != null) {
                linkedHashMap.put(str9, c20339h2);
            }
            C20339h0 c20339h3 = new C20339h0(this, c13421l, 3);
            String str10 = c20370z.f64398r0;
            if (str10 != null) {
                linkedHashMap.put(str10, c20339h3);
            }
            Object c20350n = new C20350n(c18500eM19884a, AbstractC17659D.m19252n(linkedHashMap), c17282c.m18975a(), new C20347l0(this, c13421l, 11), new C20347l0(this, c13421l, 12));
            if (((C20331d0) renderState).f64285r0) {
                C20365u0 c20365u0 = c20362t.f64380Z;
                c20350n = AbstractC6743i.m7187a(new C18504i(AbstractC18498c.m19884a(c20365u0), m21043f(c20365u0, c13421l), new C20347l0(this, c13421l, 3), c20365u0.f64387r0, true), c20350n, "document_upload_options_dialog");
            }
            boolean z11 = renderState.mo21033d() == EnumC20327b0.f64268Z;
            EnumC8334D enumC8334D = EnumC8334D.f25983Y;
            String str11 = str6 != null ? str6 : "";
            if (str5 == null) {
                String string = context2.getString(R.string.pi2_document_camera_permission_rationale);
                AbstractC16544l.m18093f(string, "getString(...)");
                str3 = string;
            } else {
                str3 = str5;
            }
            String string2 = context2.getString(R.string.pi2_document_camera_permission_denied_rationale, AbstractC8012V5.m8329b(context2));
            AbstractC16544l.m18093f(string2, "getString(...)");
            return AbstractC8367f0.m8940c(c20350n, c13421l, z11, enumC8334D, false, str11, str3, string2, renderProps.f64223u, renderProps.f64224v, null, null, null, c8361c0, renderProps.f64225w, (19976 & 16384) != 0 ? "" : null, new C20345k0(this, renderState, 0));
        }
        if (!(renderState instanceof C20329c0)) {
            int i12 = 0;
            if (!z6) {
                throw new C0644w();
            }
            List documents = renderState.mo21035g();
            C20694c c20694c = this.f64375j;
            AbstractC16544l.m18094g(sessionToken, "sessionToken");
            String inquiryId = renderProps.f64204b;
            AbstractC16544l.m18094g(inquiryId, "inquiryId");
            String fromComponent = renderProps.f64206d;
            AbstractC16544l.m18094g(fromComponent, "fromComponent");
            AbstractC16544l.m18094g(documents, "documents");
            AbstractC8215v5.m8843e(c13421l, new C20978I(sessionToken, (InterfaceC20971B) c20694c.f65551b, inquiryId, str4, fromComponent, (InterfaceC21546a) c20694c.f65552c, (InterfaceC14185a) c20694c.f65553d, documents), AbstractC16526C.m18075c(C20978I.class), "", new C20349m0(this, i12));
            return new C20322Y(renderProps.f64211i, renderProps.f64212j, new C20347l0(this, c13421l, 1), renderProps.f64225w, renderProps.f64226x.getPendingPage(), renderProps.f64227y);
        }
        C20329c0 c20329c0 = (C20329c0) renderState;
        if (c20329c0.f64279t0) {
            String strMo21034f2 = renderState.mo21034f();
            AbstractC16544l.m18091d(strMo21034f2);
            C9642z c9642z = this.f64372g;
            AbstractC16544l.m18094g(sessionToken, "sessionToken");
            str = "";
            AbstractC8215v5.m8843e(c13421l, new C20970A(sessionToken, (InterfaceC20971B) c9642z.f29064Z, strMo21034f2), AbstractC16526C.m18075c(C20970A.class), str, new C20345k0(this, renderState, 1));
        } else {
            str = "";
        }
        C20323Z c20323z = new C20323Z(this.f64366a, renderProps.f64207e, renderProps.f64208f, renderProps.f64209g, renderProps.f64210h, renderState.mo21035g(), c17282c.m18975a(), new C20347l0(this, c13421l, 4), new C20347l0(this, c13421l, 5), new C20347l0(this, c13421l, 6), new C20347l0(this, c13421l, 7), new C20339h0(this, c13421l, 7), new C20347l0(this, c13421l, 8), new C20347l0(this, c13421l, 9), new C20347l0(this, c13421l, 10), c20329c0.f64279t0, renderState.mo21035g().size() < renderProps.f64218p, !renderState.mo21035g().isEmpty() && renderState.mo21036h() == EnumC20335f0.f64299p0, c20329c0.f64281v0, new C20347l0(this, c13421l, 2), renderProps.f64225w);
        boolean z12 = renderState.mo21033d() == EnumC20327b0.f64268Z;
        EnumC8334D enumC8334D2 = EnumC8334D.f25983Y;
        if (str6 == null) {
            str6 = str;
        }
        if (str5 == null) {
            String string3 = context2.getString(R.string.pi2_document_camera_permission_rationale);
            AbstractC16544l.m18093f(string3, "getString(...)");
            str2 = string3;
        } else {
            str2 = str5;
        }
        String string4 = context2.getString(R.string.pi2_document_camera_permission_denied_rationale, AbstractC8012V5.m8329b(context2));
        AbstractC16544l.m18093f(string4, "getString(...)");
        C6742h c6742hM8940c = AbstractC8367f0.m8940c(c20323z, c13421l, z12, enumC8334D2, false, str6, str2, string4, renderProps.f64223u, renderProps.f64224v, null, null, null, c8361c0, renderProps.f64225w, (19976 & 16384) != 0 ? "" : null, new C20345k0(this, renderState, 2));
        if (!c20329c0.f64280u0) {
            return new C6742h(c6742hM8940c, "document_upload_screen", C17689w.f56480Y);
        }
        C18500e c18500eM19884a2 = AbstractC18498c.m19884a(c20362t.f64380Z);
        C20365u0 c20365u1 = c20362t.f64380Z;
        return AbstractC6743i.m7187a(new C18504i(c18500eM19884a2, m21043f(c20365u1, c13421l), new C20347l0(this, c13421l, 0), c20365u1.f64387r0, true), c6742hM8940c, "document_upload_screen");
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC20337g0 state = (AbstractC20337g0) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }

    /* JADX INFO: renamed from: f */
    public final List m21043f(C20365u0 c20365u0, C13421l c13421l) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c20365u0.f64384o0;
        C20339h0 c20339h0 = new C20339h0(this, c13421l, 4);
        if (str != null) {
            linkedHashMap.put(str, c20339h0);
        }
        C20339h0 c20339h1 = new C20339h0(this, c13421l, 5);
        String str2 = c20365u0.f64385p0;
        if (str2 != null) {
            linkedHashMap.put(str2, c20339h1);
        }
        C20339h0 c20339h2 = new C20339h0(this, c13421l, 6);
        String str3 = c20365u0.f64386q0;
        if (str3 != null) {
            linkedHashMap.put(str3, c20339h2);
        }
        return AbstractC17659D.m19252n(linkedHashMap);
    }
}
