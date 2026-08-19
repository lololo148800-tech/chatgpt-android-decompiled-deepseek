package p846k4;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.lifecycle.EnumC11104m;
import androidx.navigation.NavViewModelStoreProvider;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import p010A8.C0409l;
import p1016t3.C19788o;
import p113E7.InterfaceC2353a;
import p1143z4.AbstractC21790t;
import p1143z4.C21778h;
import p210I7.InterfaceC3649a;
import p214Ib.C3676s;
import p214Ib.C3678u;
import p372P3.C6330l;
import p372P3.C6338t;
import p372P3.InterfaceC6310B;
import p676c7.C11685d;
import p885m4.InterfaceC17161k;
import p885m4.InterfaceC17163m;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: k4.i */
/* JADX INFO: loaded from: classes.dex */
public class C16340i implements InterfaceC16338g, InterfaceC17161k, InterfaceC2353a, InterfaceC3649a {
    /* JADX INFO: renamed from: i */
    public static C21778h m17935i(Context context, AbstractC21790t destination, Bundle bundle, EnumC11104m hostLifecycleState, NavViewModelStoreProvider navViewModelStoreProvider) {
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "randomUUID().toString()");
        AbstractC16544l.m18094g(destination, "destination");
        AbstractC16544l.m18094g(hostLifecycleState, "hostLifecycleState");
        return new C21778h(context, destination, bundle, hostLifecycleState, navViewModelStoreProvider, string, null);
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: a */
    public long mo2153a(C6330l c6330l) {
        return -1L;
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: b */
    public InterfaceC17163m mo17936b(C19788o c19788o) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: c */
    public InterfaceC6310B mo2154c() {
        return new C6338t(-9223372036854775807L);
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: d */
    public boolean mo17937d(C19788o c19788o) {
        return false;
    }

    @Override // p113E7.InterfaceC2353a
    /* JADX INFO: renamed from: g */
    public String mo3437g(Object obj) {
        C11685d model = (C11685d) obj;
        AbstractC16544l.m18094g(model, "model");
        C3676s c3676s = new C3676s();
        c3676s.m4391s("connectivity", new C3678u(AbstractC10763a.m11044b(model.f35439a)));
        String str = model.f35440b;
        if (str != null) {
            c3676s.m4394v("carrier_name", str);
        }
        Long l4 = model.f35441c;
        if (l4 != null) {
            AbstractC17792x.m19539v(l4, c3676s, "carrier_id");
        }
        Long l10 = model.f35442d;
        if (l10 != null) {
            AbstractC17792x.m19539v(l10, c3676s, "up_kbps");
        }
        Long l11 = model.f35443e;
        if (l11 != null) {
            AbstractC17792x.m19539v(l11, c3676s, "down_kbps");
        }
        Long l12 = model.f35444f;
        if (l12 != null) {
            AbstractC17792x.m19539v(l12, c3676s, "strength");
        }
        String str2 = model.f35445g;
        if (str2 != null) {
            c3676s.m4394v("cellular_technology", str2);
        }
        String string = c3676s.m4390m().toString();
        AbstractC16544l.m18093f(string, "model.toJson().asJsonObject.toString()");
        return string;
    }

    @Override // p210I7.InterfaceC3649a
    /* JADX INFO: renamed from: h */
    public Object mo4356h(Object obj) {
        C0409l event = (C0409l) obj;
        AbstractC16544l.m18094g(event, "event");
        return event;
    }

    /* JADX INFO: renamed from: j */
    public SparseIntArray[] mo17939j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public SparseIntArray[] mo17940k(Activity activity) {
        return null;
    }

    @Override // p885m4.InterfaceC17161k
    /* JADX INFO: renamed from: l */
    public int mo17941l(C19788o c19788o) {
        return 1;
    }

    /* JADX INFO: renamed from: m */
    public SparseIntArray[] mo17942m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public SparseIntArray[] mo17943n() {
        return null;
    }

    @Override // p846k4.InterfaceC16338g
    /* JADX INFO: renamed from: e */
    public void mo2156e(long j10) {
    }

    /* JADX INFO: renamed from: f */
    public void mo17938f(Activity activity) {
    }
}
