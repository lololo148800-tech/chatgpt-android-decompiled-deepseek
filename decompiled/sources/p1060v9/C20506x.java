package p1060v9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC11852a;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import io.sentry.android.core.AbstractC15256t;
import p1009s9.C19499b;
import p1022t9.InterfaceC19822g;
import p1022t9.InterfaceC19823h;

/* JADX INFO: renamed from: v9.x */
/* JADX INFO: loaded from: classes.dex */
public final class C20506x extends AbstractC20499q {

    /* JADX INFO: renamed from: g */
    public final IBinder f65107g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC11852a f65108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20506x(AbstractC11852a abstractC11852a, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC11852a, i10, bundle);
        this.f65108h = abstractC11852a;
        this.f65107g = iBinder;
    }

    @Override // p1060v9.AbstractC20499q
    /* JADX INFO: renamed from: a */
    public final void mo21145a(C19499b c19499b) {
        C20491i c20491i = this.f65108h.f36082o;
        if (c20491i != null) {
            ((InterfaceC19823h) c20491i.f65068Y).mo20772d(c19499b);
        }
        System.currentTimeMillis();
    }

    @Override // p1060v9.AbstractC20499q
    /* JADX INFO: renamed from: b */
    public final boolean mo21146b() {
        IBinder iBinder = this.f65107g;
        try {
            AbstractC20502t.m21157h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC11852a abstractC11852a = this.f65108h;
            if (!abstractC11852a.mo1033r().equals(interfaceDescriptor)) {
                AbstractC15256t.m16482t("GmsClient", YladLSetV.JvqCMkBaSAvKXZH + abstractC11852a.mo1033r() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceMo1031n = abstractC11852a.mo1031n(iBinder);
            if (iInterfaceMo1031n == null || !(AbstractC11852a.m13196x(abstractC11852a, 2, 4, iInterfaceMo1031n) || AbstractC11852a.m13196x(abstractC11852a, 3, 4, iInterfaceMo1031n))) {
                return false;
            }
            abstractC11852a.f36086s = null;
            C20491i c20491i = abstractC11852a.f36081n;
            if (c20491i == null) {
                return true;
            }
            ((InterfaceC19822g) c20491i.f65068Y).onConnected();
            return true;
        } catch (RemoteException unused) {
            AbstractC15256t.m16482t("GmsClient", "service probably died");
            return false;
        }
    }
}
