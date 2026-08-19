package p531Vj;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.openai.chatgpt.R;
import fj.C13676h;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0289t;
import p003A1.C0295v;
import p025An.C0644w;
import p026Ao.C0678l;
import p042Bf.C1281w;
import p273Kl.C4714D;
import p482Tg.C7445b0;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8694q;
import p729ej.AbstractC13422m;
import p729ej.C13415f;
import p729ej.C13420k;
import p729ej.C13421l;
import p729ej.C13430u;
import p813ij.C15026j;
import p841k.AbstractC16283c;
import p931ok.C18226g;
import p931ok.EnumC18225f;

/* JADX INFO: renamed from: Vj.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8361c0 extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f26041a;

    /* JADX INFO: renamed from: b */
    public final Object f26042b;

    /* JADX INFO: renamed from: c */
    public final Object f26043c;

    /* JADX INFO: renamed from: d */
    public final Object f26044d;

    public /* synthetic */ C8361c0(Object obj, Object obj2, Object obj3, int i10) {
        this.f26041a = i10;
        this.f26042b = obj;
        this.f26043c = obj2;
        this.f26044d = obj3;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8936e(C8361c0 c8361c0, C13430u c13430u, C8365e0 c8365e0) {
        c8361c0.getClass();
        c13430u.m14964a(new C8340J(c8365e0));
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        switch (this.f26041a) {
            case 0:
                C8351V props = (C8351V) obj;
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
                    AbstractC8350U abstractC8350U = (AbstractC8350U) parcelable;
                    if (abstractC8350U != null) {
                        return abstractC8350U;
                    }
                }
                return C8344N.f26000Y;
            default:
                C0295v c0295v = new C0295v(2, (AbstractC13422m) this.f26043c, AbstractC13422m.class, "initialState", "initialState(Ljava/lang/Object;Lcom/squareup/workflow1/Snapshot;)Ljava/lang/Object;", 0, 9);
                C13676h session = (C13676h) this.f26044d;
                ((C13415f) this.f26042b).getClass();
                AbstractC16544l.m18094g(session, "session");
                return c0295v.invoke(obj, c13420k);
        }
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: b */
    public Object mo8937b(Object obj, Object obj2, Object obj3) {
        switch (this.f26041a) {
            case 1:
                C0289t c0289t = new C0289t(3, (AbstractC13422m) this.f26043c, AbstractC13422m.class, "onPropsChanged", "onPropsChanged(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, 3);
                C13676h session = (C13676h) this.f26044d;
                ((C13415f) this.f26042b).getClass();
                AbstractC16544l.m18094g(session, "session");
                return c0289t.invoke(obj, obj2, obj3);
            default:
                return obj3;
        }
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        String string;
        String str;
        EnumC8332B enumC8332B;
        String string2;
        String str2;
        switch (this.f26041a) {
            case 0:
                C8351V renderProps = (C8351V) obj;
                AbstractC8350U renderState = (AbstractC8350U) obj2;
                AbstractC16544l.m18094g(renderProps, "renderProps");
                AbstractC16544l.m18094g(renderState, "renderState");
                if (renderState.equals(C8344N.f26000Y)) {
                    c13421l.mo3410z("check_permission_state", new C8354Y(renderProps, this, c13421l, null));
                    return null;
                }
                boolean zEquals = renderState.equals(C8342L.f25998Y);
                EnumC8334D enumC8334D = renderProps.f26006a;
                if (zEquals) {
                    return new C18226g(new C8369h(enumC8334D, false, new C8355Z(c13421l, this, 0)), EnumC18225f.f58075o0);
                }
                boolean zEquals2 = renderState.equals(C8349T.f26005Y);
                Context context = (Context) this.f26042b;
                String str3 = renderProps.f26008c;
                String str4 = renderProps.f26012g;
                String str5 = renderProps.f26011f;
                if (zEquals2) {
                    if (str5 == null) {
                        string2 = context.getString(R.string.pi2_permissions_continue);
                        AbstractC16544l.m18093f(string2, "getString(...)");
                    } else {
                        string2 = str5;
                    }
                    C4714D c4714d = new C4714D(c13421l, 28, this);
                    if (str4 == null) {
                        String string3 = context.getString(R.string.pi2_permissions_cancel);
                        AbstractC16544l.m18093f(string3, "getString(...)");
                        str2 = string3;
                    } else {
                        str2 = str4;
                    }
                    return new C18226g(new C8364e(str3, renderProps.f26009d, string2, renderProps.f26016k, c4714d, str2, new C8353X(c13421l, this, renderProps, 1)), EnumC18225f.f58075o0);
                }
                if (renderState.equals(C8347Q.f26003Y)) {
                    C15026j c15026j = (C15026j) this.f26043c;
                    AbstractC8215v5.m8843e(c13421l, new C8339I((AbstractC16283c) c15026j.f46725Z, (Context) c15026j.f46724Y, enumC8334D), AbstractC16526C.m18075c(C8339I.class), "", new C8357a0(this, c13421l, renderProps, 1));
                    return null;
                }
                if (!renderState.equals(C8346P.f26002Y)) {
                    if (renderState.equals(C8341K.f25997Y)) {
                        return new C18226g(new C8369h(enumC8334D, true, new C8357a0(c13421l, this, renderProps, 3)), EnumC18225f.f58075o0);
                    }
                    if (!renderState.equals(C8348S.f26004Y)) {
                        if (renderState.equals(C8345O.f26001Y)) {
                            return null;
                        }
                        throw new C0644w();
                    }
                    if (str5 == null) {
                        string = context.getString(R.string.pi2_permissions_settings);
                        AbstractC16544l.m18093f(string, "getString(...)");
                    } else {
                        string = str5;
                    }
                    C8353X c8353x = new C8353X(this, c13421l, renderProps);
                    if (str4 == null) {
                        String string4 = context.getString(R.string.pi2_permissions_cancel);
                        AbstractC16544l.m18093f(string4, "getString(...)");
                        str = string4;
                    } else {
                        str = str4;
                    }
                    return new C18226g(new C8364e(str3, renderProps.f26010e, string, renderProps.f26016k, c8353x, str, new C8353X(c13421l, this, renderProps, 0)), EnumC18225f.f58075o0);
                }
                if (enumC8334D != EnumC8334D.f25985o0 && enumC8334D != EnumC8334D.f25986p0) {
                    c13421l.mo3410z("request_device_feature", new C8359b0(renderProps, this, c13421l, null));
                    return null;
                }
                int iOrdinal = enumC8334D.ordinal();
                if (iOrdinal == 0) {
                    enumC8332B = EnumC8332B.f25974Y;
                } else if (iOrdinal == 1) {
                    enumC8332B = EnumC8332B.f25975Z;
                } else if (iOrdinal == 2) {
                    enumC8332B = EnumC8332B.f25976o0;
                } else {
                    if (iOrdinal != 3) {
                        throw new C0644w();
                    }
                    enumC8332B = EnumC8332B.f25977p0;
                }
                EnumC8332B enumC8332B2 = enumC8332B;
                return c13421l.mo3404p((C8387z) this.f26044d, new C8383v(enumC8332B2, renderProps.f26013h, renderProps.f26014i, renderProps.f26011f, renderProps.f26015j, renderProps.f26016k), "", new C8357a0(this, c13421l, renderProps, 2));
            default:
                C1281w c1281w = new C1281w(c13421l, (AbstractC13422m) this.f26043c, this, 17);
                C13676h session = (C13676h) this.f26044d;
                ((C13415f) this.f26042b).getClass();
                AbstractC16544l.m18094g(session, "session");
                return c1281w.invoke(obj, obj2, null);
        }
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        switch (this.f26041a) {
            case 0:
                AbstractC8350U state = (AbstractC8350U) obj;
                AbstractC16544l.m18094g(state, "state");
                return AbstractC8694q.m9398e(state);
            default:
                C7445b0 c7445b0 = new C7445b0(1, (AbstractC13422m) this.f26043c, AbstractC13422m.class, "snapshotState", "snapshotState(Ljava/lang/Object;)Lcom/squareup/workflow1/Snapshot;", 0, 17);
                C13676h session = (C13676h) this.f26044d;
                ((C13415f) this.f26042b).getClass();
                AbstractC16544l.m18094g(session, "session");
                return (C13420k) c7445b0.invoke(obj);
        }
    }

    public String toString() {
        switch (this.f26041a) {
            case 1:
                return "InterceptedWorkflow(" + ((AbstractC13422m) this.f26043c) + ", " + this + "@intercept)";
            default:
                return super.toString();
        }
    }
}
