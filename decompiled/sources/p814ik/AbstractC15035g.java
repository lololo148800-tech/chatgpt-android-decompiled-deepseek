package p814ik;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p523V9.AbstractC7966P5;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: renamed from: ik.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15035g {

    /* JADX INFO: renamed from: a */
    public static final List f46733a = AbstractC17681o.m19382k("com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot");

    /* JADX INFO: renamed from: b */
    public static final List f46734b = AbstractC17681o.m19382k("com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_");

    /* JADX INFO: renamed from: c */
    public static final List f46735c = AbstractC17681o.m19382k("com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot");

    /* JADX INFO: renamed from: d */
    public static final List f46736d = AbstractC17681o.m19382k("/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/");

    /* JADX INFO: renamed from: e */
    public static final List f46737e = AbstractC17681o.m19382k("/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc");

    /* JADX INFO: renamed from: f */
    public static Boolean f46738f;

    /* JADX INFO: renamed from: a */
    public static final boolean m16162a(String str) {
        Iterator it = f46736d.iterator();
        while (it.hasNext()) {
            if (new File((String) it.next(), str).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m16163b() {
        boolean z6 = false;
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec((String[]) AbstractC21322p.m21697e0("which su", new String[]{Separators.f31991SP}, 0, 6).toArray(new String[0]));
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                z6 = true;
            }
        } catch (Exception unused) {
            if (processExec != null) {
            }
            return z6;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
        processExec.destroy();
        return z6;
    }

    /* JADX INFO: renamed from: c */
    public static final List m16164c(String str) {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec(str).getInputStream();
        } catch (IOException unused) {
            inputStream = null;
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException unused2) {
            next = "";
        }
        AbstractC16544l.m18091d(next);
        List listM21697e0 = AbstractC21322p.m21697e0(next, new String[]{Separators.RETURN}, 0, 6);
        if (!listM21697e0.isEmpty()) {
            ListIterator listIterator = listM21697e0.listIterator(listM21697e0.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    return AbstractC17680n.m19373w0(listM21697e0, listIterator.nextIndex() + 1);
                }
            }
        }
        return C17689w.f56480Y;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m16165d() {
        String str;
        String str2;
        Iterator it = m16164c("mount").iterator();
        while (it.hasNext()) {
            List listM21697e0 = AbstractC21322p.m21697e0((String) it.next(), new String[]{Separators.f31991SP}, 0, 6);
            if (listM21697e0.size() == 6) {
                str = (String) listM21697e0.get(2);
                str2 = (String) listM21697e0.get(5);
            } else if (listM21697e0.size() == 4) {
                str = (String) listM21697e0.get(1);
                str2 = (String) listM21697e0.get(3);
            } else {
                continue;
            }
            Iterator it2 = f46737e.iterator();
            while (it2.hasNext()) {
                if (AbstractC21329w.m21726m(str, (String) it2.next())) {
                    int length = str2.length() - 1;
                    int i10 = 0;
                    boolean z6 = false;
                    while (i10 <= length) {
                        char cCharAt = str2.charAt(!z6 ? i10 : length);
                        boolean z10 = AbstractC7966P5.m8258f(cCharAt) || cCharAt == '(' || cCharAt == ')';
                        if (z6) {
                            if (!z10) {
                                break;
                            }
                            length--;
                        } else if (z10) {
                            i10++;
                        } else {
                            z6 = true;
                        }
                    }
                    Iterator it3 = AbstractC21322p.m21697e0(str2.subSequence(i10, length + 1).toString(), new String[]{Separators.COMMA}, 0, 6).iterator();
                    while (it3.hasNext()) {
                        if (AbstractC21329w.m21726m((String) it3.next(), "rw")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m16166e() {
        String str = Build.TAGS;
        String str2 = Build.FINGERPRINT;
        String str3 = Build.PRODUCT;
        String str4 = Build.HARDWARE;
        String str5 = Build.DISPLAY;
        if (str == null) {
            return false;
        }
        if (!AbstractC21322p.m21667A(str, "test-keys", false)) {
            AbstractC16544l.m18091d(str2);
            if (!AbstractC21322p.m21667A(str2, "genric.*test-keys", false)) {
                AbstractC16544l.m18091d(str3);
                if (!AbstractC21322p.m21667A(str3, "generic", false) && !AbstractC21322p.m21667A(str3, "sdk", false)) {
                    AbstractC16544l.m18091d(str4);
                    if (!AbstractC21322p.m21667A(str4, "goldfish", false)) {
                        AbstractC16544l.m18091d(str5);
                        if (!AbstractC21322p.m21667A(str5, ".*test-keys", false)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m16167f(Context context, List list) {
        PackageManager packageManager = context.getPackageManager();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                    return true;
                }
                packageManager.getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX INFO: renamed from: g */
    public static final boolean m16168g(Context context) {
        AbstractC16544l.m18094g(context, "<this>");
        Boolean bool = f46738f;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z6 = false;
        try {
            if (m16167f(context, f46733a) || m16167f(context, f46734b) || m16162a("su") || m16162a("magisk")) {
                z6 = true;
            } else {
                boolean z10 = false;
                boolean z11 = true;
                for (String str : m16164c("getprop")) {
                    if (AbstractC21322p.m21667A(str, "[ro.debuggable]", false) && AbstractC21322p.m21667A(str, "[1]", false)) {
                        z10 = true;
                    } else if (AbstractC21322p.m21667A(str, "[ro.secure]", false) && AbstractC21322p.m21667A(str, "[0]", false)) {
                        z11 = false;
                    }
                }
                if ((z10 && !z11) || m16165d() || ((m16166e() && !AbstractC15032d.m16160a()) || m16163b())) {
                    z6 = true;
                }
            }
        } catch (Exception unused) {
        }
        f46738f = Boolean.valueOf(z6);
        return z6;
    }
}
