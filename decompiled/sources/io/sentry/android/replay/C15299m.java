package io.sentry.android.replay;

import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: io.sentry.android.replay.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C15299m extends CopyOnWriteArrayList {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C15300n f47790Y;

    public C15299m(C15300n c15300n) {
        this.f47790Y = c15300n;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        InterfaceC15290f interfaceC15290f = (InterfaceC15290f) obj;
        C15300n c15300n = this.f47790Y;
        synchronized (c15300n.f47792Z) {
            for (View view : c15300n.f47794p0) {
                if (interfaceC15290f != null) {
                    interfaceC15290f.mo16513a(view, true);
                }
            }
        }
        return super.add(interfaceC15290f);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC15290f) {
            return super.contains((InterfaceC15290f) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC15290f) {
            return super.indexOf((InterfaceC15290f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC15290f) {
            return super.lastIndexOf((InterfaceC15290f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof InterfaceC15290f) {
            return super.remove((InterfaceC15290f) obj);
        }
        return false;
    }
}
