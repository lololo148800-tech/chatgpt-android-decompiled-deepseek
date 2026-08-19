package ro;

import java.text.DateFormat;
import p003A1.C0284r0;

/* JADX INFO: renamed from: ro.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC19258b {

    /* JADX INFO: renamed from: a */
    public static final C0284r0 f61050a = new C0284r0(13);

    /* JADX INFO: renamed from: b */
    public static final String[] f61051b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f61052c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f61051b = strArr;
        f61052c = new DateFormat[strArr.length];
    }
}
