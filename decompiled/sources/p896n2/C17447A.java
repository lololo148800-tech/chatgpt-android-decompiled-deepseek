package p896n2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import io.sentry.android.core.AbstractC15256t;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: n2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C17447A implements Iterable {

    /* JADX INFO: renamed from: Y */
    public final ArrayList f55785Y = new ArrayList();

    /* JADX INFO: renamed from: Z */
    public final Context f55786Z;

    public C17447A(Context context) {
        this.f55786Z = context;
    }

    /* JADX INFO: renamed from: f */
    public final void m19124f(ComponentName componentName) {
        Context context = this.f55786Z;
        ArrayList arrayList = this.f55785Y;
        int size = arrayList.size();
        try {
            for (Intent intentM19127a = AbstractC17452e.m19127a(context, componentName); intentM19127a != null; intentM19127a = AbstractC17452e.m19127a(context, intentM19127a.getComponent())) {
                arrayList.add(size, intentM19127a);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AbstractC15256t.m16465c("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m19125i() {
        ArrayList arrayList = this.f55785Y;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f55786Z.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f55785Y.iterator();
    }
}
