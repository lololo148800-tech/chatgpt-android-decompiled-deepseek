package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class LazyFieldLite {

    /* JADX INFO: renamed from: a */
    public volatile MessageLite f52744a;

    public int getSerializedSize() {
        return this.f52744a.getSerializedSize();
    }

    public MessageLite getValue(MessageLite messageLite) {
        if (this.f52744a == null) {
            synchronized (this) {
                if (this.f52744a == null) {
                    try {
                        this.f52744a = messageLite;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f52744a;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.f52744a;
        this.f52744a = messageLite;
        return messageLite2;
    }
}
