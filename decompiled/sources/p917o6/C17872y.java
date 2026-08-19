package p917o6;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o6.y */
/* JADX INFO: loaded from: classes.dex */
public final class C17872y {

    /* JADX INFO: renamed from: a */
    public final String f56969a;

    /* JADX INFO: renamed from: b */
    public final List f56970b;

    /* JADX INFO: renamed from: c */
    public final List f56971c;

    /* JADX INFO: renamed from: d */
    public final Map f56972d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f56973e;

    public C17872y(String str, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        this.f56969a = str;
        this.f56970b = list;
        this.f56971c = list2;
        this.f56972d = map;
        this.f56973e = linkedHashMap;
    }

    public final String toString() {
        return "Error(message = " + this.f56969a + ", locations = " + this.f56970b + ", path=" + this.f56971c + ", extensions = " + this.f56972d + ", nonStandardFields = " + this.f56973e + ')';
    }
}
