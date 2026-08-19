package p586Y0;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1726d;

/* JADX INFO: renamed from: Y0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C9573y implements Map.Entry, InterfaceC1726d {

    /* JADX INFO: renamed from: Y */
    public final Object f28809Y;

    /* JADX INFO: renamed from: Z */
    public Object f28810Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ C9574z f28811o0;

    public C9573y(C9574z c9574z) {
        this.f28811o0 = c9574z;
        Map.Entry entry = c9574z.f28815p0;
        AbstractC16544l.m18091d(entry);
        this.f28809Y = entry.getKey();
        Map.Entry entry2 = c9574z.f28815p0;
        AbstractC16544l.m18091d(entry2);
        this.f28810Z = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f28809Y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f28810Z;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C9574z c9574z = this.f28811o0;
        if (c9574z.f28812Y.m10115a().f28778d != c9574z.f28814o0) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f28810Z;
        c9574z.f28812Y.put(this.f28809Y, obj);
        this.f28810Z = obj;
        return obj2;
    }
}
