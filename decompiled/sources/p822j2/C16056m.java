package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import livekit.LivekitInternal$NodeStats;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0010F;
import p571X9.AbstractC9306j0;
import p694d2.AbstractC12995a;
import p798i2.AbstractC14918a;

/* JADX INFO: renamed from: j2.m */
/* JADX INFO: loaded from: classes.dex */
public final class C16056m {

    /* JADX INFO: renamed from: d */
    public static final int[] f49698d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f49699e;

    /* JADX INFO: renamed from: f */
    public static final SparseIntArray f49700f;

    /* JADX INFO: renamed from: a */
    public final HashMap f49701a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final boolean f49702b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f49703c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f49699e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f49700f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: f */
    public static int[] m17628f(Barrier barrier, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(Separators.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC16058o.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, ParameterNames.f31999ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f32841A0) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.f32841A0.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0600. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0088. Please report as an issue. */
    /* JADX INFO: renamed from: h */
    public static C16051h m17629h(Context context, AttributeSet attributeSet, boolean z6) {
        String str;
        int i10;
        int i11;
        C16051h c16051h = new C16051h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z6 ? AbstractC16059p.f49706c : AbstractC16059p.f49704a);
        int[] iArr = f49698d;
        SparseIntArray sparseIntArray = f49699e;
        C16054k c16054k = c16051h.f49597b;
        String[] strArr = AbstractC12995a.f41246a;
        C16055l c16055l = c16051h.f49600e;
        C16053j c16053j = c16051h.f49598c;
        C16052i c16052i = c16051h.f49599d;
        String str2 = "Unknown attribute 0x";
        String str3 = "ConstraintSet";
        if (z6) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C16050g c16050g = new C16050g();
            c16050g.f49584a = new int[10];
            c16050g.f49585b = new int[10];
            c16050g.f49586c = 0;
            c16050g.f49587d = new int[10];
            c16050g.f49588e = new float[10];
            c16050g.f49589f = 0;
            c16050g.f49590g = new int[5];
            c16050g.f49591h = new String[5];
            c16050g.f49592i = 0;
            c16050g.f49593j = new int[4];
            c16050g.f49594k = new boolean[4];
            c16050g.f49595l = 0;
            c16053j.getClass();
            c16052i.getClass();
            c16055l.getClass();
            int i12 = 0;
            while (i12 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = indexCount;
                switch (f49700f.get(index)) {
                    case 2:
                        c16050g.m17620b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49611I));
                        i11 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder(str2);
                        str2 = str2;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        AbstractC15256t.m16482t("ConstraintSet", sb2.toString());
                        i11 = 1;
                        break;
                    case 5:
                        c16050g.m17621c(5, typedArrayObtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 6:
                        str2 = str2;
                        c16050g.m17620b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16052i.f49605C));
                        i11 = 1;
                        break;
                    case 7:
                        str2 = str2;
                        c16050g.m17620b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16052i.f49606D));
                        i11 = 1;
                        break;
                    case 8:
                        str2 = str2;
                        c16050g.m17620b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49612J));
                        i11 = 1;
                        break;
                    case 11:
                        str2 = str2;
                        c16050g.m17620b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49618P));
                        i11 = 1;
                        break;
                    case 12:
                        str2 = str2;
                        c16050g.m17620b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49619Q));
                        i11 = 1;
                        break;
                    case 13:
                        str2 = str2;
                        c16050g.m17620b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49615M));
                        i11 = 1;
                        break;
                    case 14:
                        str2 = str2;
                        c16050g.m17620b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49617O));
                        i11 = 1;
                        break;
                    case 15:
                        str2 = str2;
                        c16050g.m17620b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49620R));
                        i11 = 1;
                        break;
                    case 16:
                        str2 = str2;
                        c16050g.m17620b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49616N));
                        i11 = 1;
                        break;
                    case 17:
                        str2 = str2;
                        c16050g.m17620b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16052i.f49635d));
                        i11 = 1;
                        break;
                    case 18:
                        str2 = str2;
                        c16050g.m17620b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16052i.f49637e));
                        i11 = 1;
                        break;
                    case 19:
                        str2 = str2;
                        c16050g.m17619a(19, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49639f));
                        i11 = 1;
                        break;
                    case 20:
                        str2 = str2;
                        c16050g.m17619a(20, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49666w));
                        i11 = 1;
                        break;
                    case 21:
                        str2 = str2;
                        c16050g.m17620b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c16052i.f49633c));
                        i11 = 1;
                        break;
                    case 22:
                        str2 = str2;
                        c16050g.m17620b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c16054k.f49680a)]);
                        i11 = 1;
                        break;
                    case 23:
                        str2 = str2;
                        c16050g.m17620b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c16052i.f49631b));
                        i11 = 1;
                        break;
                    case 24:
                        str2 = str2;
                        c16050g.m17620b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49608F));
                        i11 = 1;
                        break;
                    case 27:
                        str2 = str2;
                        c16050g.m17620b(27, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49607E));
                        i11 = 1;
                        break;
                    case 28:
                        str2 = str2;
                        c16050g.m17620b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49609G));
                        i11 = 1;
                        break;
                    case 31:
                        str2 = str2;
                        c16050g.m17620b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49613K));
                        i11 = 1;
                        break;
                    case 34:
                        str2 = str2;
                        c16050g.m17620b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49610H));
                        i11 = 1;
                        break;
                    case 37:
                        str2 = str2;
                        c16050g.m17619a(37, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49667x));
                        i11 = 1;
                        break;
                    case 38:
                        str2 = str2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c16051h.f49596a);
                        c16051h.f49596a = resourceId;
                        c16050g.m17620b(38, resourceId);
                        i11 = 1;
                        break;
                    case 39:
                        str2 = str2;
                        c16050g.m17619a(39, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49623U));
                        i11 = 1;
                        break;
                    case 40:
                        str2 = str2;
                        c16050g.m17619a(40, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49622T));
                        i11 = 1;
                        break;
                    case 41:
                        str2 = str2;
                        c16050g.m17620b(41, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49624V));
                        i11 = 1;
                        break;
                    case 42:
                        str2 = str2;
                        c16050g.m17620b(42, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49625W));
                        i11 = 1;
                        break;
                    case 43:
                        str2 = str2;
                        c16050g.m17619a(43, typedArrayObtainStyledAttributes.getFloat(index, c16054k.f49682c));
                        i11 = 1;
                        break;
                    case 44:
                        str2 = str2;
                        c16050g.m17622d(44, true);
                        c16050g.m17619a(44, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49697m));
                        i11 = 1;
                        break;
                    case 45:
                        str2 = str2;
                        c16050g.m17619a(45, typedArrayObtainStyledAttributes.getFloat(index, c16055l.f49686b));
                        i11 = 1;
                        break;
                    case 46:
                        str2 = str2;
                        c16050g.m17619a(46, typedArrayObtainStyledAttributes.getFloat(index, c16055l.f49687c));
                        i11 = 1;
                        break;
                    case 47:
                        str2 = str2;
                        c16050g.m17619a(47, typedArrayObtainStyledAttributes.getFloat(index, c16055l.f49688d));
                        i11 = 1;
                        break;
                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                        str2 = str2;
                        c16050g.m17619a(48, typedArrayObtainStyledAttributes.getFloat(index, c16055l.f49689e));
                        i11 = 1;
                        break;
                    case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                        str2 = str2;
                        c16050g.m17619a(49, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49690f));
                        i11 = 1;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        str2 = str2;
                        c16050g.m17619a(50, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49691g));
                        i11 = 1;
                        break;
                    case 51:
                        str2 = str2;
                        c16050g.m17619a(51, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49693i));
                        i11 = 1;
                        break;
                    case 52:
                        str2 = str2;
                        c16050g.m17619a(52, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49694j));
                        i11 = 1;
                        break;
                    case 53:
                        str2 = str2;
                        c16050g.m17619a(53, typedArrayObtainStyledAttributes.getDimension(index, c16055l.f49695k));
                        i11 = 1;
                        break;
                    case 54:
                        str2 = str2;
                        c16050g.m17620b(54, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49626X));
                        i11 = 1;
                        break;
                    case 55:
                        str2 = str2;
                        c16050g.m17620b(55, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49627Y));
                        i11 = 1;
                        break;
                    case 56:
                        str2 = str2;
                        c16050g.m17620b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49628Z));
                        i11 = 1;
                        break;
                    case 57:
                        str2 = str2;
                        c16050g.m17620b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49630a0));
                        i11 = 1;
                        break;
                    case 58:
                        str2 = str2;
                        c16050g.m17620b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49632b0));
                        i11 = 1;
                        break;
                    case 59:
                        str2 = str2;
                        c16050g.m17620b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49634c0));
                        i11 = 1;
                        break;
                    case 60:
                        str2 = str2;
                        c16050g.m17619a(60, typedArrayObtainStyledAttributes.getFloat(index, c16055l.f49685a));
                        i11 = 1;
                        break;
                    case 62:
                        str2 = str2;
                        c16050g.m17620b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49603A));
                        i11 = 1;
                        break;
                    case 63:
                        str2 = str2;
                        c16050g.m17619a(63, typedArrayObtainStyledAttributes.getFloat(index, c16052i.f49604B));
                        i11 = 1;
                        break;
                    case 64:
                        str2 = str2;
                        c16050g.m17620b(64, m17630k(typedArrayObtainStyledAttributes, index, c16053j.f49671a));
                        i11 = 1;
                        break;
                    case 65:
                        str2 = str2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c16050g.m17621c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c16050g.m17621c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i11 = 1;
                        break;
                    case 66:
                        str2 = str2;
                        c16050g.m17620b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i11 = 1;
                        break;
                    case 67:
                        str2 = str2;
                        c16050g.m17619a(67, typedArrayObtainStyledAttributes.getFloat(index, c16053j.f49675e));
                        i11 = 1;
                        break;
                    case 68:
                        str2 = str2;
                        c16050g.m17619a(68, typedArrayObtainStyledAttributes.getFloat(index, c16054k.f49683d));
                        i11 = 1;
                        break;
                    case 69:
                        str2 = str2;
                        c16050g.m17619a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 70:
                        str2 = str2;
                        c16050g.m17619a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i11 = 1;
                        break;
                    case 71:
                        str2 = str2;
                        AbstractC15256t.m16465c("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i11 = 1;
                        break;
                    case 72:
                        str2 = str2;
                        c16050g.m17620b(72, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49640f0));
                        i11 = 1;
                        break;
                    case 73:
                        str2 = str2;
                        c16050g.m17620b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49642g0));
                        i11 = 1;
                        break;
                    case 74:
                        str2 = str2;
                        c16050g.m17621c(74, typedArrayObtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 75:
                        str2 = str2;
                        c16050g.m17622d(75, typedArrayObtainStyledAttributes.getBoolean(index, c16052i.f49656n0));
                        i11 = 1;
                        break;
                    case 76:
                        str2 = str2;
                        c16050g.m17620b(76, typedArrayObtainStyledAttributes.getInt(index, c16053j.f49673c));
                        i11 = 1;
                        break;
                    case 77:
                        str2 = str2;
                        c16050g.m17621c(77, typedArrayObtainStyledAttributes.getString(index));
                        i11 = 1;
                        break;
                    case 78:
                        str2 = str2;
                        c16050g.m17620b(78, typedArrayObtainStyledAttributes.getInt(index, c16054k.f49681b));
                        i11 = 1;
                        break;
                    case 79:
                        str2 = str2;
                        c16050g.m17619a(79, typedArrayObtainStyledAttributes.getFloat(index, c16053j.f49674d));
                        i11 = 1;
                        break;
                    case 80:
                        str2 = str2;
                        c16050g.m17622d(80, typedArrayObtainStyledAttributes.getBoolean(index, c16052i.f49652l0));
                        i11 = 1;
                        break;
                    case 81:
                        str2 = str2;
                        c16050g.m17622d(81, typedArrayObtainStyledAttributes.getBoolean(index, c16052i.f49654m0));
                        i11 = 1;
                        break;
                    case 82:
                        str2 = str2;
                        c16050g.m17620b(82, typedArrayObtainStyledAttributes.getInteger(index, c16053j.f49672b));
                        i11 = 1;
                        break;
                    case 83:
                        str2 = str2;
                        c16050g.m17620b(83, m17630k(typedArrayObtainStyledAttributes, index, c16055l.f49692h));
                        i11 = 1;
                        break;
                    case 84:
                        str2 = str2;
                        c16050g.m17620b(84, typedArrayObtainStyledAttributes.getInteger(index, c16053j.f49677g));
                        i11 = 1;
                        break;
                    case 85:
                        str2 = str2;
                        c16050g.m17619a(85, typedArrayObtainStyledAttributes.getFloat(index, c16053j.f49676f));
                        i11 = 1;
                        break;
                    case 86:
                        str2 = str2;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c16053j.f49679i = resourceId2;
                            c16050g.m17620b(89, resourceId2);
                            if (c16053j.f49679i != -1) {
                                c16050g.m17620b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c16053j.f49678h = string;
                            c16050g.m17621c(90, string);
                            if (c16053j.f49678h.indexOf(Separators.SLASH) > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c16053j.f49679i = resourceId3;
                                c16050g.m17620b(89, resourceId3);
                                c16050g.m17620b(88, -2);
                            } else {
                                c16050g.m17620b(88, -1);
                            }
                        } else {
                            c16050g.m17620b(88, typedArrayObtainStyledAttributes.getInteger(index, c16053j.f49679i));
                        }
                        i11 = 1;
                        break;
                    case 87:
                        str2 = str2;
                        AbstractC15256t.m16482t("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i11 = 1;
                        break;
                    case 93:
                        str2 = str2;
                        c16050g.m17620b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49614L));
                        i11 = 1;
                        break;
                    case 94:
                        str2 = str2;
                        c16050g.m17620b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16052i.f49621S));
                        i11 = 1;
                        break;
                    case 95:
                        str2 = str2;
                        m17631l(c16050g, typedArrayObtainStyledAttributes, index, 0);
                        i11 = 1;
                        break;
                    case 96:
                        str2 = str2;
                        i11 = 1;
                        m17631l(c16050g, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str2 = str2;
                        c16050g.m17620b(97, typedArrayObtainStyledAttributes.getInt(index, c16052i.f49658o0));
                        i11 = 1;
                        break;
                    case 98:
                        str2 = str2;
                        int i15 = AbstractC14918a.f46476G0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c16051h.f49596a = typedArrayObtainStyledAttributes.getResourceId(index, c16051h.f49596a);
                        }
                        i11 = 1;
                        break;
                    case 99:
                        str2 = str2;
                        c16050g.m17622d(99, typedArrayObtainStyledAttributes.getBoolean(index, c16052i.f49641g));
                        i11 = 1;
                        break;
                }
                i12 += i11;
                indexCount = i13;
                str2 = str2;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            String str5 = "Unknown attribute 0x";
            int i16 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i17 = 0;
            while (i17 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i17);
                if (index2 != i16 && 23 != index2 && 24 != index2) {
                    c16053j.getClass();
                    c16052i.getClass();
                    c16055l.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49659p = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49659p);
                        i10 = 1;
                        break;
                    case 2:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49611I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49611I);
                        i10 = 1;
                        break;
                    case 3:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49657o = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49657o);
                        i10 = 1;
                        break;
                    case 4:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49655n = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49655n);
                        i10 = 1;
                        break;
                    case 5:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49668y = typedArrayObtainStyledAttributes.getString(index2);
                        i10 = 1;
                        break;
                    case 6:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49605C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c16052i.f49605C);
                        i10 = 1;
                        break;
                    case 7:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49606D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c16052i.f49606D);
                        i10 = 1;
                        break;
                    case 8:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49612J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49612J);
                        i10 = 1;
                        break;
                    case 9:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49665v = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49665v);
                        i10 = 1;
                        break;
                    case 10:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49664u = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49664u);
                        i10 = 1;
                        break;
                    case 11:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49618P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49618P);
                        i10 = 1;
                        break;
                    case 12:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49619Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49619Q);
                        i10 = 1;
                        break;
                    case 13:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49615M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49615M);
                        i10 = 1;
                        break;
                    case 14:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49617O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49617O);
                        i10 = 1;
                        break;
                    case 15:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49620R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49620R);
                        i10 = 1;
                        break;
                    case 16:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49616N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49616N);
                        i10 = 1;
                        break;
                    case 17:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49635d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c16052i.f49635d);
                        i10 = 1;
                        break;
                    case 18:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49637e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c16052i.f49637e);
                        i10 = 1;
                        break;
                    case 19:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49639f = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49639f);
                        i10 = 1;
                        break;
                    case 20:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49666w = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49666w);
                        i10 = 1;
                        break;
                    case 21:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49633c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c16052i.f49633c);
                        i10 = 1;
                        break;
                    case 22:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        int i18 = typedArrayObtainStyledAttributes.getInt(index2, c16054k.f49680a);
                        c16054k.f49680a = i18;
                        c16054k.f49680a = iArr[i18];
                        i10 = 1;
                        break;
                    case 23:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49631b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c16052i.f49631b);
                        i10 = 1;
                        break;
                    case 24:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49608F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49608F);
                        i10 = 1;
                        break;
                    case 25:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49643h = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49643h);
                        i10 = 1;
                        break;
                    case 26:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49645i = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49645i);
                        i10 = 1;
                        break;
                    case 27:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49607E = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49607E);
                        i10 = 1;
                        break;
                    case 28:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49609G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49609G);
                        i10 = 1;
                        break;
                    case 29:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49647j = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49647j);
                        i10 = 1;
                        break;
                    case 30:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49649k = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49649k);
                        i10 = 1;
                        break;
                    case 31:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49613K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49613K);
                        i10 = 1;
                        break;
                    case 32:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49662s = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49662s);
                        i10 = 1;
                        break;
                    case 33:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49663t = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49663t);
                        i10 = 1;
                        break;
                    case 34:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49610H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49610H);
                        i10 = 1;
                        break;
                    case 35:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49653m = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49653m);
                        i10 = 1;
                        break;
                    case 36:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49651l = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49651l);
                        i10 = 1;
                        break;
                    case 37:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49667x = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49667x);
                        i10 = 1;
                        break;
                    case 38:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16051h.f49596a = typedArrayObtainStyledAttributes.getResourceId(index2, c16051h.f49596a);
                        i10 = 1;
                        break;
                    case 39:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49623U = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49623U);
                        i10 = 1;
                        break;
                    case 40:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49622T = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49622T);
                        i10 = 1;
                        break;
                    case 41:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49624V = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49624V);
                        i10 = 1;
                        break;
                    case 42:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49625W = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49625W);
                        i10 = 1;
                        break;
                    case 43:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16054k.f49682c = typedArrayObtainStyledAttributes.getFloat(index2, c16054k.f49682c);
                        i10 = 1;
                        break;
                    case 44:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49696l = true;
                        c16055l.f49697m = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49697m);
                        i10 = 1;
                        break;
                    case 45:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49686b = typedArrayObtainStyledAttributes.getFloat(index2, c16055l.f49686b);
                        i10 = 1;
                        break;
                    case 46:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49687c = typedArrayObtainStyledAttributes.getFloat(index2, c16055l.f49687c);
                        i10 = 1;
                        break;
                    case 47:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49688d = typedArrayObtainStyledAttributes.getFloat(index2, c16055l.f49688d);
                        i10 = 1;
                        break;
                    case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49689e = typedArrayObtainStyledAttributes.getFloat(index2, c16055l.f49689e);
                        i10 = 1;
                        break;
                    case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49690f = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49690f);
                        i10 = 1;
                        break;
                    case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49691g = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49691g);
                        i10 = 1;
                        break;
                    case 51:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49693i = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49693i);
                        i10 = 1;
                        break;
                    case 52:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49694j = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49694j);
                        i10 = 1;
                        break;
                    case 53:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49695k = typedArrayObtainStyledAttributes.getDimension(index2, c16055l.f49695k);
                        i10 = 1;
                        break;
                    case 54:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49626X = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49626X);
                        i10 = 1;
                        break;
                    case 55:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49627Y = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49627Y);
                        i10 = 1;
                        break;
                    case 56:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49628Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49628Z);
                        i10 = 1;
                        break;
                    case 57:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49630a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49630a0);
                        i10 = 1;
                        break;
                    case 58:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49632b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49632b0);
                        i10 = 1;
                        break;
                    case 59:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49634c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49634c0);
                        i10 = 1;
                        break;
                    case 60:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16055l.f49685a = typedArrayObtainStyledAttributes.getFloat(index2, c16055l.f49685a);
                        i10 = 1;
                        break;
                    case 61:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49669z = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49669z);
                        i10 = 1;
                        break;
                    case 62:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49603A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49603A);
                        i10 = 1;
                        break;
                    case 63:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16052i.f49604B = typedArrayObtainStyledAttributes.getFloat(index2, c16052i.f49604B);
                        i10 = 1;
                        break;
                    case 64:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c16053j.f49671a = m17630k(typedArrayObtainStyledAttributes, index2, c16053j.f49671a);
                        i10 = 1;
                        break;
                    case 65:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str6 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c16053j.getClass();
                            i10 = 1;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c16053j.getClass();
                            i10 = 1;
                        }
                        break;
                    case 66:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c16053j.getClass();
                        str = str3;
                        i10 = 1;
                        break;
                    case 67:
                        str4 = str4;
                        c16053j.f49675e = typedArrayObtainStyledAttributes.getFloat(index2, c16053j.f49675e);
                        str = str3;
                        i10 = 1;
                        break;
                    case 68:
                        str4 = str4;
                        c16054k.f49683d = typedArrayObtainStyledAttributes.getFloat(index2, c16054k.f49683d);
                        str = str3;
                        i10 = 1;
                        break;
                    case 69:
                        str4 = str4;
                        c16052i.f49636d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str = str3;
                        i10 = 1;
                        break;
                    case 70:
                        str4 = str4;
                        c16052i.f49638e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str = str3;
                        i10 = 1;
                        break;
                    case 71:
                        str4 = str4;
                        AbstractC15256t.m16465c(str3, str4);
                        str = str3;
                        i10 = 1;
                        break;
                    case 72:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49640f0 = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49640f0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 73:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49642g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49642g0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 74:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49648j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str3;
                        i10 = 1;
                        break;
                    case 75:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49656n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c16052i.f49656n0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 76:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16053j.f49673c = typedArrayObtainStyledAttributes.getInt(index2, c16053j.f49673c);
                        str = str3;
                        i10 = 1;
                        break;
                    case 77:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49650k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str3;
                        i10 = 1;
                        break;
                    case 78:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16054k.f49681b = typedArrayObtainStyledAttributes.getInt(index2, c16054k.f49681b);
                        str = str3;
                        i10 = 1;
                        break;
                    case 79:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16053j.f49674d = typedArrayObtainStyledAttributes.getFloat(index2, c16053j.f49674d);
                        str = str3;
                        i10 = 1;
                        break;
                    case 80:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49652l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c16052i.f49652l0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 81:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49654m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c16052i.f49654m0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 82:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16053j.f49672b = typedArrayObtainStyledAttributes.getInteger(index2, c16053j.f49672b);
                        str = str3;
                        i10 = 1;
                        break;
                    case 83:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16055l.f49692h = m17630k(typedArrayObtainStyledAttributes, index2, c16055l.f49692h);
                        str = str3;
                        i10 = 1;
                        break;
                    case 84:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16053j.f49677g = typedArrayObtainStyledAttributes.getInteger(index2, c16053j.f49677g);
                        str = str3;
                        i10 = 1;
                        break;
                    case 85:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16053j.f49676f = typedArrayObtainStyledAttributes.getFloat(index2, c16053j.f49676f);
                        str = str3;
                        i10 = 1;
                        break;
                    case 86:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        int i19 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i19 == 1) {
                            c16053j.f49679i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i19 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c16053j.f49678h = string2;
                            if (string2.indexOf(Separators.SLASH) > 0) {
                                c16053j.f49679i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c16053j.f49679i);
                        }
                        str = str3;
                        i10 = 1;
                        break;
                    case 87:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        AbstractC15256t.m16482t(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str3;
                        i10 = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str5 = str5;
                        StringBuilder sb3 = new StringBuilder(str5);
                        indexCount2 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        AbstractC15256t.m16482t(str3, sb3.toString());
                        str = str3;
                        i10 = 1;
                        break;
                    case 91:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49660q = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49660q);
                        str = str3;
                        i10 = 1;
                        break;
                    case 92:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49661r = m17630k(typedArrayObtainStyledAttributes, index2, c16052i.f49661r);
                        str = str3;
                        i10 = 1;
                        break;
                    case 93:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49614L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49614L);
                        str = str3;
                        i10 = 1;
                        break;
                    case 94:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49621S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c16052i.f49621S);
                        str = str3;
                        i10 = 1;
                        break;
                    case 95:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        m17631l(c16052i, typedArrayObtainStyledAttributes, index2, 0);
                        str = str3;
                        i10 = 1;
                        break;
                    case 96:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        m17631l(c16052i, typedArrayObtainStyledAttributes, index2, 1);
                        str4 = str4;
                        str = str3;
                        i10 = 1;
                        break;
                    case 97:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c16052i.f49658o0 = typedArrayObtainStyledAttributes.getInt(index2, c16052i.f49658o0);
                        str = str3;
                        i10 = 1;
                        break;
                }
                i17 += i10;
                indexCount2 = indexCount2;
                str5 = str5;
                String str7 = str4;
                i16 = i10;
                str3 = str;
                str4 = str7;
            }
            if (c16052i.f49648j0 != null) {
                c16052i.f49646i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c16051h;
    }

    /* JADX INFO: renamed from: k */
    public static int m17630k(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX INFO: renamed from: l */
    public static void m17631l(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        C16050g c16050g;
        C16052i c16052i;
        C16047d c16047d;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z6 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z6 = false;
                }
                if (obj instanceof C16047d) {
                    c16047d = (C16047d) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) c16047d).width = i13;
                        c16047d.f49525W = z6;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c16047d).height = i13;
                        c16047d.f49526X = z6;
                        return;
                    }
                }
                if (obj instanceof C16052i) {
                    c16052i = (C16052i) obj;
                    if (i11 == 0) {
                        c16052i.f49631b = i13;
                        c16052i.f49652l0 = z6;
                        return;
                    } else {
                        c16052i.f49633c = i13;
                        c16052i.f49654m0 = z6;
                        return;
                    }
                }
                if (obj instanceof C16050g) {
                    c16050g = (C16050g) obj;
                    if (i11 == 0) {
                        c16050g.m17620b(23, i13);
                        c16050g.m17622d(80, z6);
                        return;
                    } else {
                        c16050g.m17620b(21, i13);
                        c16050g.m17622d(81, z6);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z6 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof C16047d) {
                c16047d = (C16047d) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) c16047d).width = i13;
                    c16047d.f49525W = z6;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c16047d).height = i13;
                    c16047d.f49526X = z6;
                    return;
                }
            }
            if (obj instanceof C16052i) {
                c16052i = (C16052i) obj;
                if (i11 == 0) {
                    c16052i.f49631b = i13;
                    c16052i.f49652l0 = z6;
                    return;
                } else {
                    c16052i.f49633c = i13;
                    c16052i.f49654m0 = z6;
                    return;
                }
            }
            if (obj instanceof C16050g) {
                c16050g = (C16050g) obj;
                if (i11 == 0) {
                    c16050g.m17620b(23, i13);
                    c16050g.m17622d(80, z6);
                    return;
                } else {
                    c16050g.m17620b(21, i13);
                    c16050g.m17622d(81, z6);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C16047d) {
                    C16047d c16047d2 = (C16047d) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) c16047d2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c16047d2).height = 0;
                    }
                    m17632m(c16047d2, strTrim2);
                    return;
                }
                if (obj instanceof C16052i) {
                    ((C16052i) obj).f49668y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C16050g) {
                        ((C16050g) obj).m17621c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof C16047d) {
                        C16047d c16047d3 = (C16047d) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) c16047d3).width = 0;
                            c16047d3.f49510H = f10;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c16047d3).height = 0;
                            c16047d3.f49511I = f10;
                        }
                    } else if (obj instanceof C16052i) {
                        C16052i c16052i2 = (C16052i) obj;
                        if (i11 == 0) {
                            c16052i2.f49631b = 0;
                            c16052i2.f49623U = f10;
                        } else {
                            c16052i2.f49633c = 0;
                            c16052i2.f49622T = f10;
                        }
                    } else if (obj instanceof C16050g) {
                        C16050g c16050g2 = (C16050g) obj;
                        if (i11 == 0) {
                            c16050g2.m17620b(23, 0);
                            c16050g2.m17619a(39, f10);
                        } else {
                            c16050g2.m17620b(21, 0);
                            c16050g2.m17619a(40, f10);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C16047d) {
                        C16047d c16047d4 = (C16047d) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) c16047d4).width = 0;
                            c16047d4.f49520R = fMax;
                            c16047d4.f49514L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c16047d4).height = 0;
                            c16047d4.f49521S = fMax;
                            c16047d4.f49515M = 2;
                        }
                    } else if (obj instanceof C16052i) {
                        C16052i c16052i3 = (C16052i) obj;
                        if (i11 == 0) {
                            c16052i3.f49631b = 0;
                            c16052i3.f49636d0 = fMax;
                            c16052i3.f49626X = 2;
                        } else {
                            c16052i3.f49633c = 0;
                            c16052i3.f49638e0 = fMax;
                            c16052i3.f49627Y = 2;
                        }
                    } else if (obj instanceof C16050g) {
                        C16050g c16050g3 = (C16050g) obj;
                        if (i11 == 0) {
                            c16050g3.m17620b(23, 0);
                            c16050g3.m17620b(54, 2);
                        } else {
                            c16050g3.m17620b(21, 0);
                            c16050g3.m17620b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m17632m(C16047d c16047d, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i10 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c16047d.f49509G = str;
    }

    /* JADX INFO: renamed from: o */
    public static String m17633o(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m17634a(ConstraintLayout constraintLayout) {
        m17635b(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: b */
    public final void m17635b(ConstraintLayout constraintLayout) {
        ViewGroup viewGroup;
        int i10;
        HashMap map;
        int i11;
        int i12;
        HashMap map2;
        String resourceEntryName;
        C16056m c16056m = this;
        int i13 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = c16056m.f49703c;
        HashSet<Integer> hashSet = new HashSet(map3.keySet());
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = constraintLayout.getChildAt(i14);
            int id2 = childAt.getId();
            if (!map3.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                AbstractC15256t.m16482t("ConstraintSet", sb2.toString());
            } else {
                if (c16056m.f49702b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map3.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        C16051h c16051h = (C16051h) map3.get(Integer.valueOf(id2));
                        if (c16051h != null) {
                            if (childAt instanceof Barrier) {
                                C16052i c16052i = c16051h.f49599d;
                                c16052i.f49644h0 = i13;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(c16052i.f49640f0);
                                barrier.setMargin(c16052i.f49642g0);
                                barrier.setAllowsGoneWidget(c16052i.f49656n0);
                                int[] iArr = c16052i.f49646i0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = c16052i.f49648j0;
                                    if (str != null) {
                                        int[] iArrM17628f = m17628f(barrier, str);
                                        c16052i.f49646i0 = iArrM17628f;
                                        barrier.setReferencedIds(iArrM17628f);
                                    }
                                }
                            }
                            C16047d c16047d = (C16047d) childAt.getLayoutParams();
                            c16047d.m17617a();
                            c16051h.m17623a(c16047d);
                            HashMap map4 = c16051h.f49601f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map4.keySet()) {
                                C16044a c16044a = (C16044a) map4.get(str2);
                                String strM9889h = !c16044a.f49488a ? AbstractC9306j0.m9889h("set", str2) : str2;
                                HashMap map5 = map4;
                                try {
                                    switch (AbstractC0010F.m24h(c16044a.f49489b)) {
                                        case 0:
                                            i12 = childCount;
                                            map2 = map3;
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                clsArr[0] = Integer.TYPE;
                                                cls.getMethod(strM9889h, clsArr).invoke(childAt, Integer.valueOf(c16044a.f49490c));
                                            } catch (IllegalAccessException e10) {
                                                e = e10;
                                                StringBuilder sbM11058p = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e11) {
                                                e = e11;
                                                AbstractC15256t.m16465c("TransitionLayout", e.getMessage());
                                                AbstractC15256t.m16465c("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", cls.getName() + " must have a method " + strM9889h);
                                            } catch (InvocationTargetException e12) {
                                                e = e12;
                                                StringBuilder sbM11058p2 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p2.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 1:
                                            i12 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strM9889h, Float.TYPE).invoke(childAt, Float.valueOf(c16044a.f49491d));
                                            break;
                                        case 2:
                                            i12 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strM9889h, Integer.TYPE).invoke(childAt, Integer.valueOf(c16044a.f49494g));
                                            break;
                                        case 3:
                                            i12 = childCount;
                                            map2 = map3;
                                            Method method = cls.getMethod(strM9889h, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c16044a.f49494g);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            i12 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strM9889h, CharSequence.class).invoke(childAt, c16044a.f49492e);
                                            break;
                                        case 5:
                                            i12 = childCount;
                                            map2 = map3;
                                            cls.getMethod(strM9889h, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c16044a.f49493f));
                                            break;
                                        case 6:
                                            i12 = childCount;
                                            try {
                                                map2 = map3;
                                                try {
                                                    cls.getMethod(strM9889h, Float.TYPE).invoke(childAt, Float.valueOf(c16044a.f49491d));
                                                } catch (IllegalAccessException e13) {
                                                    e = e13;
                                                    StringBuilder sbM11058p3 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                    sbM11058p3.append(cls.getName());
                                                    AbstractC15256t.m16465c("TransitionLayout", sbM11058p3.toString());
                                                    e.printStackTrace();
                                                } catch (NoSuchMethodException e14) {
                                                    e = e14;
                                                    AbstractC15256t.m16465c("TransitionLayout", e.getMessage());
                                                    AbstractC15256t.m16465c("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                    AbstractC15256t.m16465c("TransitionLayout", cls.getName() + " must have a method " + strM9889h);
                                                } catch (InvocationTargetException e15) {
                                                    e = e15;
                                                    StringBuilder sbM11058p4 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                    sbM11058p4.append(cls.getName());
                                                    AbstractC15256t.m16465c("TransitionLayout", sbM11058p4.toString());
                                                    e.printStackTrace();
                                                }
                                            } catch (IllegalAccessException e16) {
                                                e = e16;
                                                map2 = map3;
                                                StringBuilder sbM11058p5 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p5.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p5.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i12;
                                                map3 = map2;
                                                break;
                                            } catch (NoSuchMethodException e17) {
                                                e = e17;
                                                map2 = map3;
                                                AbstractC15256t.m16465c("TransitionLayout", e.getMessage());
                                                AbstractC15256t.m16465c("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", cls.getName() + " must have a method " + strM9889h);
                                                map4 = map5;
                                                childCount = i12;
                                                map3 = map2;
                                                break;
                                            } catch (InvocationTargetException e18) {
                                                e = e18;
                                                map2 = map3;
                                                StringBuilder sbM11058p6 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p6.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p6.toString());
                                                e.printStackTrace();
                                                map4 = map5;
                                                childCount = i12;
                                                map3 = map2;
                                                break;
                                            }
                                            break;
                                        case 7:
                                            i12 = childCount;
                                            try {
                                                cls.getMethod(strM9889h, Integer.TYPE).invoke(childAt, Integer.valueOf(c16044a.f49490c));
                                                map2 = map3;
                                            } catch (IllegalAccessException e19) {
                                                e = e19;
                                                map2 = map3;
                                                StringBuilder sbM11058p7 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p7.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p7.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e20) {
                                                e = e20;
                                                map2 = map3;
                                                AbstractC15256t.m16465c("TransitionLayout", e.getMessage());
                                                AbstractC15256t.m16465c("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", cls.getName() + " must have a method " + strM9889h);
                                            } catch (InvocationTargetException e21) {
                                                e = e21;
                                                map2 = map3;
                                                StringBuilder sbM11058p8 = AbstractC10763a.m11058p(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM11058p8.append(cls.getName());
                                                AbstractC15256t.m16465c("TransitionLayout", sbM11058p8.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        default:
                                            i12 = childCount;
                                            map2 = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e22) {
                                    e = e22;
                                    i12 = childCount;
                                } catch (NoSuchMethodException e23) {
                                    e = e23;
                                    i12 = childCount;
                                } catch (InvocationTargetException e24) {
                                    e = e24;
                                    i12 = childCount;
                                }
                                map4 = map5;
                                childCount = i12;
                                map3 = map2;
                            }
                            i10 = childCount;
                            map = map3;
                            childAt.setLayoutParams(c16047d);
                            C16054k c16054k = c16051h.f49597b;
                            if (c16054k.f49681b == 0) {
                                childAt.setVisibility(c16054k.f49680a);
                            }
                            childAt.setAlpha(c16054k.f49682c);
                            C16055l c16055l = c16051h.f49600e;
                            childAt.setRotation(c16055l.f49685a);
                            childAt.setRotationX(c16055l.f49686b);
                            childAt.setRotationY(c16055l.f49687c);
                            childAt.setScaleX(c16055l.f49688d);
                            childAt.setScaleY(c16055l.f49689e);
                            if (c16055l.f49692h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c16055l.f49692h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c16055l.f49690f)) {
                                    childAt.setPivotX(c16055l.f49690f);
                                }
                                if (!Float.isNaN(c16055l.f49691g)) {
                                    childAt.setPivotY(c16055l.f49691g);
                                }
                            }
                            childAt.setTranslationX(c16055l.f49693i);
                            childAt.setTranslationY(c16055l.f49694j);
                            childAt.setTranslationZ(c16055l.f49695k);
                            if (c16055l.f49696l) {
                                childAt.setElevation(c16055l.f49697m);
                            }
                        }
                    } else {
                        i10 = childCount;
                        map = map3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                    i11 = 1;
                }
                i14 += i11;
                i13 = i11;
                childCount = i10;
                map3 = map;
                c16056m = this;
            }
            i11 = i13;
            i10 = childCount;
            map = map3;
            i14 += i11;
            i13 = i11;
            childCount = i10;
            map3 = map;
            c16056m = this;
        }
        int i15 = childCount;
        HashMap map6 = map3;
        for (Integer num : hashSet) {
            HashMap map7 = map6;
            C16051h c16051h2 = (C16051h) map7.get(num);
            if (c16051h2 != null) {
                C16052i c16052i2 = c16051h2.f49599d;
                if (c16052i2.f49644h0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = c16052i2.f49646i0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = c16052i2.f49648j0;
                        if (str3 != null) {
                            int[] iArrM17628f2 = m17628f(barrier2, str3);
                            c16052i2.f49646i0 = iArrM17628f2;
                            barrier2.setReferencedIds(iArrM17628f2);
                        }
                    }
                    barrier2.setType(c16052i2.f49640f0);
                    barrier2.setMargin(c16052i2.f49642g0);
                    C16047d c16047dM11361a = ConstraintLayout.m11361a();
                    barrier2.m17616i();
                    c16051h2.m17623a(c16047dM11361a);
                    viewGroup = constraintLayout;
                    viewGroup.addView(barrier2, c16047dM11361a);
                } else {
                    viewGroup = constraintLayout;
                }
                if (c16052i2.f49629a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    C16047d c16047dM11361a2 = ConstraintLayout.m11361a();
                    c16051h2.m17623a(c16047dM11361a2);
                    viewGroup.addView(guideline, c16047dM11361a2);
                }
            }
            map6 = map7;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            View childAt2 = constraintLayout.getChildAt(i16);
            if (childAt2 instanceof AbstractC16045b) {
                ((AbstractC16045b) childAt2).mo17614e(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17636c(ConstraintLayout constraintLayout) {
        C16056m c16056m = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c16056m.f49703c;
        map.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            C16047d c16047d = (C16047d) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c16056m.f49702b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new C16051h());
            }
            C16051h c16051h = (C16051h) map.get(Integer.valueOf(id2));
            if (c16051h != null) {
                HashMap map2 = c16056m.f49701a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C16044a c16044a = (C16044a) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C16044a(c16044a, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C16044a(c16044a, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e10) {
                        e10.printStackTrace();
                    } catch (NoSuchMethodException e11) {
                        e11.printStackTrace();
                    } catch (InvocationTargetException e12) {
                        e12.printStackTrace();
                    }
                }
                c16051h.f49601f = map3;
                c16051h.f49596a = id2;
                int i11 = c16047d.f49537e;
                C16052i c16052i = c16051h.f49599d;
                c16052i.f49643h = i11;
                c16052i.f49645i = c16047d.f49539f;
                c16052i.f49647j = c16047d.f49541g;
                c16052i.f49649k = c16047d.f49543h;
                c16052i.f49651l = c16047d.f49545i;
                c16052i.f49653m = c16047d.f49547j;
                c16052i.f49655n = c16047d.f49549k;
                c16052i.f49657o = c16047d.f49551l;
                c16052i.f49659p = c16047d.f49553m;
                c16052i.f49660q = c16047d.f49555n;
                c16052i.f49661r = c16047d.f49557o;
                c16052i.f49662s = c16047d.f49563s;
                c16052i.f49663t = c16047d.f49564t;
                c16052i.f49664u = c16047d.f49565u;
                c16052i.f49665v = c16047d.f49566v;
                c16052i.f49666w = c16047d.f49507E;
                c16052i.f49667x = c16047d.f49508F;
                c16052i.f49668y = c16047d.f49509G;
                c16052i.f49669z = c16047d.f49559p;
                c16052i.f49603A = c16047d.f49561q;
                c16052i.f49604B = c16047d.f49562r;
                c16052i.f49605C = c16047d.f49522T;
                c16052i.f49606D = c16047d.f49523U;
                c16052i.f49607E = c16047d.f49524V;
                c16052i.f49639f = c16047d.f49533c;
                c16052i.f49635d = c16047d.f49529a;
                c16052i.f49637e = c16047d.f49531b;
                c16052i.f49631b = ((ViewGroup.MarginLayoutParams) c16047d).width;
                c16052i.f49633c = ((ViewGroup.MarginLayoutParams) c16047d).height;
                c16052i.f49608F = ((ViewGroup.MarginLayoutParams) c16047d).leftMargin;
                c16052i.f49609G = ((ViewGroup.MarginLayoutParams) c16047d).rightMargin;
                c16052i.f49610H = ((ViewGroup.MarginLayoutParams) c16047d).topMargin;
                c16052i.f49611I = ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin;
                c16052i.f49614L = c16047d.f49506D;
                c16052i.f49622T = c16047d.f49511I;
                c16052i.f49623U = c16047d.f49510H;
                c16052i.f49625W = c16047d.f49513K;
                c16052i.f49624V = c16047d.f49512J;
                c16052i.f49652l0 = c16047d.f49525W;
                c16052i.f49654m0 = c16047d.f49526X;
                c16052i.f49626X = c16047d.f49514L;
                c16052i.f49627Y = c16047d.f49515M;
                c16052i.f49628Z = c16047d.f49518P;
                c16052i.f49630a0 = c16047d.f49519Q;
                c16052i.f49632b0 = c16047d.f49516N;
                c16052i.f49634c0 = c16047d.f49517O;
                c16052i.f49636d0 = c16047d.f49520R;
                c16052i.f49638e0 = c16047d.f49521S;
                c16052i.f49650k0 = c16047d.f49527Y;
                c16052i.f49616N = c16047d.f49568x;
                c16052i.f49618P = c16047d.f49570z;
                c16052i.f49615M = c16047d.f49567w;
                c16052i.f49617O = c16047d.f49569y;
                c16052i.f49620R = c16047d.f49503A;
                c16052i.f49619Q = c16047d.f49504B;
                c16052i.f49621S = c16047d.f49505C;
                c16052i.f49658o0 = c16047d.f49528Z;
                c16052i.f49612J = c16047d.getMarginEnd();
                c16052i.f49613K = c16047d.getMarginStart();
                int visibility = childAt.getVisibility();
                C16054k c16054k = c16051h.f49597b;
                c16054k.f49680a = visibility;
                c16054k.f49682c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C16055l c16055l = c16051h.f49600e;
                c16055l.f49685a = rotation;
                c16055l.f49686b = childAt.getRotationX();
                c16055l.f49687c = childAt.getRotationY();
                c16055l.f49688d = childAt.getScaleX();
                c16055l.f49689e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c16055l.f49690f = pivotX;
                    c16055l.f49691g = pivotY;
                }
                c16055l.f49693i = childAt.getTranslationX();
                c16055l.f49694j = childAt.getTranslationY();
                c16055l.f49695k = childAt.getTranslationZ();
                if (c16055l.f49696l) {
                    c16055l.f49697m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    c16052i.f49656n0 = barrier.getAllowsGoneWidget();
                    c16052i.f49646i0 = barrier.getReferencedIds();
                    c16052i.f49640f0 = barrier.getType();
                    c16052i.f49642g0 = barrier.getMargin();
                }
            }
            i10++;
            c16056m = this;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17637d(int i10, int i11, int i12, int i13) {
        HashMap map = this.f49703c;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new C16051h());
        }
        C16051h c16051h = (C16051h) map.get(Integer.valueOf(i10));
        if (c16051h == null) {
            return;
        }
        C16052i c16052i = c16051h.f49599d;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    c16052i.f49643h = i12;
                    c16052i.f49645i = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Left to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49645i = i12;
                    c16052i.f49643h = -1;
                }
                c16052i.f49608F = 0;
                return;
            case 2:
                if (i13 == 1) {
                    c16052i.f49647j = i12;
                    c16052i.f49649k = -1;
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49649k = i12;
                    c16052i.f49647j = -1;
                }
                c16052i.f49609G = 0;
                return;
            case 3:
                if (i13 == 3) {
                    c16052i.f49651l = i12;
                    c16052i.f49653m = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49653m = i12;
                    c16052i.f49651l = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                }
                c16052i.f49610H = 0;
                return;
            case 4:
                if (i13 == 4) {
                    c16052i.f49657o = i12;
                    c16052i.f49655n = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                } else {
                    if (i13 != 3) {
                        throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49655n = i12;
                    c16052i.f49657o = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                }
                c16052i.f49611I = 0;
                return;
            case 5:
                if (i13 == 5) {
                    c16052i.f49659p = i12;
                    c16052i.f49657o = -1;
                    c16052i.f49655n = -1;
                    c16052i.f49651l = -1;
                    c16052i.f49653m = -1;
                    return;
                }
                if (i13 == 3) {
                    c16052i.f49660q = i12;
                    c16052i.f49657o = -1;
                    c16052i.f49655n = -1;
                    c16052i.f49651l = -1;
                    c16052i.f49653m = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
                c16052i.f49661r = i12;
                c16052i.f49657o = -1;
                c16052i.f49655n = -1;
                c16052i.f49651l = -1;
                c16052i.f49653m = -1;
                return;
            case 6:
                if (i13 == 6) {
                    c16052i.f49663t = i12;
                    c16052i.f49662s = -1;
                } else {
                    if (i13 != 7) {
                        throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49662s = i12;
                    c16052i.f49663t = -1;
                }
                c16052i.f49613K = 0;
                return;
            case 7:
                if (i13 == 7) {
                    c16052i.f49665v = i12;
                    c16052i.f49664u = -1;
                } else {
                    if (i13 != 6) {
                        throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                    }
                    c16052i.f49664u = i12;
                    c16052i.f49665v = -1;
                }
                c16052i.f49612J = 0;
                return;
            default:
                throw new IllegalArgumentException(m17633o(i11) + " to " + m17633o(i13) + " unknown");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m17638e(int i10, int i11, int i12, int i13) {
        HashMap map = this.f49703c;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new C16051h());
        }
        C16051h c16051h = (C16051h) map.get(Integer.valueOf(i10));
        if (c16051h == null) {
            return;
        }
        C16052i c16052i = c16051h.f49599d;
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    c16052i.f49643h = i12;
                    c16052i.f49645i = -1;
                    return;
                } else if (i13 == 2) {
                    c16052i.f49645i = i12;
                    c16052i.f49643h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m17633o(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    c16052i.f49647j = i12;
                    c16052i.f49649k = -1;
                    return;
                } else if (i13 == 2) {
                    c16052i.f49649k = i12;
                    c16052i.f49647j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    c16052i.f49651l = i12;
                    c16052i.f49653m = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
                c16052i.f49653m = i12;
                c16052i.f49651l = -1;
                c16052i.f49659p = -1;
                c16052i.f49660q = -1;
                c16052i.f49661r = -1;
                return;
            case 4:
                if (i13 == 4) {
                    c16052i.f49657o = i12;
                    c16052i.f49655n = -1;
                    c16052i.f49659p = -1;
                    c16052i.f49660q = -1;
                    c16052i.f49661r = -1;
                    return;
                }
                if (i13 != 3) {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
                c16052i.f49655n = i12;
                c16052i.f49657o = -1;
                c16052i.f49659p = -1;
                c16052i.f49660q = -1;
                c16052i.f49661r = -1;
                return;
            case 5:
                if (i13 == 5) {
                    c16052i.f49659p = i12;
                    c16052i.f49657o = -1;
                    c16052i.f49655n = -1;
                    c16052i.f49651l = -1;
                    c16052i.f49653m = -1;
                    return;
                }
                if (i13 == 3) {
                    c16052i.f49660q = i12;
                    c16052i.f49657o = -1;
                    c16052i.f49655n = -1;
                    c16052i.f49651l = -1;
                    c16052i.f49653m = -1;
                    return;
                }
                if (i13 != 4) {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
                c16052i.f49661r = i12;
                c16052i.f49657o = -1;
                c16052i.f49655n = -1;
                c16052i.f49651l = -1;
                c16052i.f49653m = -1;
                return;
            case 6:
                if (i13 == 6) {
                    c16052i.f49663t = i12;
                    c16052i.f49662s = -1;
                    return;
                } else if (i13 == 7) {
                    c16052i.f49662s = i12;
                    c16052i.f49663t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    c16052i.f49665v = i12;
                    c16052i.f49664u = -1;
                    return;
                } else if (i13 == 6) {
                    c16052i.f49664u = i12;
                    c16052i.f49665v = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m17633o(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m17633o(i11) + " to " + m17633o(i13) + " unknown");
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m17639g(int i10, float[] fArr, int[] iArr) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            m17640i(iArr[0]).f49599d.f49622T = fArr[0];
        }
        m17640i(iArr[0]).f49599d.f49625W = i10;
        m17637d(iArr[0], 3, 0, 3);
        for (int i11 = 1; i11 < iArr.length; i11++) {
            int i12 = i11 - 1;
            m17637d(iArr[i11], 3, iArr[i12], 4);
            m17637d(iArr[i12], 4, iArr[i11], 3);
            if (fArr != null) {
                m17640i(iArr[i11]).f49599d.f49622T = fArr[i11];
            }
        }
        m17637d(iArr[iArr.length - 1], 4, 0, 4);
    }

    /* JADX INFO: renamed from: i */
    public final C16051h m17640i(int i10) {
        HashMap map = this.f49703c;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new C16051h());
        }
        return (C16051h) map.get(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: j */
    public final void m17641j(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C16051h c16051hM17629h = m17629h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c16051hM17629h.f49599d.f49629a = true;
                    }
                    this.f49703c.put(Integer.valueOf(c16051hM17629h.f49596a), c16051hM17629h);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17642n(int i10, float f10) {
        m17640i(i10).f49599d.f49667x = f10;
    }
}
