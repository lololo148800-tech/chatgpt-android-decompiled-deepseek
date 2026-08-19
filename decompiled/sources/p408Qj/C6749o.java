package p408Qj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.C0155B1;
import p025An.C0644w;
import p026Ao.C0678l;
import p247Jj.C4390J0;
import p273Kl.C4714D;
import p402Qc.C6593i;
import p544W9.AbstractC8694q;
import p729ej.AbstractC13422m;
import p729ej.C13420k;
import p729ej.C13421l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Qj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C6749o extends AbstractC13422m {

    /* JADX INFO: renamed from: a */
    public final C4390J0 f21659a;

    public C6749o(C4390J0 c4390j0) {
        this.f21659a = c4390j0;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: a */
    public final Object mo2033a(Object obj, C13420k c13420k) {
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
            AbstractC6746l abstractC6746l = (AbstractC6746l) parcelable;
            if (abstractC6746l != null) {
                return abstractC6746l;
            }
        }
        return C6744j.f21649Y;
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: c */
    public final Object mo2034c(Object obj, Object obj2, C13421l c13421l) {
        AbstractC6746l renderState = (AbstractC6746l) obj2;
        AbstractC16544l.m18094g(renderState, "renderState");
        Object objMo3404p = c13421l.mo3404p(this.f21659a, obj, "", new C6593i(this, 3));
        if (renderState instanceof C6744j) {
            return new C6742h(objMo3404p, "CancelModal", C17689w.f56480Y);
        }
        if (!(renderState instanceof C6745k)) {
            throw new C0644w();
        }
        C6745k c6745k = (C6745k) renderState;
        return AbstractC6743i.m7187a(new C6739e(c6745k.f21651Z, new C0155B1(this, c13421l, renderState, 29), new C4714D(c13421l, 19, this), c6745k.f21652o0, c6745k.f21653p0, c6745k.f21654q0, c6745k.f21655r0), objMo3404p, "CancelModal");
    }

    @Override // p729ej.AbstractC13422m
    /* JADX INFO: renamed from: d */
    public final C13420k mo2035d(Object obj) {
        AbstractC6746l state = (AbstractC6746l) obj;
        AbstractC16544l.m18094g(state, "state");
        return AbstractC8694q.m9398e(state);
    }
}
