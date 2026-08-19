package p1155zi;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;

/* JADX INFO: renamed from: zi.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C21903D {
    /* JADX INFO: renamed from: a */
    public static String m22336a(String fileId) {
        AbstractC16544l.m18094g(fileId, "fileId");
        String value = "file-service://".concat(fileId);
        AbstractC16544l.m18094g(value, "value");
        return value;
    }

    public final KSerializer serializer() {
        return C21899C.f69433a;
    }
}
