package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import p523V9.AbstractC7877E4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class KotlinRetention {
    public static final KotlinRetention BINARY;
    public static final KotlinRetention RUNTIME;
    public static final KotlinRetention SOURCE;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KotlinRetention[] f51446Y;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        RUNTIME = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        BINARY = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        SOURCE = kotlinRetention3;
        KotlinRetention[] kotlinRetentionArr = {kotlinRetention, kotlinRetention2, kotlinRetention3};
        f51446Y = kotlinRetentionArr;
        AbstractC7877E4.m8156j(kotlinRetentionArr);
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) f51446Y.clone();
    }
}
