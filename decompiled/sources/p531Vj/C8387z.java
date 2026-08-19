package p531Vj;

import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p026Ao.C0678l;
import p247Jj.C4373B;
import p248Jk.InterfaceC4478i;
import p273Kl.C4714D;
import p437Rn.C6959q;
import p523V9.AbstractC8215v5;
import p544W9.AbstractC8694q;
import p658b5.C11248s;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p729ej.C13430u;
import p841k.AbstractC16283c;
import p931ok.C18226g;
import p931ok.EnumC18225f;

/* JADX INFO: renamed from: Vj.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8387z extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final Context f26104a;

    /* JADX INFO: renamed from: b */
    public final C8376o f26105b;

    public C8387z(Context context, C8376o deviceFeatureRequestWorkerFactory) {
        AbstractC16544l.m18094g(deviceFeatureRequestWorkerFactory, "deviceFeatureRequestWorkerFactory");
        this.f26104a = context;
        this.f26105b = deviceFeatureRequestWorkerFactory;
    }

    /* JADX INFO: renamed from: e */
    public static final void m8942e(C8387z c8387z, C13430u c13430u, C8331A c8331a) {
        c8387z.getClass();
        c13430u.m14964a(new C8382u(c8331a));
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
        C8383v props = (C8383v) obj;
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
            AbstractC8381t abstractC8381t = (AbstractC8381t) parcelable;
            if (abstractC8381t != null) {
                return abstractC8381t;
            }
        }
        return C8377p.f26078Y;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        C8383v renderProps = (C8383v) obj;
        AbstractC8381t renderState = (AbstractC8381t) obj2;
        AbstractC16544l.m18094g(renderProps, "renderProps");
        AbstractC16544l.m18094g(renderState, "renderState");
        C18226g c18226g = null;
        if (renderState.equals(C8377p.f26078Y)) {
            c13421l.mo3410z("check_device_feature_state", new C8386y(this, c13421l, renderProps, null));
        } else if (renderState.equals(C8380s.f26081Y)) {
            String str = renderProps.f26084b;
            if (str == null) {
                str = "Couldn't access location feature";
            }
            String str2 = str;
            String str3 = renderProps.f26085c;
            if (str3 == null) {
                str3 = "Location is turned off, please allow access to your device's location feature";
            }
            String str4 = str3;
            String str5 = renderProps.f26086d;
            if (str5 == null) {
                str5 = SIPHeaderNames.ALLOW;
            }
            String str6 = str5;
            C4714D c4714d = new C4714D(c13421l, 27, this);
            String str7 = renderProps.f26087e;
            if (str7 == null) {
                str7 = "Cancel";
            }
            C6959q c6959q = new C6959q(c13421l, this, renderProps, 6);
            c18226g = new C18226g(new C8364e(str2, str4, str6, renderProps.f26088f, c4714d, str7, c6959q), EnumC18225f.f58075o0);
        } else if (renderState.equals(C8379r.f26080Y)) {
            C11248s c11248s = this.f26105b.f26077a;
            AbstractC8215v5.m8843e(c13421l, new C8375n((AbstractC16283c) ((InterfaceC4478i) c11248s.f34081Z).get(), C4373B.m5169a(((C4373B) c11248s.f34082o0).f14241b)), AbstractC16526C.m18075c(C8375n.class), "", new C8384w(this, renderProps, 5));
        } else if (!renderState.equals(C8378q.f26079Y)) {
            throw new C0644w();
        }
        return c18226g;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC8381t state = (AbstractC8381t) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }
}
