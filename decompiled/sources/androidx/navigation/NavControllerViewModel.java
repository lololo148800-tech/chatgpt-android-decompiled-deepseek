package androidx.navigation;

import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p225Im.InterfaceC3756d;
import p939p3.C18294d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m18067d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "Companion", "navigation-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {

    /* JADX INFO: renamed from: c */
    public static final Companion f33520c = new Companion(0);

    /* JADX INFO: renamed from: d */
    public static final NavControllerViewModel$Companion$FACTORY$1 f33521d = new ViewModelProvider.Factory() { // from class: androidx.navigation.NavControllerViewModel$Companion$FACTORY$1
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: a */
        public final ViewModel mo11739a(Class cls) {
            return new NavControllerViewModel();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: b */
        public final ViewModel mo11740b(Class cls, C18294d c18294d) {
            return mo11739a(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewModel mo11741c(InterfaceC3756d interfaceC3756d, C18294d c18294d) {
            return AbstractC10763a.m11043a(this, interfaceC3756d, c18294d);
        }
    };

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f33522b = new LinkedHashMap();

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m18067d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelProvider$Factory;", "FACTORY", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navigation-runtime_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        LinkedHashMap linkedHashMap = this.f33522b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).m12146a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f33522b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "sb.toString()");
        return string;
    }
}
