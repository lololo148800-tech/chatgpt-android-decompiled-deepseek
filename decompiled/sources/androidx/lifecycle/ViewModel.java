package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import java.util.Iterator;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m18067d2 = {"Landroidx/lifecycle/ViewModel;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public abstract class ViewModel {

    /* JADX INFO: renamed from: a */
    public final ViewModelImpl f33429a = new ViewModelImpl();

    /* JADX INFO: renamed from: a */
    public final void m12139a(Closeable closeable) {
        ViewModelImpl viewModelImpl = this.f33429a;
        if (viewModelImpl != null) {
            if (viewModelImpl.f33499d) {
                ViewModelImpl.m12167a(closeable);
                return;
            }
            synchronized (viewModelImpl.f33496a) {
                viewModelImpl.f33498c.add(closeable);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12140b(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ViewModelImpl viewModelImpl = this.f33429a;
        if (viewModelImpl != null) {
            if (viewModelImpl.f33499d) {
                ViewModelImpl.m12167a(autoCloseable);
                return;
            }
            synchronized (viewModelImpl.f33496a) {
                autoCloseable2 = (AutoCloseable) viewModelImpl.f33497b.put(str, autoCloseable);
            }
            ViewModelImpl.m12167a(autoCloseable2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12141c() {
        ViewModelImpl viewModelImpl = this.f33429a;
        if (viewModelImpl != null && !viewModelImpl.f33499d) {
            viewModelImpl.f33499d = true;
            synchronized (viewModelImpl.f33496a) {
                try {
                    Iterator it = viewModelImpl.f33497b.values().iterator();
                    while (it.hasNext()) {
                        ViewModelImpl.m12167a((AutoCloseable) it.next());
                    }
                    Iterator it2 = viewModelImpl.f33498c.iterator();
                    while (it2.hasNext()) {
                        ViewModelImpl.m12167a((AutoCloseable) it2.next());
                    }
                    viewModelImpl.f33498c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        mo11734e();
    }

    /* JADX INFO: renamed from: d */
    public final AutoCloseable m12142d(String str) {
        AutoCloseable autoCloseable;
        ViewModelImpl viewModelImpl = this.f33429a;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.f33496a) {
            autoCloseable = (AutoCloseable) viewModelImpl.f33497b.get(str);
        }
        return autoCloseable;
    }

    /* JADX INFO: renamed from: e */
    public void mo11734e() {
    }
}
