package kotlin.reflect.jvm.internal.impl.utils.addToStdlib;

import kotlin.jvm.internal.AbstractC16544l;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class AddToStdlibKt {
    static {
        new ConcurrentHashMap();
    }

    public static final Void shouldNotBeCalled(String message) {
        AbstractC16544l.m18094g(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void shouldNotBeCalled$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return shouldNotBeCalled(str);
    }
}
