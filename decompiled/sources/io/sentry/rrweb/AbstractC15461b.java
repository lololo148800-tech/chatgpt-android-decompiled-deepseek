package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.rrweb.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15461b {

    /* JADX INFO: renamed from: Y */
    public EnumC15462c f48290Y;

    /* JADX INFO: renamed from: Z */
    public long f48291Z = System.currentTimeMillis();

    public AbstractC15461b(EnumC15462c enumC15462c) {
        this.f48290Y = enumC15462c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC15461b)) {
            return false;
        }
        AbstractC15461b abstractC15461b = (AbstractC15461b) obj;
        return this.f48291Z == abstractC15461b.f48291Z && this.f48290Y == abstractC15461b.f48290Y;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48290Y, Long.valueOf(this.f48291Z)});
    }
}
