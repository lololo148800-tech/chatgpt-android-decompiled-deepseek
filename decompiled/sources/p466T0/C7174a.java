package p466T0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p076Cm.InterfaceC1723a;

/* JADX INFO: renamed from: T0.a */
/* JADX INFO: loaded from: classes.dex */
public class C7174a implements Map.Entry, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final Object f22806Y;

    /* JADX INFO: renamed from: Z */
    public final Object f22807Z;

    public C7174a(Object obj, Object obj2) {
        this.f22806Y = obj;
        this.f22807Z = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && AbstractC16544l.m18089b(entry.getKey(), this.f22806Y) && AbstractC16544l.m18089b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22806Y;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f22807Z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f22806Y;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f22806Y);
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
