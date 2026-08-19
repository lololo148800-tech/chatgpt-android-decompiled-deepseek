package kg;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: kg.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C16402h implements InterfaceC16403i {

    /* JADX INFO: renamed from: a */
    public final String f50915a;

    public C16402h(String value) {
        AbstractC16544l.m18094g(value, "value");
        this.f50915a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16402h) && AbstractC16544l.m18089b(this.f50915a, ((C16402h) obj).f50915a);
    }

    public final int hashCode() {
        return this.f50915a.hashCode();
    }

    public final String toString() {
        return "█";
    }
}
