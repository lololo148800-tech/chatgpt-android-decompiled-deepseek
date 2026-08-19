package bo;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import p917o6.C17867t;

/* JADX INFO: renamed from: bo.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C11534v {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f34898a;

    public C11534v(int i10) {
        switch (i10) {
            case 1:
                this.f34898a = new LinkedHashMap();
                break;
            default:
                this.f34898a = new LinkedHashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C16644c m12925a() {
        return new C16644c(this.f34898a);
    }

    /* JADX INFO: renamed from: b */
    public C17867t m12926b() {
        return new C17867t(this.f34898a, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC16643b m12927c(String key, AbstractC16643b element) {
        AbstractC16544l.m18094g(key, "key");
        AbstractC16544l.m18094g(element, "element");
        return (AbstractC16643b) this.f34898a.put(key, element);
    }
}
