package androidx.navigation.compose;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p562X0.InterfaceC9009d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/S;", "handle", "<init>", "(Landroidx/lifecycle/S;)V", "navigation-compose_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BackStackEntryIdViewModel extends ViewModel {

    /* JADX INFO: renamed from: b */
    public final UUID f33555b;

    /* JADX INFO: renamed from: c */
    public WeakReference f33556c;

    public BackStackEntryIdViewModel(C11082S c11082s) {
        UUID uuidRandomUUID = (UUID) c11082s.m12131b("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            c11082s.m12132c("SaveableStateHolder_BackStackEntryKey", uuidRandomUUID);
        }
        this.f33555b = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.ViewModel
    /* JADX INFO: renamed from: e */
    public final void mo11734e() {
        WeakReference weakReference = this.f33556c;
        if (weakReference == null) {
            AbstractC16544l.m18103p("saveableStateHolderRef");
            throw null;
        }
        InterfaceC9009d interfaceC9009d = (InterfaceC9009d) weakReference.get();
        if (interfaceC9009d != null) {
            interfaceC9009d.mo9595e(this.f33555b);
        }
        WeakReference weakReference2 = this.f33556c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            AbstractC16544l.m18103p("saveableStateHolderRef");
            throw null;
        }
    }
}
