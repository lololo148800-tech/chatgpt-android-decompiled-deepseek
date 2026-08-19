package p1072w2;

import android.os.LocaleList;
import java.util.Locale;
import p1027tp.AbstractC20064h;

/* JADX INFO: renamed from: w2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C20796h implements InterfaceC20795g {

    /* JADX INFO: renamed from: a */
    public final LocaleList f66060a;

    public C20796h(Object obj) {
        this.f66060a = AbstractC20064h.m20899c(obj);
    }

    @Override // p1072w2.InterfaceC20795g
    /* JADX INFO: renamed from: a */
    public final String mo21311a() {
        return this.f66060a.toLanguageTags();
    }

    @Override // p1072w2.InterfaceC20795g
    /* JADX INFO: renamed from: b */
    public final Object mo21312b() {
        return this.f66060a;
    }

    public final boolean equals(Object obj) {
        return this.f66060a.equals(((InterfaceC20795g) obj).mo21312b());
    }

    @Override // p1072w2.InterfaceC20795g
    public final Locale get(int i10) {
        return this.f66060a.get(i10);
    }

    public final int hashCode() {
        return this.f66060a.hashCode();
    }

    @Override // p1072w2.InterfaceC20795g
    public final boolean isEmpty() {
        return this.f66060a.isEmpty();
    }

    @Override // p1072w2.InterfaceC20795g
    public final int size() {
        return this.f66060a.size();
    }

    public final String toString() {
        return this.f66060a.toString();
    }
}
