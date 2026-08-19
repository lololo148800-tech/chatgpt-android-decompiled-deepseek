package p357Oa;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Oa.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6155h {

    /* JADX INFO: renamed from: a */
    public static final HashMap f20039a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f20039a = new HashMap();
        AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
