package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: loaded from: classes2.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final Companion Companion = Companion.f53240a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f53240a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final NewKotlinTypeCheckerImpl f53241b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        public final NewKotlinTypeCheckerImpl getDefault() {
            return f53241b;
        }
    }

    KotlinTypeRefiner getKotlinTypeRefiner();

    OverridingUtil getOverridingUtil();
}
