package androidx.compose.p650ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p650ui.focus.C10863b;
import androidx.compose.p650ui.input.key.AbstractC10865a;
import androidx.compose.p650ui.input.rotary.AbstractC10867a;
import androidx.compose.p650ui.node.Owner;
import androidx.compose.p650ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC11095d;
import androidx.lifecycle.AbstractC11105n;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC11112u;
import io.sentry.android.core.AbstractC15256t;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17308k;
import mm.InterfaceC17300c;
import p001A.AbstractC0010F;
import p001A.C0093v0;
import p001A.RunnableC0000A;
import p003A1.AbstractC0240d0;
import p003A1.C0150A;
import p003A1.C0151A0;
import p003A1.C0159D;
import p003A1.C0160D0;
import p003A1.C0163E0;
import p003A1.C0164E1;
import p003A1.C0170G1;
import p003A1.C0173H1;
import p003A1.C0185L1;
import p003A1.C0190N0;
import p003A1.C0203S;
import p003A1.C0206T;
import p003A1.C0207T0;
import p003A1.C0212V;
import p003A1.C0216W0;
import p003A1.C0219X0;
import p003A1.C0221Y;
import p003A1.C0229a1;
import p003A1.C0236c0;
import p003A1.C0249f1;
import p003A1.C0253h;
import p003A1.C0254h0;
import p003A1.C0256i;
import p003A1.C0271n;
import p003A1.C0274o;
import p003A1.C0275o0;
import p003A1.C0278p0;
import p003A1.C0279p1;
import p003A1.C0280q;
import p003A1.C0283r;
import p003A1.C0286s;
import p003A1.C0292u;
import p003A1.C0295v;
import p003A1.C0298w;
import p003A1.C0302x0;
import p003A1.C0304y;
import p003A1.C0307z;
import p003A1.InterfaceC0157C0;
import p003A1.InterfaceC0161D1;
import p003A1.InterfaceC0182K1;
import p003A1.InterfaceC0300w1;
import p003A1.InterfaceC0303x1;
import p003A1.RunnableC0153B;
import p003A1.ViewOnDragListenerC0204S0;
import p003A1.ViewTreeObserverOnGlobalLayoutListenerC0262k;
import p003A1.ViewTreeObserverOnScrollChangedListenerC0265l;
import p003A1.ViewTreeObserverOnTouchModeChangeListenerC0268m;
import p005A3.C0326m;
import p025An.AbstractC0575H;
import p025An.C0644w;
import p030B2.AbstractC0738T;
import p030B2.AbstractC0739U;
import p030B2.AbstractC0773o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p082D2.AbstractC1857d;
import p1009s9.C19506i;
import p1014t1.C19723A;
import p1014t1.C19740q;
import p1014t1.C19743t;
import p1014t1.InterfaceC19735l;
import p1052v1.C20418a;
import p1062vd.C20567q;
import p1071w0.C20714I0;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21070Y;
import p1095x1.C21054H;
import p1095x1.C21071Z;
import p1117y1.C21364d;
import p1140z1.AbstractC21678Y;
import p1140z1.AbstractC21690f;
import p1140z1.AbstractC21706n;
import p1140z1.C21658D;
import p1140z1.C21660F;
import p1140z1.C21670P;
import p1140z1.C21671Q;
import p1140z1.C21691f0;
import p1140z1.C21703l0;
import p1140z1.C21713r;
import p1140z1.C21715t;
import p1140z1.InterfaceC21687d0;
import p1140z1.InterfaceC21697i0;
import p1140z1.InterfaceC21699j0;
import p131F1.C2635m;
import p156G1.C2957d;
import p156G1.C2969p;
import p183H4.InterfaceC3232g;
import p204I1.C3581L;
import p230J1.AbstractC4179f;
import p310M9.C5311e;
import p328N1.InterfaceC5597m;
import p328N1.InterfaceC5598n;
import p349O0.C5944C;
import p349O0.C5975S;
import p349O0.C5997d;
import p349O0.C6002f0;
import p350O1.C6045C;
import p350O1.C6046D;
import p350O1.C6048F;
import p350O1.C6064m;
import p350O1.C6065n;
import p350O1.C6066o;
import p350O1.C6067p;
import p350O1.C6069r;
import p350O1.C6070s;
import p350O1.C6071t;
import p350O1.InputConnectionC6068q;
import p350O1.InputConnectionC6075x;
import p392Q0.C6546d;
import p468T2.C7218j;
import p492U1.C7536a;
import p492U1.C7539d;
import p492U1.EnumC7546k;
import p492U1.InterfaceC7537b;
import p523V9.AbstractC7841A0;
import p523V9.AbstractC7902H5;
import p523V9.AbstractC8088f6;
import p523V9.AbstractC8104h6;
import p523V9.AbstractC8111i5;
import p544W9.AbstractC8554S3;
import p571X9.AbstractC9101A4;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9306j0;
import p571X9.AbstractC9382v4;
import p571X9.AbstractC9388w4;
import p586Y0.AbstractC9562n;
import p586Y0.C9549a;
import p586Y0.C9555g;
import p586Y0.C9570v;
import p586Y0.C9571w;
import p588Y2.C9642z;
import p604Yk.C10077b;
import p635a1.AbstractC10458p;
import p635a1.C10456n;
import p635a1.C10461s;
import p635a1.C10462t;
import p635a1.InterfaceC10459q;
import p654b1.AbstractC11208b;
import p654b1.C11207a;
import p654b1.C11210d;
import p654b1.C11211e;
import p654b1.C11213g;
import p654b1.C11214h;
import p654b1.C11215i;
import p654b1.EnumC11216j;
import p654b1.InterfaceC11209c;
import p658b5.C11232c;
import p658b5.C11241l;
import p670c1.C11558b;
import p670c1.ViewOnAttachStateChangeListenerC11560d;
import p692d0.C12954G;
import p693d1.InterfaceC12990c;
import p704dc.C13064e;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p737f1.C13514f;
import p737f1.C13526r;
import p737f1.InterfaceC13515g;
import p759g1.C13800b;
import p759g1.C13801c;
import p774h1.AbstractC14334L;
import p774h1.C14328F;
import p774h1.C14336N;
import p774h1.C14347c;
import p774h1.C14350f;
import p774h1.C14363s;
import p774h1.InterfaceC14324B;
import p806ia.nJAW.FpwNpGDhomXHZ;
import p843k1.C16308b;
import p909nm.AbstractC17681o;
import p937p1.C18286b;
import p937p1.InterfaceC18285a;
import p954q1.C18606a;
import p954q1.C18608c;
import p954q1.InterfaceC18607b;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sk.C19662a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m18066d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u0004:\u0003î\u0001\u000bJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R*\u00101\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00107\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010=\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010C\u001a\u00020>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010I\u001a\u00020D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010W\u001a\u00020R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010]\u001a\u00020X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010c\u001a\u00020^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR.\u0010j\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\u00070\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010\u000eR\u001a\u0010p\u001a\u00020k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010v\u001a\u00020q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR)\u0010\u0080\u0001\u001a\u00020w8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bx\u0010y\u0012\u0004\b~\u0010\u007f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R \u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R/\u0010\u008d\u0001\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u0012\u0005\b\u008c\u0001\u0010\u007f\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010\tR5\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0017\n\u0005\b\u008e\u0001\u0010\u001d\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\"\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0090\u0001R \u0010\u009d\u0001\u001a\u00030\u0098\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R \u0010£\u0001\u001a\u00030\u009e\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R'\u0010ª\u0001\u001a\u00030¤\u00018\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\b¥\u0001\u0010¦\u0001\u0012\u0005\b©\u0001\u0010\u007f\u001a\u0006\b§\u0001\u0010¨\u0001R3\u0010±\u0001\u001a\u00030«\u00012\u0007\u0010\u001b\u001a\u00030«\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b¬\u0001\u0010\u001d\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R3\u0010¸\u0001\u001a\u00030²\u00012\u0007\u0010\u001b\u001a\u00030²\u00018V@RX\u0096\u008e\u0002¢\u0006\u0017\n\u0005\b³\u0001\u0010\u001d\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R \u0010¾\u0001\u001a\u00030¹\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001R \u0010Ä\u0001\u001a\u00030¿\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Ê\u0001\u001a\u00030Å\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R \u0010Ð\u0001\u001a\u00030Ë\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001R\u0017\u0010Ó\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\b\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001a\u0010Û\u0001\u001a\u0005\u0018\u00010Ø\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010ß\u0001\u001a\u00030Ü\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010Þ\u0001R\u0017\u0010á\u0001\u001a\u00020\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010\u008a\u0001R\u0016\u0010ã\u0001\u001a\u00020w8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010{R\u0018\u0010ç\u0001\u001a\u00030ä\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ë\u0001\u001a\u00030è\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ê\u0001R\u0016\u0010í\u0001\u001a\u00020w8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bì\u0001\u0010{¨\u0006ï\u0001"}, m18067d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "intervalMillis", "Lmm/C;", "setAccessibilityEventBatchIntervalMillis", "(J)V", "Lkotlin/Function1;", "LA1/n;", "callback", "setOnViewTreeOwnersAvailable", "(LBm/k;)V", "", "accessibilityId", "Landroid/view/View;", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "Lz1/F;", "q0", "Lz1/F;", "getSharedDrawScope", "()Lz1/F;", "sharedDrawScope", "LU1/b;", "<set-?>", "r0", "LO0/X;", "getDensity", "()LU1/b;", "setDensity", "(LU1/b;)V", "density", "Lf1/g;", "s0", "Lf1/g;", "getFocusOwner", "()Lf1/g;", "focusOwner", "Lqm/i;", "value", "t0", "Lqm/i;", "getCoroutineContext", "()Lqm/i;", "setCoroutineContext", "(Lqm/i;)V", "coroutineContext", "Ld1/c;", "u0", "Ld1/c;", "getDragAndDropManager", "()Ld1/c;", "dragAndDropManager", "Lz1/D;", "x0", "Lz1/D;", "getRoot", "()Lz1/D;", "root", "Lz1/j0;", "y0", "Lz1/j0;", "getRootForTest", "()Lz1/j0;", "rootForTest", "LG1/p;", "z0", "LG1/p;", "getSemanticsOwner", "()LG1/p;", "semanticsOwner", "Lc1/d;", "B0", "Lc1/d;", "getContentCaptureManager$ui_release", "()Lc1/d;", "setContentCaptureManager$ui_release", "(Lc1/d;)V", "contentCaptureManager", "LA1/h;", "C0", "LA1/h;", "getAccessibilityManager", "()LA1/h;", "accessibilityManager", "Lh1/B;", "D0", "Lh1/B;", "getGraphicsContext", "()Lh1/B;", "graphicsContext", "Lb1/i;", "E0", "Lb1/i;", "getAutofillTree", "()Lb1/i;", "autofillTree", "Landroid/content/res/Configuration;", "L0", "LBm/k;", "getConfigurationChangeObserver", "()LBm/k;", "setConfigurationChangeObserver", "configurationChangeObserver", "LA1/i;", "O0", "LA1/i;", "getClipboardManager", "()LA1/i;", "clipboardManager", "Lz1/f0;", "P0", "Lz1/f0;", "getSnapshotObserver", "()Lz1/f0;", "snapshotObserver", "", "Q0", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "(Z)V", "getShowLayoutBounds$annotations", "()V", "showLayoutBounds", "LA1/D1;", "W0", "LA1/D1;", "getViewConfiguration", "()LA1/D1;", "viewConfiguration", "c1", "J", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "lastMatrixRecalculationAnimationTime", "g1", "get_viewTreeOwners", "()LA1/n;", "set_viewTreeOwners", "(LA1/n;)V", "_viewTreeOwners", "h1", "LO0/V0;", "getViewTreeOwners", "viewTreeOwners", "LO1/D;", "n1", "LO1/D;", "getTextInputService", "()LO1/D;", "textInputService", "LA1/w1;", "p1", "LA1/w1;", "getSoftwareKeyboardController", "()LA1/w1;", "softwareKeyboardController", "LN1/m;", "q1", "LN1/m;", "getFontLoader", "()LN1/m;", "getFontLoader$annotations", "fontLoader", "LN1/n;", "r1", "getFontFamilyResolver", "()LN1/n;", "setFontFamilyResolver", "(LN1/n;)V", "fontFamilyResolver", "LU1/k;", "t1", "getLayoutDirection", "()LU1/k;", "setLayoutDirection", "(LU1/k;)V", "layoutDirection", "Lp1/a;", "u1", "Lp1/a;", "getHapticFeedBack", "()Lp1/a;", "hapticFeedBack", "Ly1/d;", "w1", "Ly1/d;", "getModifierLocalManager", "()Ly1/d;", "modifierLocalManager", "LA1/x1;", "x1", "LA1/x1;", "getTextToolbar", "()LA1/x1;", "textToolbar", "Lt1/l;", "J1", "Lt1/l;", "getPointerIconService", "()Lt1/l;", "pointerIconService", "getView", "()Landroid/view/View;", "view", "LA1/K1;", "getWindowInfo", "()LA1/K1;", "windowInfo", "Lb1/c;", "getAutofill", "()Lb1/c;", "autofill", "LA1/A0;", "getAndroidViewsHandler$ui_release", "()LA1/A0;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Lx1/W;", "getPlacementScope", "()Lx1/W;", "placementScope", "Lq1/b;", "getInputModeManager", "()Lq1/b;", "inputModeManager", "getScrollCaptureInProgress$ui_release", "scrollCaptureInProgress", "A1/X0", "ui_release"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class AndroidComposeView extends ViewGroup implements Owner, InterfaceC21699j0, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: K1 */
    public static Class f32748K1;

    /* JADX INFO: renamed from: L1 */
    public static Method f32749L1;

    /* JADX INFO: renamed from: A0 */
    public final C0203S f32750A0;

    /* JADX INFO: renamed from: A1 */
    public final C11232c f32751A1;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    public ViewOnAttachStateChangeListenerC11560d contentCaptureManager;

    /* JADX INFO: renamed from: B1 */
    public final C6546d f32753B1;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public final C0253h accessibilityManager;

    /* JADX INFO: renamed from: C1 */
    public final RunnableC0153B f32755C1;

    /* JADX INFO: renamed from: D0 */
    public final C14350f f32756D0;

    /* JADX INFO: renamed from: D1 */
    public final RunnableC0000A f32757D1;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    public final C11215i autofillTree;

    /* JADX INFO: renamed from: E1 */
    public boolean f32759E1;

    /* JADX INFO: renamed from: F0 */
    public final ArrayList f32760F0;

    /* JADX INFO: renamed from: F1 */
    public final C0150A f32761F1;

    /* JADX INFO: renamed from: G0 */
    public ArrayList f32762G0;

    /* JADX INFO: renamed from: G1 */
    public final InterfaceC0157C0 f32763G1;

    /* JADX INFO: renamed from: H0 */
    public boolean f32764H0;

    /* JADX INFO: renamed from: H1 */
    public boolean f32765H1;

    /* JADX INFO: renamed from: I0 */
    public boolean f32766I0;

    /* JADX INFO: renamed from: I1 */
    public final C2635m f32767I1;

    /* JADX INFO: renamed from: J0 */
    public final C13064e f32768J0;

    /* JADX INFO: renamed from: J1 */
    public final C0304y f32769J1;

    /* JADX INFO: renamed from: K0 */
    public final C0326m f32770K0;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public InterfaceC1436k configurationChangeObserver;

    /* JADX INFO: renamed from: M0 */
    public final C11207a f32772M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f32773N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public final C0256i clipboardManager;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public final C21691f0 snapshotObserver;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public boolean showLayoutBounds;

    /* JADX INFO: renamed from: R0 */
    public C0151A0 f32777R0;

    /* JADX INFO: renamed from: S0 */
    public C0207T0 f32778S0;

    /* JADX INFO: renamed from: T0 */
    public C7536a f32779T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f32780U0;

    /* JADX INFO: renamed from: V0 */
    public final C21671Q f32781V0;

    /* JADX INFO: renamed from: W0 */
    public final C0302x0 f32782W0;

    /* JADX INFO: renamed from: X0 */
    public long f32783X0;

    /* JADX INFO: renamed from: Y0 */
    public final int[] f32784Y0;

    /* JADX INFO: renamed from: Z0 */
    public final float[] f32785Z0;

    /* JADX INFO: renamed from: a1 */
    public final float[] f32786a1;

    /* JADX INFO: renamed from: b1 */
    public final float[] f32787b1;

    /* JADX INFO: renamed from: c1, reason: from kotlin metadata */
    public long lastMatrixRecalculationAnimationTime;

    /* JADX INFO: renamed from: d1 */
    public boolean f32789d1;

    /* JADX INFO: renamed from: e1 */
    public long f32790e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f32791f1;

    /* JADX INFO: renamed from: g1 */
    public final C6002f0 f32792g1;

    /* JADX INFO: renamed from: h1 */
    public final C5944C f32793h1;

    /* JADX INFO: renamed from: i1 */
    public InterfaceC1436k f32794i1;

    /* JADX INFO: renamed from: j1 */
    public final ViewTreeObserverOnGlobalLayoutListenerC0262k f32795j1;

    /* JADX INFO: renamed from: k1 */
    public final ViewTreeObserverOnScrollChangedListenerC0265l f32796k1;

    /* JADX INFO: renamed from: l1 */
    public final ViewTreeObserverOnTouchModeChangeListenerC0268m f32797l1;

    /* JADX INFO: renamed from: m1 */
    public final C6048F f32798m1;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    public final C6046D textInputService;

    /* JADX INFO: renamed from: o0 */
    public long f32800o0;

    /* JADX INFO: renamed from: o1 */
    public final AtomicReference f32801o1;

    /* JADX INFO: renamed from: p0 */
    public final boolean f32802p0;

    /* JADX INFO: renamed from: p1 */
    public final C0190N0 f32803p1;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    public final C21660F sharedDrawScope;

    /* JADX INFO: renamed from: q1 */
    public final C0219X0 f32805q1;

    /* JADX INFO: renamed from: r0 */
    public final C6002f0 f32806r0;

    /* JADX INFO: renamed from: r1 */
    public final C6002f0 f32807r1;

    /* JADX INFO: renamed from: s0 */
    public final C10863b f32808s0;

    /* JADX INFO: renamed from: s1 */
    public int f32809s1;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    public InterfaceC18776i coroutineContext;

    /* JADX INFO: renamed from: t1 */
    public final C6002f0 f32811t1;

    /* JADX INFO: renamed from: u0 */
    public final ViewOnDragListenerC0204S0 f32812u0;

    /* JADX INFO: renamed from: u1 */
    public final C18286b f32813u1;

    /* JADX INFO: renamed from: v0 */
    public final C0185L1 f32814v0;

    /* JADX INFO: renamed from: v1 */
    public final C18608c f32815v1;

    /* JADX INFO: renamed from: w0 */
    public final C14363s f32816w0;

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    public final C21364d modifierLocalManager;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    public final C21658D root;

    /* JADX INFO: renamed from: x1 */
    public final C0278p0 f32819x1;

    /* JADX INFO: renamed from: y0 */
    public final AndroidComposeView f32820y0;

    /* JADX INFO: renamed from: y1 */
    public MotionEvent f32821y1;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    public final C2969p semanticsOwner;

    /* JADX INFO: renamed from: z1 */
    public long f32823z1;

    /* JADX INFO: renamed from: a */
    public static final void m11320a(AndroidComposeView androidComposeView, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM14681e;
        C0203S c0203s = androidComposeView.f32750A0;
        if (AbstractC16544l.m18089b(str, c0203s.f756E)) {
            int iM14681e2 = c0203s.f754C.m14681e(i10);
            if (iM14681e2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM14681e2);
                return;
            }
            return;
        }
        if (!AbstractC16544l.m18089b(str, c0203s.f757F) || (iM14681e = c0203s.f755D.m14681e(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM14681e);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m11323d(AndroidComposeView androidComposeView, C13510b c13510b, C13801c c13801c) {
        Integer numM15037J;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((c13510b == null || (numM15037J = AbstractC13512d.m15037J(c13510b.f42774a)) == null) ? 130 : numM15037J.intValue(), c13801c != null ? AbstractC14334L.m15615D(c13801c) : null);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11324f() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: g */
    public static void m11325g(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).m11348v();
            } else if (childAt instanceof ViewGroup) {
                m11325g((ViewGroup) childAt);
            }
        }
    }

    @InterfaceC17300c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0271n get_viewTreeOwners() {
        return (C0271n) this.f32792g1.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static long m11326h(int i10) {
        long j10;
        long j11;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                j10 = ((long) 0) << 32;
                size = Integer.MAX_VALUE;
            } else {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j11 = size;
                j10 = j11 << 32;
            }
            return j10 | j11;
        }
        j10 = ((long) 0) << 32;
        j11 = size;
        return j10 | j11;
    }

    /* JADX INFO: renamed from: j */
    public static View m11327j(View view, int i10) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC16544l.m18089b(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewM11327j = m11327j(viewGroup.getChildAt(i11), i10);
                    if (viewM11327j != null) {
                        return viewM11327j;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m11328l(C21658D c21658d) {
        c21658d.m22018P();
        C6546d c6546dM22014L = c21658d.m22014L();
        int i10 = c6546dM22014L.f21184o0;
        if (i10 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            int i11 = 0;
            do {
                m11328l((C21658D) objArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    /* JADX INFO: renamed from: o */
    public static boolean m11329o(MotionEvent motionEvent) {
        boolean z6;
        float x4 = motionEvent.getX();
        if (Float.isInfinite(x4) || Float.isNaN(x4)) {
            z6 = true;
        } else {
            float y8 = motionEvent.getY();
            if (Float.isInfinite(y8) || Float.isNaN(y8)) {
                z6 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z6 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
            }
        }
        if (!z6) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                float x10 = motionEvent.getX(i10);
                if (Float.isInfinite(x10) || Float.isNaN(x10)) {
                    z6 = true;
                } else {
                    float y9 = motionEvent.getY(i10);
                    if (Float.isInfinite(y9) || Float.isNaN(y9) || (Build.VERSION.SDK_INT >= 29 && !C0249f1.f941a.m818a(motionEvent, i10))) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                if (z6) {
                    break;
                }
            }
        }
        return z6;
    }

    private void setDensity(InterfaceC7537b interfaceC7537b) {
        this.f32806r0.setValue(interfaceC7537b);
    }

    private void setFontFamilyResolver(InterfaceC5598n interfaceC5598n) {
        this.f32807r1.setValue(interfaceC5598n);
    }

    private void setLayoutDirection(EnumC7546k enumC7546k) {
        this.f32811t1.setValue(enumC7546k);
    }

    private final void set_viewTreeOwners(C0271n c0271n) {
        this.f32792g1.setValue(c0271n);
    }

    /* JADX INFO: renamed from: A */
    public final void m11330A() {
        C0203S c0203s = this.f32750A0;
        c0203s.f786y = true;
        if (c0203s.m649y() && !c0203s.f761J) {
            c0203s.f761J = true;
            c0203s.f773l.post(c0203s.f762K);
        }
        ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11560d.f34948t0 = true;
        if (!viewOnAttachStateChangeListenerC11560d.m12957c() || viewOnAttachStateChangeListenerC11560d.f34939B0) {
            return;
        }
        viewOnAttachStateChangeListenerC11560d.f34939B0 = true;
        viewOnAttachStateChangeListenerC11560d.f34951w0.post(viewOnAttachStateChangeListenerC11560d.f34940C0);
    }

    /* JADX INFO: renamed from: B */
    public final void m11331B() {
        if (this.f32789d1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            InterfaceC0157C0 interfaceC0157C0 = this.f32763G1;
            float[] fArr = this.f32786a1;
            interfaceC0157C0.mo496a(this, fArr);
            AbstractC0240d0.m798i(fArr, this.f32787b1);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f32784Y0;
            view.getLocationOnScreen(iArr);
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f32790e1 = AbstractC8088f6.m8536b(f10 - iArr[0], f11 - iArr[1]);
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m11332C(InterfaceC21687d0 interfaceC21687d0) {
        C11232c c11232c;
        Reference referencePoll;
        C6546d c6546d;
        if (this.f32778S0 != null) {
            C0164E1 c0164e1 = C0170G1.f650D0;
        }
        do {
            c11232c = this.f32751A1;
            referencePoll = ((ReferenceQueue) c11232c.f33997Z).poll();
            c6546d = (C6546d) c11232c.f33996Y;
            if (referencePoll != null) {
                c6546d.m7110o(referencePoll);
            }
        } while (referencePoll != null);
        c6546d.m7099c(new WeakReference(interfaceC21687d0, (ReferenceQueue) c11232c.f33997Z));
    }

    /* JADX INFO: renamed from: D */
    public final void m11333D(C21658D c21658d) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c21658d != null) {
            while (c21658d != null && c21658d.m22005C() == 1) {
                if (!this.f32780U0) {
                    C21658D c21658dM22009G = c21658d.m22009G();
                    if (c21658dM22009G == null) {
                        break;
                    }
                    long j10 = ((C21715t) c21658dM22009G.f68638I0.f3468c).f66984p0;
                    if (C7536a.m7852g(j10) && C7536a.m7851f(j10)) {
                        break;
                    }
                }
                c21658d = c21658d.m22009G();
            }
            if (c21658d == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: F */
    public final long m11334F(long j10) {
        m11331B();
        float fM15306g = C13800b.m15306g(j10) - C13800b.m15306g(this.f32790e1);
        float fM15307h = C13800b.m15307h(j10) - C13800b.m15307h(this.f32790e1);
        return C14328F.m15603b(AbstractC8088f6.m8536b(fM15306g, fM15307h), this.f32787b1);
    }

    /* JADX INFO: renamed from: G */
    public final int m11335G(MotionEvent motionEvent) {
        Object obj;
        int iM961u = 0;
        if (this.f32765H1) {
            this.f32765H1 = false;
            int metaState = motionEvent.getMetaState();
            this.f32814v0.getClass();
            C0185L1.f691b.setValue(new C19743t(metaState));
        }
        C13064e c13064e = this.f32768J0;
        C19662a c19662aM14800a = c13064e.m14800a(motionEvent, this);
        C0326m c0326m = this.f32770K0;
        if (c19662aM14800a != null) {
            ArrayList arrayList = (ArrayList) c19662aM14800a.f62320Y;
            int size = arrayList.size() - 1;
            if (size < 0) {
                obj = null;
                break;
            }
            while (true) {
                int i10 = size - 1;
                obj = arrayList.get(size);
                if (((C19740q) obj).f62498e) {
                    break;
                }
                if (i10 < 0) {
                    obj = null;
                    break;
                }
                size = i10;
            }
            C19740q c19740q = (C19740q) obj;
            if (c19740q != null) {
                this.f32800o0 = c19740q.f62497d;
            }
            iM961u = c0326m.m961u(c19662aM14800a, this, m11342p(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (iM961u & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                ((SparseBooleanArray) c13064e.f41497q0).delete(pointerId);
                ((SparseLongArray) c13064e.f41496p0).delete(pointerId);
            }
        } else {
            c0326m.m962v();
        }
        return iM961u;
    }

    /* JADX INFO: renamed from: H */
    public final void m11336H(MotionEvent motionEvent, int i10, long j10, boolean z6) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            long jM11344r = m11344r(AbstractC8088f6.m8536b(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C13800b.m15306g(jM11344r);
            pointerCoords.y = C13800b.m15307h(jM11344r);
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z6 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C19662a c19662aM14800a = this.f32768J0.m14800a(motionEventObtain, this);
        AbstractC16544l.m18091d(c19662aM14800a);
        this.f32770K0.m961u(c19662aM14800a, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: I */
    public final void m11337I(InterfaceC1439n interfaceC1439n, AbstractC19687c abstractC19687c) {
        C0159D c0159d;
        if (abstractC19687c instanceof C0159D) {
            c0159d = (C0159D) abstractC19687c;
            int i10 = c0159d.f640o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0159d.f640o0 = i10 - Integer.MIN_VALUE;
            } else {
                c0159d = new C0159D(this, abstractC19687c);
            }
        } else {
            c0159d = new C0159D(this, abstractC19687c);
        }
        Object obj = c0159d.f638Y;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c0159d.f640o0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            AtomicReference atomicReference = this.f32801o1;
            C0274o c0274o = new C0274o(this, 3);
            c0159d.f640o0 = 1;
            if (AbstractC0575H.m1183l(new C10462t(c0274o, atomicReference, interfaceC1439n, null), c0159d) == enumC19250a) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        throw new C0644w();
    }

    /* JADX INFO: renamed from: J */
    public final void m11338J() {
        int[] iArr = this.f32784Y0;
        getLocationOnScreen(iArr);
        long j10 = this.f32783X0;
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        boolean z6 = false;
        int i12 = iArr[0];
        if (i10 != i12 || i11 != iArr[1]) {
            this.f32783X0 = AbstractC9101A4.m9631a(i12, iArr[1]);
            if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
                getRoot().m22060t().f68746r.m22101h0();
                z6 = true;
            }
        }
        this.f32781V0.m22136a(z6);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C11207a c11207a;
        InterfaceC1436k interfaceC1436k;
        if (!m11324f() || (c11207a = this.f32772M0) == null) {
            return;
        }
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueM4810f = AbstractC4179f.m4810f(sparseArray.get(iKeyAt));
            C11211e c11211e = C11211e.f33885a;
            if (c11211e.m12401d(autofillValueM4810f)) {
                String string = c11211e.m12406i(autofillValueM4810f).toString();
                C11214h c11214h = (C11214h) c11207a.f33881b.f33893a.get(Integer.valueOf(iKeyAt));
                if (c11214h != null && (interfaceC1436k = c11214h.f33891c) != null) {
                    interfaceC1436k.invoke(string);
                }
            } else {
                if (c11211e.m12399b(autofillValueM4810f)) {
                    throw new C17308k("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (c11211e.m12400c(autofillValueM4810f)) {
                    throw new C17308k("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (c11211e.m12402e(autofillValueM4810f)) {
                    throw new C17308k("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f32750A0.m640m(i10, this.f32800o0, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f32750A0.m640m(i10, this.f32800o0, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z6;
        if (!isAttachedToWindow()) {
            m11328l(getRoot());
        }
        m11345s(true);
        synchronized (AbstractC9562n.f28759b) {
            C12954G c12954g = ((C9549a) AbstractC9562n.f28766i.get()).f28725h;
            z6 = c12954g != null && c12954g.m14631h();
        }
        if (z6) {
            AbstractC9562n.m10077a();
        }
        this.f32764H0 = true;
        C14363s c14363s = this.f32816w0;
        C14347c c14347c = c14363s.f45050a;
        Canvas canvas2 = c14347c.f45028a;
        c14347c.f45028a = canvas;
        getRoot().m22045k(c14347c, null);
        c14363s.f45050a.f45028a = canvas2;
        if (!this.f32760F0.isEmpty()) {
            int size = this.f32760F0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC21687d0) this.f32760F0.get(i10)).mo548k();
            }
        }
        if (C0170G1.f654H0) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f32760F0.clear();
        this.f32764H0 = false;
        ArrayList arrayList = this.f32762G0;
        if (arrayList != null) {
            this.f32760F0.addAll(arrayList);
            arrayList.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C20418a c20418a;
        int size;
        C1313k c1313k;
        AbstractC10458p abstractC10458pM22201f;
        C1313k c1313k2;
        if (this.f32759E1) {
            RunnableC0000A runnableC0000A = this.f32757D1;
            removeCallbacks(runnableC0000A);
            if (motionEvent.getActionMasked() == 8) {
                this.f32759E1 = false;
            } else {
                runnableC0000A.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (m11329o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (m11340k(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = AbstractC0739U.f2102a;
            AbstractC0773o.m1722f(viewConfiguration);
        } else {
            AbstractC0739U.m1587a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i10 >= 26) {
            AbstractC0773o.m1721e(viewConfiguration);
        } else {
            AbstractC0739U.m1587a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        C10863b c10863b = (C10863b) getFocusOwner();
        if (c10863b.f32699g.m15066a()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.");
        }
        C13526r c13526rM15046g = AbstractC13512d.m15046g(c10863b.f32698f);
        if (c13526rM15046g != null) {
            AbstractC10458p abstractC10458p = c13526rM15046g.f30960Y;
            if (!abstractC10458p.f30972y0) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526rM15046g);
            loop0: while (true) {
                if (c21658dM22217v == null) {
                    abstractC10458pM22201f = null;
                    break;
                }
                if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 16384) != 0) {
                    while (abstractC10458p != null) {
                        if ((abstractC10458p.f30962o0 & 16384) != 0) {
                            C6546d c6546d = null;
                            abstractC10458pM22201f = abstractC10458p;
                            while (abstractC10458pM22201f != null) {
                                if (abstractC10458pM22201f instanceof C20418a) {
                                    break loop0;
                                }
                                if ((abstractC10458pM22201f.f30962o0 & 16384) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                    int i11 = 0;
                                    for (AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                                        if ((abstractC10458p2.f30962o0 & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC10458pM22201f = abstractC10458p2;
                                            } else {
                                                if (c6546d == null) {
                                                    c6546d = new C6546d(new AbstractC10458p[16]);
                                                }
                                                if (abstractC10458pM22201f != null) {
                                                    c6546d.m7099c(abstractC10458pM22201f);
                                                    abstractC10458pM22201f = null;
                                                }
                                                c6546d.m7099c(abstractC10458p2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                            }
                        }
                        abstractC10458p = abstractC10458p.f30964q0;
                    }
                }
                c21658dM22217v = c21658dM22217v.m22009G();
                abstractC10458p = (c21658dM22217v == null || (c1313k2 = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k2.f3470e;
            }
            c20418a = (C20418a) abstractC10458pM22201f;
        } else {
            c20418a = null;
        }
        if (c20418a == null) {
            return false;
        }
        C20418a c20418a2 = c20418a;
        AbstractC10458p abstractC10458p3 = c20418a2.f30960Y;
        if (!abstractC10458p3.f30972y0) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        AbstractC10458p abstractC10458p4 = abstractC10458p3.f30964q0;
        C21658D c21658dM22217v2 = AbstractC21690f.m22217v(c20418a);
        ArrayList arrayList = null;
        while (c21658dM22217v2 != null) {
            if ((((AbstractC10458p) c21658dM22217v2.f68638I0.f3471f).f30963p0 & 16384) != 0) {
                while (abstractC10458p4 != null) {
                    if ((abstractC10458p4.f30962o0 & 16384) != 0) {
                        AbstractC10458p abstractC10458pM22201f2 = abstractC10458p4;
                        C6546d c6546d2 = null;
                        while (abstractC10458pM22201f2 != null) {
                            if (abstractC10458pM22201f2 instanceof C20418a) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(abstractC10458pM22201f2);
                            } else if ((abstractC10458pM22201f2.f30962o0 & 16384) != 0 && (abstractC10458pM22201f2 instanceof AbstractC21706n)) {
                                int i12 = 0;
                                for (AbstractC10458p abstractC10458p5 = ((AbstractC21706n) abstractC10458pM22201f2).f68881A0; abstractC10458p5 != null; abstractC10458p5 = abstractC10458p5.f30965r0) {
                                    if ((abstractC10458p5.f30962o0 & 16384) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC10458pM22201f2 = abstractC10458p5;
                                        } else {
                                            if (c6546d2 == null) {
                                                c6546d2 = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (abstractC10458pM22201f2 != null) {
                                                c6546d2.m7099c(abstractC10458pM22201f2);
                                                abstractC10458pM22201f2 = null;
                                            }
                                            c6546d2.m7099c(abstractC10458p5);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC10458pM22201f2 = AbstractC21690f.m22201f(c6546d2);
                        }
                    }
                    abstractC10458p4 = abstractC10458p4.f30964q0;
                }
            }
            c21658dM22217v2 = c21658dM22217v2.m22009G();
            abstractC10458p4 = (c21658dM22217v2 == null || (c1313k = c21658dM22217v2.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
        }
        if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
            while (true) {
                int i13 = size - 1;
                ((C20418a) arrayList.get(size)).getClass();
                if (i13 < 0) {
                    break;
                }
                size = i13;
            }
        }
        AbstractC10458p abstractC10458pM22201f3 = c20418a2.f30960Y;
        C6546d c6546d3 = null;
        while (abstractC10458pM22201f3 != null) {
            if (abstractC10458pM22201f3 instanceof C20418a) {
            } else if ((abstractC10458pM22201f3.f30962o0 & 16384) != 0 && (abstractC10458pM22201f3 instanceof AbstractC21706n)) {
                int i14 = 0;
                for (AbstractC10458p abstractC10458p6 = ((AbstractC21706n) abstractC10458pM22201f3).f68881A0; abstractC10458p6 != null; abstractC10458p6 = abstractC10458p6.f30965r0) {
                    if ((abstractC10458p6.f30962o0 & 16384) != 0) {
                        i14++;
                        if (i14 == 1) {
                            abstractC10458pM22201f3 = abstractC10458p6;
                        } else {
                            if (c6546d3 == null) {
                                c6546d3 = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22201f3 != null) {
                                c6546d3.m7099c(abstractC10458pM22201f3);
                                abstractC10458pM22201f3 = null;
                            }
                            c6546d3.m7099c(abstractC10458p6);
                        }
                    }
                }
                if (i14 == 1) {
                }
            }
            abstractC10458pM22201f3 = AbstractC21690f.m22201f(c6546d3);
        }
        AbstractC10458p abstractC10458pM22201f4 = c20418a2.f30960Y;
        C6546d c6546d4 = null;
        while (abstractC10458pM22201f4 != null) {
            if (abstractC10458pM22201f4 instanceof C20418a) {
            } else if ((abstractC10458pM22201f4.f30962o0 & 16384) != 0 && (abstractC10458pM22201f4 instanceof AbstractC21706n)) {
                int i15 = 0;
                for (AbstractC10458p abstractC10458p7 = ((AbstractC21706n) abstractC10458pM22201f4).f68881A0; abstractC10458p7 != null; abstractC10458p7 = abstractC10458p7.f30965r0) {
                    if ((abstractC10458p7.f30962o0 & 16384) != 0) {
                        i15++;
                        if (i15 == 1) {
                            abstractC10458pM22201f4 = abstractC10458p7;
                        } else {
                            if (c6546d4 == null) {
                                c6546d4 = new C6546d(new AbstractC10458p[16]);
                            }
                            if (abstractC10458pM22201f4 != null) {
                                c6546d4.m7099c(abstractC10458pM22201f4);
                                abstractC10458pM22201f4 = null;
                            }
                            c6546d4.m7099c(abstractC10458p7);
                        }
                    }
                }
                if (i15 == 1) {
                }
            }
            abstractC10458pM22201f4 = AbstractC21690f.m22201f(c6546d4);
        }
        if (arrayList == null) {
            return false;
        }
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            C0280q c0280q = ((C20418a) arrayList.get(i16)).f64540z0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i10;
        boolean z6 = this.f32759E1;
        RunnableC0000A runnableC0000A = this.f32757D1;
        if (z6) {
            removeCallbacks(runnableC0000A);
            runnableC0000A.run();
        }
        if (m11329o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        C0203S c0203s = this.f32750A0;
        AccessibilityManager accessibilityManager = c0203s.f768g;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            AndroidComposeView androidComposeView = c0203s.f765d;
            if (action == 7 || action == 9) {
                float x4 = motionEvent.getX();
                float y8 = motionEvent.getY();
                androidComposeView.m11345s(true);
                C21713r c21713r = new C21713r();
                C21658D root = androidComposeView.getRoot();
                long jM8536b = AbstractC8088f6.m8536b(x4, y8);
                C1313k c1313k = root.f68638I0;
                AbstractC21678Y abstractC21678Y = (AbstractC21678Y) c1313k.f3469d;
                C14336N c14336n = AbstractC21678Y.f68797R0;
                ((AbstractC21678Y) c1313k.f3469d).m22163N0(AbstractC21678Y.f68801V0, abstractC21678Y.m22156G0(jM8536b, true), c21713r, true, true);
                int iM19381j = AbstractC17681o.m19381j(c21713r);
                while (true) {
                    if (-1 < iM19381j) {
                        Object obj = c21713r.f68886Y[iM19381j];
                        AbstractC16544l.m18092e(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        C21658D c21658dM22217v = AbstractC21690f.m22217v((AbstractC10458p) obj);
                        if (androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(c21658dM22217v) == null) {
                            if (c21658dM22217v.f68638I0.m2020g(8)) {
                                int iM624E = c0203s.m624E(c21658dM22217v.f68651Z);
                                if (AbstractC0240d0.m799j(AbstractC7902H5.m8197b(c21658dM22217v, false))) {
                                    i10 = iM624E;
                                    break;
                                }
                            }
                            iM19381j--;
                        }
                    }
                    i10 = Integer.MIN_VALUE;
                    break;
                }
                androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                int i11 = c0203s.f766e;
                if (i11 != i10) {
                    c0203s.f766e = i10;
                    C0203S.m618I(c0203s, i10, 128, null, 12);
                    C0203S.m618I(c0203s, i11, 256, null, 12);
                }
            } else if (action == 10) {
                int i12 = c0203s.f766e;
                if (i12 == Integer.MIN_VALUE) {
                    androidComposeView.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                } else if (i12 != Integer.MIN_VALUE) {
                    c0203s.f766e = Integer.MIN_VALUE;
                    C0203S.m618I(c0203s, Integer.MIN_VALUE, 128, null, 12);
                    C0203S.m618I(c0203s, i12, 256, null, 12);
                }
            }
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && m11342p(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f32821y1;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f32821y1 = MotionEvent.obtainNoHistory(motionEvent);
                this.f32759E1 = true;
                postDelayed(runnableC0000A, 8L);
                return false;
            }
        } else if (!m11343q(motionEvent)) {
            return false;
        }
        return (m11340k(motionEvent) & 1) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C10863b) getFocusOwner()).m11302b(keyEvent, new C0286s(this, 0, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f32814v0.getClass();
        C0185L1.f691b.setValue(new C19743t(metaState));
        return ((C10863b) getFocusOwner()).m11302b(keyEvent, C13514f.f42782Z) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C1313k c1313k;
        if (isFocused()) {
            C10863b c10863b = (C10863b) getFocusOwner();
            if (c10863b.f32699g.m15066a()) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C13526r c13526rM15046g = AbstractC13512d.m15046g(c10863b.f32698f);
                if (c13526rM15046g != null) {
                    AbstractC10458p abstractC10458p = c13526rM15046g.f30960Y;
                    if (!abstractC10458p.f30972y0) {
                        throw new IllegalStateException("visitAncestors called on an unattached node");
                    }
                    C21658D c21658dM22217v = AbstractC21690f.m22217v(c13526rM15046g);
                    while (c21658dM22217v != null) {
                        if ((((AbstractC10458p) c21658dM22217v.f68638I0.f3471f).f30963p0 & 131072) != 0) {
                            while (abstractC10458p != null) {
                                if ((abstractC10458p.f30962o0 & 131072) != 0) {
                                    AbstractC10458p abstractC10458pM22201f = abstractC10458p;
                                    C6546d c6546d = null;
                                    while (abstractC10458pM22201f != null) {
                                        if ((abstractC10458pM22201f.f30962o0 & 131072) != 0 && (abstractC10458pM22201f instanceof AbstractC21706n)) {
                                            int i10 = 0;
                                            for (AbstractC10458p abstractC10458p2 = ((AbstractC21706n) abstractC10458pM22201f).f68881A0; abstractC10458p2 != null; abstractC10458p2 = abstractC10458p2.f30965r0) {
                                                if ((abstractC10458p2.f30962o0 & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        abstractC10458pM22201f = abstractC10458p2;
                                                    } else {
                                                        if (c6546d == null) {
                                                            c6546d = new C6546d(new AbstractC10458p[16]);
                                                        }
                                                        if (abstractC10458pM22201f != null) {
                                                            c6546d.m7099c(abstractC10458pM22201f);
                                                            abstractC10458pM22201f = null;
                                                        }
                                                        c6546d.m7099c(abstractC10458p2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        abstractC10458pM22201f = AbstractC21690f.m22201f(c6546d);
                                    }
                                }
                                abstractC10458p = abstractC10458p.f30964q0;
                            }
                        }
                        c21658dM22217v = c21658dM22217v.m22009G();
                        abstractC10458p = (c21658dM22217v == null || (c1313k = c21658dM22217v.f68638I0) == null) ? null : (C21703l0) c1313k.f3470e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C0206T.f793a.m651a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f32759E1) {
            RunnableC0000A runnableC0000A = this.f32757D1;
            removeCallbacks(runnableC0000A);
            MotionEvent motionEvent2 = this.f32821y1;
            AbstractC16544l.m18091d(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f32759E1 = false;
            } else {
                runnableC0000A.run();
            }
        }
        if (m11329o(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !m11343q(motionEvent)) {
            return false;
        }
        int iM11340k = m11340k(motionEvent);
        if ((iM11340k & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iM11340k & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int accessibilityId) throws IllegalAccessException, InvocationTargetException {
        View viewM11327j = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (objInvoke instanceof View) {
                    viewM11327j = (View) objInvoke;
                }
            } else {
                viewM11327j = m11327j(this, accessibilityId);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewM11327j;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        if (view != null) {
            C13801c c13801cM15043d = AbstractC13512d.m15043d(view);
            C13510b c13510bM15038K = AbstractC13512d.m15038K(i10);
            if (AbstractC16544l.m18089b(((C10863b) getFocusOwner()).m11303c(c13510bM15038K != null ? c13510bM15038K.f42774a : 6, c13801cM15043d, C0280q.f1025o0), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i10);
    }

    public final C0151A0 getAndroidViewsHandler$ui_release() {
        if (this.f32777R0 == null) {
            C0151A0 c0151a0 = new C0151A0(getContext());
            this.f32777R0 = c0151a0;
            addView(c0151a0, -1);
            requestLayout();
        }
        C0151A0 c0151a1 = this.f32777R0;
        AbstractC16544l.m18091d(c0151a1);
        return c0151a1;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC11209c getAutofill() {
        return this.f32772M0;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C11215i getAutofillTree() {
        return this.autofillTree;
    }

    public final InterfaceC1436k getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    /* JADX INFO: renamed from: getContentCaptureManager$ui_release, reason: from getter */
    public final ViewOnAttachStateChangeListenerC11560d getContentCaptureManager() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC18776i getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC7537b getDensity() {
        return (InterfaceC7537b) this.f32806r0.getValue();
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC12990c getDragAndDropManager() {
        return this.f32812u0;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC13515g getFocusOwner() {
        return this.f32808s0;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C17296C c17296c;
        C13801c c13801cM11349w = m11349w();
        if (c13801cM11349w != null) {
            rect.left = Math.round(c13801cM11349w.f43586a);
            rect.top = Math.round(c13801cM11349w.f43587b);
            rect.right = Math.round(c13801cM11349w.f43588c);
            rect.bottom = Math.round(c13801cM11349w.f43589d);
            c17296c = C17296C.f55119a;
        } else {
            c17296c = null;
        }
        if (c17296c == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC5598n getFontFamilyResolver() {
        return (InterfaceC5598n) this.f32807r1.getValue();
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC5597m getFontLoader() {
        return this.f32805q1;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC14324B getGraphicsContext() {
        return this.f32756D0;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC18285a getHapticFeedBack() {
        return this.f32813u1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f32781V0.f68772b.m12588G();
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC18607b getInputModeManager() {
        return this.f32815v1;
    }

    /* JADX INFO: renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.p650ui.node.Owner
    public EnumC7546k getLayoutDirection() {
        return (EnumC7546k) this.f32811t1.getValue();
    }

    public long getMeasureIteration() {
        C21671Q c21671q = this.f32781V0;
        if (c21671q.f68773c) {
            return c21671q.f68777g;
        }
        AbstractC8111i5.m8591b("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C21364d getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public AbstractC21068W getPlacementScope() {
        int i10 = AbstractC21070Y.f66987b;
        return new C21054H(this, 1);
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC19735l getPointerIconService() {
        return this.f32769J1;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C21658D getRoot() {
        return this.root;
    }

    public InterfaceC21699j0 getRootForTest() {
        return this.f32820y0;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C2635m c2635m;
        if (Build.VERSION.SDK_INT < 31 || (c2635m = this.f32767I1) == null) {
            return false;
        }
        return ((Boolean) c2635m.f8152a.getValue()).booleanValue();
    }

    public C2969p getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C21660F getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C21691f0 getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC0300w1 getSoftwareKeyboardController() {
        return this.f32803p1;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C6046D getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC0303x1 getTextToolbar() {
        return this.f32819x1;
    }

    public View getView() {
        return this;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC0161D1 getViewConfiguration() {
        return this.f32782W0;
    }

    public final C0271n getViewTreeOwners() {
        return (C0271n) this.f32793h1.getValue();
    }

    @Override // androidx.compose.p650ui.node.Owner
    public InterfaceC0182K1 getWindowInfo() {
        return this.f32814v0;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC21687d0 m11339i(C20567q c20567q, C20714I0 c20714i0, C16308b c16308b) {
        Reference referencePoll;
        C6546d c6546d;
        Object obj;
        if (c16308b != null) {
            return new C0216W0(c16308b, null, this, c20567q, c20714i0);
        }
        do {
            C11232c c11232c = this.f32751A1;
            referencePoll = ((ReferenceQueue) c11232c.f33997Z).poll();
            c6546d = (C6546d) c11232c.f33996Y;
            if (referencePoll != null) {
                c6546d.m7110o(referencePoll);
            }
        } while (referencePoll != null);
        do {
            if (!c6546d.m7109n()) {
                obj = null;
                break;
            }
            obj = ((Reference) c6546d.m7111p(c6546d.f21184o0 - 1)).get();
        } while (obj == null);
        InterfaceC21687d0 interfaceC21687d0 = (InterfaceC21687d0) obj;
        if (interfaceC21687d0 != null) {
            interfaceC21687d0.mo542e(c20567q, c20714i0);
            return interfaceC21687d0;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new C0216W0(getGraphicsContext().mo14860b(), getGraphicsContext(), this, c20567q, c20714i0);
        }
        if (isHardwareAccelerated() && this.f32791f1) {
            try {
                return new C0279p1(this, c20567q, c20714i0);
            } catch (Throwable unused) {
                this.f32791f1 = false;
            }
        }
        if (this.f32778S0 == null) {
            if (!C0170G1.f653G0) {
                AbstractC0240d0.m808s(new View(getContext()));
            }
            C0207T0 c0207t0 = C0170G1.f654H0 ? new C0207T0(getContext()) : new C0173H1(getContext());
            this.f32778S0 = c0207t0;
            addView(c0207t0, -1);
        }
        C0207T0 c0207t1 = this.f32778S0;
        AbstractC16544l.m18091d(c0207t1);
        return new C0170G1(this, c0207t1, c20567q, c20714i0);
    }

    /* JADX INFO: renamed from: k */
    public final int m11340k(MotionEvent motionEvent) {
        int actionMasked;
        float[] fArr = this.f32786a1;
        removeCallbacks(this.f32755C1);
        try {
            this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
            this.f32763G1.mo496a(this, fArr);
            AbstractC0240d0.m798i(fArr, this.f32787b1);
            long jM15603b = C14328F.m15603b(AbstractC8088f6.m8536b(motionEvent.getX(), motionEvent.getY()), fArr);
            this.f32790e1 = AbstractC8088f6.m8536b(motionEvent.getRawX() - C13800b.m15306g(jM15603b), motionEvent.getRawY() - C13800b.m15307h(jM15603b));
            boolean z6 = true;
            this.f32789d1 = true;
            m11345s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f32821y1;
                boolean z10 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                C0326m c0326m = this.f32770K0;
                if (motionEvent2 != null) {
                    if ((motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true) {
                        if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            c0326m.m962v();
                        } else if (motionEvent2.getActionMasked() != 10 && z10) {
                            m11336H(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                }
                boolean z11 = motionEvent.getToolType(0) == 3;
                if (!z10 && z11 && actionMasked2 != 3 && actionMasked2 != 9 && m11342p(motionEvent)) {
                    m11336H(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f32821y1;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f32821y1;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C13064e c13064e = this.f32768J0;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ((SparseBooleanArray) c13064e.f41497q0).delete(pointerId);
                            ((SparseLongArray) c13064e.f41496p0).delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f32821y1;
                        float x4 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f32821y1;
                        boolean z12 = (x4 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f32821y1;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z6 = false;
                        }
                        if (z12 || z6) {
                            if (pointerId >= 0) {
                                ((SparseBooleanArray) c13064e.f41497q0).delete(pointerId);
                                ((SparseLongArray) c13064e.f41496p0).delete(pointerId);
                            }
                            ((C6546d) ((C10077b) ((C5311e) c0326m.f1141c).f17485o0).f29833Z).m7104i();
                        }
                    }
                }
                this.f32821y1 = MotionEvent.obtainNoHistory(motionEvent);
                int iM11335G = m11335G(motionEvent);
                Trace.endSection();
                this.f32789d1 = false;
                return iM11335G;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f32789d1 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11341n(C21658D c21658d) {
        int i10 = 0;
        this.f32781V0.m22147p(c21658d, false);
        C6546d c6546dM22014L = c21658d.m22014L();
        int i11 = c6546dM22014L.f21184o0;
        if (i11 > 0) {
            Object[] objArr = c6546dM22014L.f21182Y;
            do {
                m11341n((C21658D) objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC11105n abstractC11105nMo7809i;
        InterfaceC11112u interfaceC11112u;
        C11207a c11207a;
        super.onAttachedToWindow();
        this.f32814v0.f692a.setValue(Boolean.valueOf(hasWindowFocus()));
        m11341n(getRoot());
        m11328l(getRoot());
        getSnapshotObserver().f68847a.m10124d();
        if (m11324f() && (c11207a = this.f32772M0) != null) {
            C11213g.f33886a.m12437a(c11207a);
        }
        InterfaceC11112u interfaceC11112uM8090b = AbstractC7841A0.m8090b(this);
        InterfaceC3232g interfaceC3232gM8583b = AbstractC8104h6.m8583b(this);
        C0271n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC11112uM8090b != null && interfaceC3232gM8583b != null && (interfaceC11112uM8090b != (interfaceC11112u = viewTreeOwners.f991a) || interfaceC3232gM8583b != interfaceC11112u))) {
            if (interfaceC11112uM8090b == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC3232gM8583b == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (abstractC11105nMo7809i = viewTreeOwners.f991a.mo7809i()) != null) {
                abstractC11105nMo7809i.mo7808c(this);
            }
            interfaceC11112uM8090b.mo7809i().mo7806a(this);
            C0271n c0271n = new C0271n(interfaceC11112uM8090b, interfaceC3232gM8583b);
            set_viewTreeOwners(c0271n);
            InterfaceC1436k interfaceC1436k = this.f32794i1;
            if (interfaceC1436k != null) {
                interfaceC1436k.invoke(c0271n);
            }
            this.f32794i1 = null;
        }
        int i10 = isInTouchMode() ? 1 : 2;
        C18608c c18608c = this.f32815v1;
        c18608c.getClass();
        c18608c.f59267a.setValue(new C18606a(i10));
        C0271n viewTreeOwners2 = getViewTreeOwners();
        AbstractC11105n abstractC11105nMo7809i2 = viewTreeOwners2 != null ? viewTreeOwners2.f991a.mo7809i() : null;
        if (abstractC11105nMo7809i2 == null) {
            AbstractC8111i5.m8593d("No lifecycle owner exists");
            throw null;
        }
        abstractC11105nMo7809i2.mo7806a(this);
        abstractC11105nMo7809i2.mo7806a(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f32795j1);
        getViewTreeObserver().addOnScrollChangedListener(this.f32796k1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f32797l1);
        if (Build.VERSION.SDK_INT >= 31) {
            C0221Y.f850a.m690b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C10461s c10461s = (C10461s) this.f32801o1.get();
        C0275o0 c0275o0 = (C0275o0) (c10461s != null ? c10461s.f30974b : null);
        if (c0275o0 == null) {
            return this.f32798m1.f19695d;
        }
        C10461s c10461s2 = (C10461s) c0275o0.f1002p0.get();
        C0229a1 c0229a1 = (C0229a1) (c10461s2 != null ? c10461s2.f30974b : null);
        return c0229a1 != null && (c0229a1.f862e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AbstractC9382v4.m9955a(getContext()));
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f32809s1) {
            this.f32809s1 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(AbstractC8554S3.m9213a(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12153a(this, interfaceC11112u);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection c6069r;
        int i10 = 3;
        C10461s c10461s = (C10461s) this.f32801o1.get();
        InputConnection inputConnection = null;
        C0275o0 c0275o0 = (C0275o0) (c10461s != null ? c10461s.f30974b : null);
        if (c0275o0 != null) {
            C10461s c10461s2 = (C10461s) c0275o0.f1002p0.get();
            C0229a1 c0229a1 = (C0229a1) (c10461s2 != null ? c10461s2.f30974b : null);
            if (c0229a1 != null) {
                synchronized (c0229a1.f860c) {
                    if (!c0229a1.f862e) {
                        InputConnection inputConnectionMo824a = c0229a1.f858a.mo824a(editorInfo);
                        C0254h0 c0254h0 = new C0254h0(c0229a1, i10);
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 >= 34) {
                            c6069r = new C6071t(inputConnectionMo824a, c0254h0);
                        } else if (i11 >= 25) {
                            c6069r = new C6070s(inputConnectionMo824a, c0254h0);
                        } else {
                            c6069r = i11 >= 24 ? new C6069r(inputConnectionMo824a, c0254h0) : new InputConnectionC6068q(inputConnectionMo824a, c0254h0);
                        }
                        inputConnection = c6069r;
                        c0229a1.f861d.m7099c(new WeakReference(inputConnection));
                    }
                }
            }
            return inputConnection;
        }
        C6048F c6048f = this.f32798m1;
        if (!c6048f.f19695d) {
            return null;
        }
        C6065n c6065n = c6048f.f19699h;
        C6045C c6045c = c6048f.f19698g;
        int i12 = c6065n.f19760e;
        boolean zM6639a = C6064m.m6639a(i12, 1);
        boolean z6 = c6065n.f19756a;
        int i13 = 0;
        if (zM6639a) {
            if (z6) {
                i13 = 6;
            }
        } else if (C6064m.m6639a(i12, 0)) {
            i13 = 1;
        } else if (C6064m.m6639a(i12, 2)) {
            i13 = 2;
        } else if (C6064m.m6639a(i12, 6)) {
            i13 = 5;
        } else if (C6064m.m6639a(i12, 5)) {
            i13 = 7;
        } else if (C6064m.m6639a(i12, 3)) {
            i13 = 3;
        } else if (C6064m.m6639a(i12, 4)) {
            i13 = 4;
        } else {
            if (!C6064m.m6639a(i12, 7)) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i13 = 6;
        }
        editorInfo.imeOptions = i13;
        int i14 = c6065n.f19759d;
        if (C6067p.m6643a(i14, 1)) {
            editorInfo.inputType = 1;
        } else if (C6067p.m6643a(i14, 2)) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions |= Integer.MIN_VALUE;
        } else if (C6067p.m6643a(i14, 3)) {
            editorInfo.inputType = 2;
        } else if (C6067p.m6643a(i14, 4)) {
            editorInfo.inputType = 3;
        } else if (C6067p.m6643a(i14, 5)) {
            editorInfo.inputType = 17;
        } else if (C6067p.m6643a(i14, 6)) {
            editorInfo.inputType = 33;
        } else if (C6067p.m6643a(i14, 7)) {
            editorInfo.inputType = 129;
        } else if (C6067p.m6643a(i14, 8)) {
            editorInfo.inputType = 18;
        } else {
            if (!C6067p.m6643a(i14, 9)) {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
            editorInfo.inputType = 8194;
        }
        if (!z6) {
            int i15 = editorInfo.inputType;
            if ((i15 & 1) == 1) {
                editorInfo.inputType = i15 | 131072;
                if (C6064m.m6639a(c6065n.f19760e, 1)) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        if ((editorInfo.inputType & 1) == 1) {
            int i16 = c6065n.f19757b;
            if (C6066o.m6641a(i16, 1)) {
                editorInfo.inputType |= 4096;
            } else if (C6066o.m6641a(i16, 2)) {
                editorInfo.inputType |= 8192;
            } else if (C6066o.m6641a(i16, 3)) {
                editorInfo.inputType |= 16384;
            }
            if (c6065n.f19758c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j10 = c6045c.f19683b;
        int i17 = C3581L.f10907c;
        editorInfo.initialSelStart = (int) (j10 >> 32);
        editorInfo.initialSelEnd = (int) (j10 & 4294967295L);
        AbstractC1857d.m2739c(editorInfo, c6045c.f19682a.f10934Y);
        editorInfo.imeOptions |= 33554432;
        if (C7218j.m7610c()) {
            C7218j.m7609a().m7616h(editorInfo);
        }
        InputConnectionC6075x inputConnectionC6075x = new InputConnectionC6075x(c6048f.f19698g, new C19506i(c6048f, 16), c6048f.f19699h.f19758c);
        c6048f.f19700i.add(new WeakReference(inputConnectionC6075x));
        return inputConnectionC6075x;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11560d.getClass();
        C11558b.f34932a.m12953b(viewOnAttachStateChangeListenerC11560d, jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12154b(this, interfaceC11112u);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C11207a c11207a;
        super.onDetachedFromWindow();
        C9571w c9571w = getSnapshotObserver().f68847a;
        C9555g c9555g = c9571w.f28801g;
        if (c9555g != null) {
            c9555g.dispose();
        }
        c9571w.m10122b();
        C0271n viewTreeOwners = getViewTreeOwners();
        AbstractC11105n abstractC11105nMo7809i = viewTreeOwners != null ? viewTreeOwners.f991a.mo7809i() : null;
        if (abstractC11105nMo7809i == null) {
            AbstractC8111i5.m8593d("No lifecycle owner exists");
            throw null;
        }
        abstractC11105nMo7809i.mo7808c(this.contentCaptureManager);
        abstractC11105nMo7809i.mo7808c(this);
        if (m11324f() && (c11207a = this.f32772M0) != null) {
            C11213g.f33886a.m12438b(c11207a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f32795j1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f32796k1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f32797l1);
        if (Build.VERSION.SDK_INT >= 31) {
            C0221Y.f850a.m689a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        if (z6 || hasFocus()) {
            return;
        }
        C10863b c10863b = (C10863b) getFocusOwner();
        C0093v0 c0093v0 = c10863b.f32700h;
        boolean z10 = c0093v0.f403Z;
        C13526r c13526r = c10863b.f32698f;
        if (z10) {
            AbstractC13512d.m15044e(c13526r, true, true);
            return;
        }
        try {
            c0093v0.f403Z = true;
            AbstractC13512d.m15044e(c13526r, true, true);
        } finally {
            C0093v0.m330b(c0093v0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        this.f32781V0.m22141j(this.f32761F1);
        this.f32779T0 = null;
        m11338J();
        if (this.f32777R0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        C21671Q c21671q = this.f32781V0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m11341n(getRoot());
            }
            long jM11326h = m11326h(i10);
            int i12 = (int) (jM11326h >>> 32);
            int i13 = (int) (jM11326h & 4294967295L);
            long jM11326h2 = m11326h(i11);
            int i14 = (int) (4294967295L & jM11326h2);
            int iMin = Math.min((int) (jM11326h2 >>> 32), 262142);
            int iMin2 = Integer.MAX_VALUE;
            int iMin3 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
            int iM9960c = AbstractC9388w4.m9960c(iMin3 == Integer.MAX_VALUE ? iMin : iMin3);
            if (i13 != Integer.MAX_VALUE) {
                iMin2 = Math.min(iM9960c, i13);
            }
            long jM9958a = AbstractC9388w4.m9958a(Math.min(iM9960c, i12), iMin2, iMin, iMin3);
            C7536a c7536a = this.f32779T0;
            if (c7536a == null) {
                this.f32779T0 = new C7536a(jM9958a);
                this.f32780U0 = false;
            } else if (!C7536a.m7848c(c7536a.f23888a, jM9958a)) {
                this.f32780U0 = true;
            }
            c21671q.m22148q(jM9958a);
            c21671q.m22143l();
            setMeasuredDimension(getRoot().m22011I(), getRoot().m22059s());
            if (this.f32777R0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().m22011I(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().m22059s(), 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12155c(this, interfaceC11112u);
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        C11207a c11207a;
        if (!m11324f() || viewStructure == null || (c11207a = this.f32772M0) == null) {
            return;
        }
        C11210d c11210d = C11210d.f33884a;
        C11215i c11215i = c11207a.f33881b;
        int iM12394a = c11210d.m12394a(viewStructure, c11215i.f33893a.size());
        int i11 = iM12394a;
        for (Map.Entry entry : c11215i.f33893a.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            C11214h c11214h = (C11214h) entry.getValue();
            ViewStructure viewStructureM12395b = c11210d.m12395b(viewStructure, i11);
            if (viewStructureM12395b != null) {
                C11211e c11211e = C11211e.f33885a;
                AutofillId autofillIdM12398a = c11211e.m12398a(viewStructure);
                AbstractC16544l.m18091d(autofillIdM12398a);
                c11211e.m12404g(viewStructureM12395b, autofillIdM12398a, iIntValue);
                c11210d.m12397d(viewStructureM12395b, iIntValue, c11207a.f33880a.getContext().getPackageName(), null, null);
                c11211e.m12405h(viewStructureM12395b, 1);
                List list = c11214h.f33889a;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    String str = (String) AbstractC11208b.f33883a.get((EnumC11216j) list.get(i12));
                    if (str == null) {
                        throw new IllegalArgumentException("Unsupported autofill type");
                    }
                    arrayList.add(str);
                }
                c11211e.m12403f(viewStructureM12395b, (String[]) arrayList.toArray(new String[0]));
                C13801c c13801c = c11214h.f33890b;
                if (c13801c == null) {
                    AbstractC15256t.m16482t("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iRound = Math.round(c13801c.f43586a);
                    int iRound2 = Math.round(c13801c.f43587b);
                    c11210d.m12396c(viewStructureM12395b, iRound, iRound2, 0, 0, Math.round(c13801c.f43588c) - iRound, Math.round(c13801c.f43589d) - iRound2);
                }
            }
            i11++;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC11112u interfaceC11112u) {
        setShowLayoutBounds(C0219X0.m688a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        EnumC7546k enumC7546k;
        if (this.f32802p0) {
            EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
            if (i10 != 0) {
                enumC7546k = i10 != 1 ? null : EnumC7546k.f23905Z;
            } else {
                enumC7546k = enumC7546k2;
            }
            if (enumC7546k != null) {
                enumC7546k2 = enumC7546k;
            }
            setLayoutDirection(enumC7546k2);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C2635m c2635m;
        if (Build.VERSION.SDK_INT < 31 || (c2635m = this.f32767I1) == null) {
            return;
        }
        c2635m.m3623a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12157e(this, interfaceC11112u);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC11112u interfaceC11112u) {
        AbstractC11095d.m12158f(this, interfaceC11112u);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11560d.getClass();
        C11558b.f34932a.m12954c(viewOnAttachStateChangeListenerC11560d, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        boolean zM688a;
        this.f32814v0.f692a.setValue(Boolean.valueOf(z6));
        this.f32765H1 = true;
        super.onWindowFocusChanged(z6);
        if (!z6 || getShowLayoutBounds() == (zM688a = C0219X0.m688a())) {
            return;
        }
        setShowLayoutBounds(zM688a);
        m11328l(getRoot());
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11342p(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        return 0.0f <= x4 && x4 <= ((float) getWidth()) && 0.0f <= y8 && y8 <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11343q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f32821y1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: r */
    public final long m11344r(long j10) {
        m11331B();
        long jM15603b = C14328F.m15603b(j10, this.f32786a1);
        return AbstractC8088f6.m8536b(C13800b.m15306g(this.f32790e1) + C13800b.m15306g(jM15603b), C13800b.m15307h(this.f32790e1) + C13800b.m15307h(jM15603b));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((C10863b) getFocusOwner()).f32698f.m15078L0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i10, rect);
        }
        if (iOrdinal != 3) {
            throw new C0644w();
        }
        C13510b c13510bM15038K = AbstractC13512d.m15038K(i10);
        int i11 = c13510bM15038K != null ? c13510bM15038K.f42774a : 7;
        Boolean boolM11303c = ((C10863b) getFocusOwner()).m11303c(i11, rect != null ? AbstractC14334L.m15619H(rect) : null, new C0307z(i11, 0));
        if (boolM11303c != null) {
            return boolM11303c.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final void m11345s(boolean z6) {
        C0150A c0150a;
        C21671Q c21671q = this.f32781V0;
        if (c21671q.f68772b.m12588G() || ((C6546d) c21671q.f68775e.f63875Z).m7109n()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z6) {
                try {
                    c0150a = this.f32761F1;
                } finally {
                    Trace.endSection();
                }
            } else {
                c0150a = null;
            }
            if (c21671q.m22141j(c0150a)) {
                requestLayout();
            }
            c21671q.m22136a(false);
            if (this.f32766I0) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f32766I0 = false;
            }
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long intervalMillis) {
        this.f32750A0.f769h = intervalMillis;
    }

    public final void setConfigurationChangeObserver(InterfaceC1436k interfaceC1436k) {
        this.configurationChangeObserver = interfaceC1436k;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d) {
        this.contentCaptureManager = viewOnAttachStateChangeListenerC11560d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [a1.p] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [Q0.d] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public void setCoroutineContext(InterfaceC18776i interfaceC18776i) {
        int i10;
        int i11;
        this.coroutineContext = interfaceC18776i;
        AbstractC10458p abstractC10458p = (AbstractC10458p) getRoot().f68638I0.f3471f;
        if (abstractC10458p instanceof C19723A) {
            ((C19723A) abstractC10458p).m20669M0();
        }
        AbstractC10458p abstractC10458p2 = abstractC10458p.f30960Y;
        if (!abstractC10458p2.f30972y0) {
            AbstractC8111i5.m8592c("visitSubtree called on an unattached node");
            throw null;
        }
        AbstractC10458p abstractC10458p3 = abstractC10458p2.f30965r0;
        C21658D c21658dM22217v = AbstractC21690f.m22217v(abstractC10458p);
        int[] iArrCopyOf = new int[16];
        C6546d[] c6546dArr = new C6546d[16];
        int i12 = 0;
        while (c21658dM22217v != null) {
            if (abstractC10458p3 == null) {
                abstractC10458p3 = (AbstractC10458p) c21658dM22217v.f68638I0.f3471f;
            }
            if ((abstractC10458p3.f30963p0 & 16) != 0) {
                while (abstractC10458p3 != null) {
                    if ((abstractC10458p3.f30962o0 & 16) != 0) {
                        ?? M22201f = abstractC10458p3;
                        ?? c6546d = 0;
                        while (M22201f != 0) {
                            if (M22201f instanceof InterfaceC21697i0) {
                                InterfaceC21697i0 interfaceC21697i0 = (InterfaceC21697i0) M22201f;
                                if (interfaceC21697i0 instanceof C19723A) {
                                    ((C19723A) interfaceC21697i0).m20669M0();
                                }
                            } else if ((M22201f.f30962o0 & 16) != 0 && (M22201f instanceof AbstractC21706n)) {
                                AbstractC10458p abstractC10458p4 = ((AbstractC21706n) M22201f).f68881A0;
                                int i13 = 0;
                                while (abstractC10458p4 != null) {
                                    if ((abstractC10458p4.f30962o0 & 16) != 0) {
                                        i13++;
                                        if (i13 == 1) {
                                            M22201f = M22201f;
                                            c6546d = c6546d;
                                            c6546d = c6546d;
                                            M22201f = abstractC10458p4;
                                        } else {
                                            if (c6546d == 0) {
                                                c6546d = new C6546d(new AbstractC10458p[16]);
                                            }
                                            if (M22201f != 0) {
                                                c6546d.m7099c(M22201f);
                                                M22201f = 0;
                                            }
                                            c6546d.m7099c(abstractC10458p4);
                                        }
                                    } else {
                                        M22201f = M22201f;
                                        c6546d = c6546d;
                                    }
                                    abstractC10458p4 = abstractC10458p4.f30965r0;
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                                if (i13 == 1) {
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                } else {
                                    M22201f = M22201f;
                                    c6546d = c6546d;
                                }
                            }
                            M22201f = AbstractC21690f.m22201f(c6546d);
                        }
                    }
                    abstractC10458p3 = abstractC10458p3.f30965r0;
                }
            }
            C6546d c6546dM22014L = c21658dM22217v.m22014L();
            if (!c6546dM22014L.m7108m()) {
                if (i12 >= iArrCopyOf.length) {
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                    AbstractC16544l.m18093f(iArrCopyOf, "copyOf(this, newSize)");
                    Object[] objArrCopyOf = Arrays.copyOf(c6546dArr, c6546dArr.length * 2);
                    AbstractC16544l.m18093f(objArrCopyOf, "copyOf(this, newSize)");
                    c6546dArr = (C6546d[]) objArrCopyOf;
                }
                iArrCopyOf[i12] = c6546dM22014L.f21184o0 - 1;
                c6546dArr[i12] = c6546dM22014L;
                i12++;
            }
            if (i12 <= 0 || (i11 = iArrCopyOf[(i10 = i12 - 1)]) < 0) {
                c21658dM22217v = null;
            } else {
                if (i12 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()");
                }
                C6546d c6546d2 = c6546dArr[i10];
                AbstractC16544l.m18091d(c6546d2);
                if (i11 > 0) {
                    iArrCopyOf[i10] = iArrCopyOf[i10] - 1;
                } else if (i11 == 0) {
                    c6546dArr[i10] = null;
                    i12--;
                }
                c21658dM22217v = (C21658D) c6546d2.f21182Y[i11];
            }
            abstractC10458p3 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC1436k callback) {
        C0271n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f32794i1 = callback;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public void setShowLayoutBounds(boolean z6) {
        this.showLayoutBounds = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m11346t(C21658D c21658d, long j10) {
        C21671Q c21671q = this.f32781V0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c21671q.m22142k(c21658d, j10);
            if (!c21671q.f68772b.m12588G()) {
                c21671q.m22136a(false);
                if (this.f32766I0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f32766I0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m11347u(InterfaceC21687d0 interfaceC21687d0, boolean z6) {
        ArrayList arrayList = this.f32760F0;
        if (!z6) {
            if (this.f32764H0) {
                return;
            }
            arrayList.remove(interfaceC21687d0);
            ArrayList arrayList2 = this.f32762G0;
            if (arrayList2 != null) {
                arrayList2.remove(interfaceC21687d0);
                return;
            }
            return;
        }
        if (!this.f32764H0) {
            arrayList.add(interfaceC21687d0);
            return;
        }
        ArrayList arrayList3 = this.f32762G0;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f32762G0 = arrayList3;
        }
        arrayList3.add(interfaceC21687d0);
    }

    /* JADX INFO: renamed from: v */
    public final void m11348v() {
        if (this.f32773N0) {
            C9571w c9571w = getSnapshotObserver().f68847a;
            synchronized (c9571w.f28800f) {
                try {
                    C6546d c6546d = c9571w.f28800f;
                    int i10 = c6546d.f21184o0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        C9570v c9570v = (C9570v) c6546d.f21182Y[i12];
                        c9570v.m10120e();
                        if (!(c9570v.f28788f.f41127e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = c6546d.f21182Y;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(c6546d.f21182Y, i13, i10, (Object) null);
                    c6546d.f21184o0 = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f32773N0 = false;
        }
        C0151A0 c0151a0 = this.f32777R0;
        if (c0151a0 != null) {
            m11325g(c0151a0);
        }
        while (this.f32753B1.m7109n()) {
            int i14 = this.f32753B1.f21184o0;
            for (int i15 = 0; i15 < i14; i15++) {
                Object[] objArr2 = this.f32753B1.f21182Y;
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) objArr2[i15];
                objArr2[i15] = null;
                if (interfaceC1426a != null) {
                    interfaceC1426a.invoke();
                }
            }
            this.f32753B1.m7112q(0, i14);
        }
    }

    /* JADX INFO: renamed from: w */
    public final C13801c m11349w() {
        if (isFocused()) {
            C13526r c13526rM15046g = AbstractC13512d.m15046g(((C10863b) getFocusOwner()).f32698f);
            if (c13526rM15046g != null) {
                return AbstractC13512d.m15049j(c13526rM15046g);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC13512d.m15043d(viewFindFocus);
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public final void m11350x(C21658D c21658d) {
        C0203S c0203s = this.f32750A0;
        c0203s.f786y = true;
        if (c0203s.m649y()) {
            c0203s.m623A(c21658d);
        }
        ViewOnAttachStateChangeListenerC11560d viewOnAttachStateChangeListenerC11560d = this.contentCaptureManager;
        viewOnAttachStateChangeListenerC11560d.f34948t0 = true;
        if (viewOnAttachStateChangeListenerC11560d.m12957c() && viewOnAttachStateChangeListenerC11560d.f34949u0.add(c21658d)) {
            viewOnAttachStateChangeListenerC11560d.f34950v0.mo2524p(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m11351y(C21658D c21658d, boolean z6, boolean z10, boolean z11) {
        C21658D c21658dM22009G;
        C21658D c21658dM22009G2;
        C21671Q c21671q = this.f32781V0;
        if (!z6) {
            if (c21671q.m22147p(c21658d, z10) && z11) {
                m11333D(c21658d);
                return;
            }
            return;
        }
        c21671q.getClass();
        if (c21658d.f68652o0 == null) {
            AbstractC8111i5.m8592c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        int iM24h = AbstractC0010F.m24h(c21658d.m22064w());
        if (iM24h != 0) {
            if (iM24h == 1) {
                return;
            }
            if (iM24h != 2 && iM24h != 3) {
                if (iM24h != 4) {
                    throw new C0644w();
                }
                if (!c21658d.m22068y() || z10) {
                    c21658d.m22035e0();
                    c21658d.m22037f0();
                    if (c21658d.f68647R0) {
                        return;
                    }
                    boolean zM18089b = AbstractC16544l.m18089b(c21658d.m22027Y(), Boolean.TRUE);
                    C11241l c11241l = c21671q.f68772b;
                    if ((zM18089b || (c21658d.m22068y() && C21671Q.m22135i(c21658d))) && ((c21658dM22009G = c21658d.m22009G()) == null || !c21658dM22009G.m22068y())) {
                        c11241l.m12598y(c21658d, true);
                    } else if ((c21658d.m22025W() || (c21658d.m22004B() && C21671Q.m22134h(c21658d))) && ((c21658dM22009G2 = c21658d.m22009G()) == null || !c21658dM22009G2.m22004B())) {
                        c11241l.m12598y(c21658d, false);
                    }
                    if (c21671q.f68774d || !z11) {
                        return;
                    }
                    m11333D(c21658d);
                    return;
                }
                return;
            }
        }
        c21671q.f68778h.m7099c(new C21670P(c21658d, true, z10));
    }

    /* JADX INFO: renamed from: z */
    public final void m11352z(C21658D c21658d, boolean z6, boolean z10) {
        C21671Q c21671q = this.f32781V0;
        if (!z6) {
            c21671q.getClass();
            int iM24h = AbstractC0010F.m24h(c21658d.m22064w());
            if (iM24h == 0 || iM24h == 1 || iM24h == 2 || iM24h == 3) {
                return;
            }
            if (iM24h != 4) {
                throw new C0644w();
            }
            if (!z10 && c21658d.m22025W() == c21658d.m22026X() && (c21658d.m22004B() || c21658d.m22062v())) {
                return;
            }
            c21658d.m22031c0();
            if (!c21658d.f68647R0 && c21658d.m22026X()) {
                C21658D c21658dM22009G = c21658d.m22009G();
                if ((c21658dM22009G == null || !c21658dM22009G.m22062v()) && (c21658dM22009G == null || !c21658dM22009G.m22004B())) {
                    c21671q.f68772b.m12598y(c21658d, false);
                }
                if (c21671q.f68774d) {
                    return;
                }
                m11333D(null);
                return;
            }
            return;
        }
        c21671q.getClass();
        int iM24h2 = AbstractC0010F.m24h(c21658d.m22064w());
        if (iM24h2 != 0) {
            if (iM24h2 == 1) {
                return;
            }
            if (iM24h2 != 2) {
                if (iM24h2 == 3) {
                    return;
                }
                if (iM24h2 != 4) {
                    throw new C0644w();
                }
            }
        }
        if ((c21658d.m22068y() || c21658d.m22066x()) && !z10) {
            return;
        }
        c21658d.m22033d0();
        c21658d.m22031c0();
        if (c21658d.f68647R0) {
            return;
        }
        C21658D c21658dM22009G2 = c21658d.m22009G();
        boolean zM18089b = AbstractC16544l.m18089b(c21658d.m22027Y(), Boolean.TRUE);
        C11241l c11241l = c21671q.f68772b;
        if (zM18089b && ((c21658dM22009G2 == null || !c21658dM22009G2.m22068y()) && (c21658dM22009G2 == null || !c21658dM22009G2.m22066x()))) {
            c11241l.m12598y(c21658d, true);
        } else if (c21658d.m22025W() && ((c21658dM22009G2 == null || !c21658dM22009G2.m22062v()) && (c21658dM22009G2 == null || !c21658dM22009G2.m22004B()))) {
            c11241l.m12598y(c21658d, false);
        }
        if (c21671q.f68774d) {
            return;
        }
        m11333D(null);
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [A1.m] */
    public AndroidComposeView(Context context, InterfaceC18776i interfaceC18776i) {
        EnumC7546k enumC7546k;
        super(context);
        this.f32800o0 = 9205357640488583168L;
        this.f32802p0 = true;
        this.sharedDrawScope = new C21660F();
        C7539d c7539dM9955a = AbstractC9382v4.m9955a(context);
        C5975S c5975s = C5975S.f19446p0;
        this.f32806r0 = C5997d.m6430Q(c7539dM9955a, c5975s);
        C2957d c2957d = new C2957d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c2957d);
        this.f32808s0 = new C10863b(new C0292u(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0, 0), new C0295v(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0, 0), new C0292u(1, this, AndroidComposeView.class, "onMoveFocusInChildren", FpwNpGDhomXHZ.QQQPgw, 0, 1), new C0283r(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0, 1), new C0283r(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0, 2), new C0298w(0, 0, AndroidComposeView.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        ViewOnDragListenerC0204S0 viewOnDragListenerC0204S0 = new ViewOnDragListenerC0204S0();
        this.coroutineContext = interfaceC18776i;
        this.f32812u0 = viewOnDragListenerC0204S0;
        this.f32814v0 = new C0185L1();
        InterfaceC10459q interfaceC10459qM11311a = AbstractC10865a.m11311a(C10456n.f30959Y, new C0274o(this, 1));
        InterfaceC10459q interfaceC10459qM11314a = AbstractC10867a.m11314a();
        this.f32816w0 = new C14363s();
        C21658D c21658d = new C21658D(false, 3, 0);
        c21658d.m22067x0(C21071Z.f66988b);
        c21658d.m22063v0(getDensity());
        c21658d.m22069y0(AbstractC9306j0.m9882a(emptySemanticsElement, interfaceC10459qM11314a).mo428M(interfaceC10459qM11311a).mo428M(((C10863b) getFocusOwner()).f32701i).mo428M(viewOnDragListenerC0204S0.f790c));
        this.root = c21658d;
        this.f32820y0 = this;
        this.semanticsOwner = new C2969p(getRoot(), c2957d);
        C0203S c0203s = new C0203S(this);
        this.f32750A0 = c0203s;
        this.contentCaptureManager = new ViewOnAttachStateChangeListenerC11560d(this, new C0283r(0, this, AbstractC0240d0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        this.accessibilityManager = new C0253h(context);
        this.f32756D0 = new C14350f(this);
        this.autofillTree = new C11215i();
        this.f32760F0 = new ArrayList();
        this.f32768J0 = new C13064e();
        C21658D root = getRoot();
        C0326m c0326m = new C0326m();
        c0326m.f1140b = root;
        c0326m.f1141c = new C5311e((C21715t) root.f68638I0.f3468c);
        c0326m.f1142d = new C9642z(21, (byte) 0);
        c0326m.f1143e = new C21713r();
        this.f32770K0 = c0326m;
        this.configurationChangeObserver = C0280q.f1024Z;
        this.f32772M0 = m11324f() ? new C11207a(this, getAutofillTree()) : null;
        this.clipboardManager = new C0256i(context);
        this.snapshotObserver = new C21691f0(new C0274o(this, 2));
        this.f32781V0 = new C21671Q(getRoot());
        this.f32782W0 = new C0302x0(ViewConfiguration.get(context));
        this.f32783X0 = AbstractC9101A4.m9631a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f32784Y0 = new int[]{0, 0};
        float[] fArrM15602a = C14328F.m15602a();
        this.f32785Z0 = fArrM15602a;
        this.f32786a1 = C14328F.m15602a();
        this.f32787b1 = C14328F.m15602a();
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.f32790e1 = 9187343241974906880L;
        this.f32791f1 = true;
        C5975S c5975s2 = C5975S.f19448r0;
        this.f32792g1 = C5997d.m6430Q(null, c5975s2);
        this.f32793h1 = C5997d.m6421H(new C0150A(this, 1));
        int i10 = 0;
        this.f32795j1 = new ViewTreeObserverOnGlobalLayoutListenerC0262k(this, i10);
        this.f32796k1 = new ViewTreeObserverOnScrollChangedListenerC0265l(this, i10);
        this.f32797l1 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: A1.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z6) {
                C18608c c18608c = this.f980Y.f32815v1;
                int i11 = z6 ? 1 : 2;
                c18608c.getClass();
                c18608c.f59267a.setValue(new C18606a(i11));
            }
        };
        C6048F c6048f = new C6048F(getView(), this);
        this.f32798m1 = c6048f;
        this.textInputService = new C6046D(c6048f);
        this.f32801o1 = new AtomicReference(null);
        this.f32803p1 = new C0190N0(getTextInputService());
        this.f32805q1 = new C0219X0();
        this.f32807r1 = C5997d.m6430Q(AbstractC8554S3.m9213a(context), c5975s);
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = Build.VERSION.SDK_INT;
        this.f32809s1 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        EnumC7546k enumC7546k2 = EnumC7546k.f23904Y;
        if (layoutDirection != 0) {
            enumC7546k = layoutDirection != 1 ? null : EnumC7546k.f23905Z;
        } else {
            enumC7546k = enumC7546k2;
        }
        this.f32811t1 = C5997d.m6430Q(enumC7546k != null ? enumC7546k : enumC7546k2, c5975s2);
        this.f32813u1 = new C18286b(this);
        this.f32815v1 = new C18608c(isInTouchMode() ? 1 : 2, new C0274o(this, 0));
        this.modifierLocalManager = new C21364d(this);
        this.f32819x1 = new C0278p0(this);
        this.f32751A1 = new C11232c(2);
        this.f32753B1 = new C6546d(new InterfaceC1426a[16]);
        this.f32755C1 = new RunnableC0153B(this, 0);
        this.f32757D1 = new RunnableC0000A(this, 7);
        this.f32761F1 = new C0150A(this, 0);
        this.f32763G1 = i11 < 29 ? new C0160D0(fArrM15602a) : new C0163E0();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            C0236c0.f880a.m782a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC0738T.m1584l(this, c0203s);
        setOnDragListener(viewOnDragListenerC0204S0);
        getRoot().m22032d(this);
        if (i11 >= 29) {
            C0212V.f809a.m683a(this);
        }
        this.f32767I1 = i11 >= 31 ? new C2635m() : null;
        this.f32769J1 = new C0304y(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        AbstractC16544l.m18091d(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C0253h getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.p650ui.node.Owner
    public C0256i getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
