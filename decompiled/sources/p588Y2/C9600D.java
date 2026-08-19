package p588Y2;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.EnumC11103l;
import androidx.lifecycle.InterfaceC11110s;
import androidx.lifecycle.InterfaceC11112u;
import java.util.Map;
import p239Ja.C4307j;

/* JADX INFO: renamed from: Y2.D */
/* JADX INFO: loaded from: classes.dex */
public final class C9600D implements InterfaceC11110s {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ String f28893Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C4307j f28894Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ AbstractC11105n f28895o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ C9606J f28896p0;

    public C9600D(C9606J c9606j, String str, C4307j c4307j, AbstractC11105n abstractC11105n) {
        this.f28896p0 = c9606j;
        this.f28893Y = str;
        this.f28894Z = c4307j;
        this.f28895o0 = abstractC11105n;
    }

    @Override // androidx.lifecycle.InterfaceC11110s
    /* JADX INFO: renamed from: E */
    public final void mo684E(InterfaceC11112u interfaceC11112u, EnumC11103l enumC11103l) {
        EnumC11103l enumC11103l2 = EnumC11103l.ON_START;
        C9606J c9606j = this.f28896p0;
        String str = this.f28893Y;
        if (enumC11103l == enumC11103l2) {
            Map map = c9606j.f33194k;
            Bundle bundle = (Bundle) map.get(str);
            if (bundle != null) {
                this.f28894Z.m5058j(str, bundle);
                map.remove(str);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
                }
            }
        }
        if (enumC11103l == EnumC11103l.ON_DESTROY) {
            this.f28895o0.mo7808c(this);
            c9606j.f33195l.remove(str);
        }
    }
}
