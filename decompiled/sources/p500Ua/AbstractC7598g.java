package p500Ua;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p003A1.AbstractC0168G;

/* JADX INFO: renamed from: Ua.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7598g {

    /* JADX INFO: renamed from: a */
    public static final HashMap f24028a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f24028a = new HashMap();
        AbstractC0168G.m532u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }
}
