package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import p482Tg.C7448e;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15316d {

    /* JADX INFO: renamed from: a */
    public final int f47843a;

    /* JADX INFO: renamed from: b */
    public final int f47844b;

    /* JADX INFO: renamed from: c */
    public final float f47845c;

    /* JADX INFO: renamed from: d */
    public final boolean f47846d;

    /* JADX INFO: renamed from: e */
    public final Rect f47847e;

    /* JADX INFO: renamed from: f */
    public ArrayList f47848f;

    public AbstractC15316d(int i10, int i11, float f10, AbstractC15316d abstractC15316d, boolean z6, Rect rect) {
        this.f47843a = i10;
        this.f47844b = i11;
        this.f47845c = f10;
        this.f47846d = z6;
        this.f47847e = rect;
    }

    /* JADX INFO: renamed from: a */
    public final void m16522a(C7448e c7448e) {
        ArrayList arrayList;
        if (!((Boolean) c7448e.invoke(this)).booleanValue() || (arrayList = this.f47848f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC15316d) it.next()).m16522a(c7448e);
        }
    }
}
