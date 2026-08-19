package p009A7;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16546n;
import p049Bm.InterfaceC1426a;
import p939p3.C18291a;

/* JADX INFO: renamed from: A7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0392b extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1306Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f1307Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0392b(Object obj, int i10) {
        super(0);
        this.f1306Y = i10;
        this.f1307Z = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mm.i] */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        ?? r6 = this.f1307Z;
        switch (this.f1306Y) {
            case 0:
                return "Dropped item in BackPressuredBlockingQueue queue: " + ((Object) r6);
            case 1:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{r6.getClass().getSimpleName()}, 1));
            case 2:
                return ((ViewModelStoreOwner) r6.getValue()).mo10152e();
            case 3:
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) r6.getValue();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.mo10150c() : C18291a.f58387b;
            case 4:
                return String.format(Locale.US, "Logs feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{r6.getClass().getCanonicalName()}, 1));
            case 5:
                return String.format(Locale.US, "Logs feature received an event with unknown value of \"type\" property=%s.", Arrays.copyOf(new Object[]{((Map) r6).get("type")}, 1));
            case 6:
                return String.format(Locale.US, "RUM feature receive an event of unsupported type=%s.", Arrays.copyOf(new Object[]{r6.getClass().getCanonicalName()}, 1));
            case 7:
                return String.format(Locale.US, "RumEventMapper: there was no EventMapper assigned for RUM event type: %s", Arrays.copyOf(new Object[]{r6.getClass().getSimpleName()}, 1));
            case 8:
                return String.format(Locale.US, "RumEventMapper: the returned mapped ViewEvent was null. The original event object will be used instead: %s", Arrays.copyOf(new Object[]{r6}, 1));
            case 9:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was null. This event will be dropped: %s", Arrays.copyOf(new Object[]{r6}, 1));
            default:
                return String.format(Locale.US, "RumEventMapper: the returned mapped object was not the same instance as the original object. This event will be dropped: %s", Arrays.copyOf(new Object[]{r6}, 1));
        }
    }
}
