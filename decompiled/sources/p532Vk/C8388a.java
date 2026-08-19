package p532Vk;

import java.io.IOException;
import java.net.ConnectException;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: Vk.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C8388a extends ConnectException {

    /* JADX INFO: renamed from: Y */
    public final IOException f26106Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8388a(String message, IOException iOException) {
        super(message);
        AbstractC16544l.m18094g(message, "message");
        this.f26106Y = iOException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f26106Y;
    }
}
