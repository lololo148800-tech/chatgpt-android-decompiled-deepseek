package p926of;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: of.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18175l extends AbstractC18176m {

    /* JADX INFO: renamed from: a */
    public final String f57987a;

    /* JADX INFO: renamed from: b */
    public final int f57988b;

    /* JADX INFO: renamed from: c */
    public final int f57989c;

    public C18175l(String str, int i10, int i11) {
        this.f57987a = str;
        this.f57988b = i10;
        this.f57989c = i11;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: a */
    public final int mo19718a() {
        return this.f57989c;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: b */
    public final int mo19719b() {
        return this.f57988b;
    }

    @Override // p926of.AbstractC18176m
    /* JADX INFO: renamed from: c */
    public final String mo19720c() {
        return this.f57987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18175l)) {
            return false;
        }
        C18175l c18175l = (C18175l) obj;
        return AbstractC16544l.m18089b(this.f57987a, c18175l.f57987a) && this.f57988b == c18175l.f57988b && this.f57989c == c18175l.f57989c;
    }

    public final int hashCode() {
        String str = this.f57987a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.f57988b) * 31) + this.f57989c;
    }

    public final String toString() {
        return "█";
    }
}
