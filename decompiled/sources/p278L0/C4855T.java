package p278L0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: L0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C4855T {

    /* JADX INFO: renamed from: a */
    public final Object f15815a;

    public C4855T(Map map) {
        this.f15815a = map;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final Object m5499a(float f10) {
        Object next;
        Iterator it = this.f15815a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final Object m5500b(float f10, boolean z6) {
        Object next;
        Iterator it = this.f15815a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z6 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < 0.0f) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z6 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < 0.0f) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: c */
    public final float m5501c() {
        Float fValueOf;
        Collection collectionValues = this.f15815a.values();
        AbstractC16544l.m18094g(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: d */
    public final float m5502d(Object obj) {
        Float f10 = (Float) this.f15815a.get(obj);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4855T)) {
            return false;
        }
        return AbstractC16544l.m18089b(this.f15815a, ((C4855T) obj).f15815a);
    }

    public final int hashCode() {
        return this.f15815a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f15815a + ')';
    }
}
