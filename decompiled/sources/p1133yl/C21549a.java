package p1133yl;

import java.nio.charset.MalformedInputException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: yl.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21549a extends MalformedInputException {

    /* JADX INFO: renamed from: Y */
    public final String f68248Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21549a(String message) {
        super(0);
        AbstractC16544l.m18094g(message, "message");
        this.f68248Y = message;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.f68248Y;
    }
}
