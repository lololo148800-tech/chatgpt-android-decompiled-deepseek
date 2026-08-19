package p1155zi;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1113xn.AbstractC21322p;

/* JADX INFO: renamed from: zi.Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21980Z0 {
    /* JADX INFO: renamed from: a */
    public static String m22339a() {
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        String value = AbstractC21322p.m21692Z(string, 0, 5, "bbb24").toString();
        AbstractC16544l.m18094g(value, "value");
        return value;
    }

    /* JADX INFO: renamed from: b */
    public static String m22340b() {
        String string = UUID.randomUUID().toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        String value = AbstractC21322p.m21692Z(string, 0, 5, "bbb21").toString();
        AbstractC16544l.m18094g(value, "value");
        return value;
    }

    public final KSerializer serializer() {
        return C21977Y0.f69577a;
    }
}
