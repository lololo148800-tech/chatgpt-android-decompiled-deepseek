package p857kl;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: kl.H */
/* JADX INFO: loaded from: classes3.dex */
public final class C16441H extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16441H(String data, String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + '\"');
        AbstractC16544l.m18094g(data, "data");
        AbstractC16544l.m18094g(reason, "reason");
    }
}
