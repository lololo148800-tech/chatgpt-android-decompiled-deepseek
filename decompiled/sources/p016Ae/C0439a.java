package p016Ae;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Ae.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0439a extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439a(String msg, int i10) {
        super(msg);
        switch (i10) {
            case 4:
                AbstractC16544l.m18094g(msg, "msg");
                super(msg);
                break;
            default:
                AbstractC16544l.m18094g(msg, "message");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439a(String message, Exception exc) {
        super(message, exc);
        AbstractC16544l.m18094g(message, "message");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0439a(int i10) {
        super("Conversation not found");
        switch (i10) {
            case 6:
                super("Message not found");
                break;
            default:
                break;
        }
    }
}
