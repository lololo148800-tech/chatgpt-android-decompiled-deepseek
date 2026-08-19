package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC16544l;
import p310M9.C5311e;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC11115x extends Service implements InterfaceC11112u {

    /* JADX INFO: renamed from: Y */
    public final C5311e f33511Y = new C5311e(this);

    @Override // androidx.lifecycle.InterfaceC11112u
    /* JADX INFO: renamed from: i */
    public final AbstractC11105n mo7809i() {
        return (C11114w) this.f33511Y.f17484Z;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        AbstractC16544l.m18094g(intent, "intent");
        this.f33511Y.m5868x(EnumC11103l.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f33511Y.m5868x(EnumC11103l.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC11103l enumC11103l = EnumC11103l.ON_STOP;
        C5311e c5311e = this.f33511Y;
        c5311e.m5868x(enumC11103l);
        c5311e.m5868x(EnumC11103l.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f33511Y.m5868x(EnumC11103l.ON_START);
        super.onStart(intent, i10);
    }
}
