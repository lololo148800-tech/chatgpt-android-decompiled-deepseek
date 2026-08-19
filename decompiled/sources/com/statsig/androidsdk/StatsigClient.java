package com.statsig.androidsdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import kotlin.jvm.internal.C16525B;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import mm.C17309l;
import p025An.AbstractC0563B;
import p025An.AbstractC0575H;
import p025An.AbstractC0593T;
import p025An.InterfaceC0567D;
import p025An.InterfaceC0571F;
import p025An.InterfaceC0627n0;
import p025An.InterfaceC0638t;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p050Bn.C1451e;
import p086D6.C1970n;
import p103Dn.AbstractC2124C;
import p1113xn.AbstractC21329w;
import p153Fn.AbstractC2935m;
import p153Fn.C2925c;
import p201Hn.C3516e;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17660E;
import p972qm.C18777j;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0015¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0015¢\u0006\u0004\b&\u0010%J\u001f\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u001f\u0010+\u001a\u00020(2\u0006\u0010'\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u0015¢\u0006\u0004\b+\u0010*J\u0015\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J9\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00062\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000103¢\u0006\u0004\b5\u00106J5\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00062\u0016\b\u0002\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u000103¢\u0006\u0004\b5\u00107J)\u00105\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00062\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000603¢\u0006\u0004\b5\u00108J;\u0010;\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000209\u0018\u000103¢\u0006\u0004\b;\u0010<J5\u0010=\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000209\u0018\u000103H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u0013\u0010A\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020C¢\u0006\u0004\bD\u0010EJ\u0013\u0010F\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bF\u0010BJ\r\u0010G\u001a\u00020\u000e¢\u0006\u0004\bG\u0010\u0003J\u0013\u0010H\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\bH\u0010BJ\u001d\u0010I\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0015¢\u0006\u0004\bI\u0010JJ)\u0010K\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020903¢\u0006\u0004\bK\u00108J)\u0010L\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020903¢\u0006\u0004\bL\u00108J\u0015\u0010N\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u0006¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020\u000e¢\u0006\u0004\bP\u0010\u0003J\r\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\bS\u0010OJ\u0015\u0010T\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\bT\u0010OJ\u001d\u0010U\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\bU\u0010JJ%\u0010W\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\bW\u0010XJ\r\u0010Z\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J3\u0010`\u001a\u00020\u000e2\u0006\u0010]\u001a\u00020\\2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e\u0018\u00010^j\u0004\u0018\u0001`_¢\u0006\u0004\b`\u0010aJ\u001b\u0010d\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0081@ø\u0001\u0000¢\u0006\u0004\bb\u0010cJ)\u0010i\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020(2\u0006\u0010V\u001a\u00020\u00062\b\b\u0002\u0010f\u001a\u00020\u0015H\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010m\u001a\u00020jH\u0000¢\u0006\u0004\bk\u0010lJ\r\u0010n\u001a\u00020\u0015¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u0006H\u0000¢\u0006\u0004\bq\u0010OJ\u000f\u0010v\u001a\u00020sH\u0000¢\u0006\u0004\bt\u0010uJ#\u0010z\u001a\u00020\u000e2\u0006\u0010w\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u00020\u000eH\u0016¢\u0006\u0004\b{\u0010\u0003J\u000f\u0010|\u001a\u00020\u000eH\u0016¢\u0006\u0004\b|\u0010\u0003J5\u0010}\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u007f\u0010\u0003J\u0015\u0010\u0080\u0001\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0005\b\u0080\u0001\u0010BJ-\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00020\u001e2\b\b\u0002\u0010f\u001a\u00020\u0015H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J-\u0010\u0082\u0001\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u00062\u0007\u0010\u0084\u0001\u001a\u00020\u00192\b\b\u0002\u0010f\u001a\u00020\u0015H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0003J\u0011\u0010\u0087\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0087\u0001\u0010RJ\u001c\u0010\u0088\u0001\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0003J\u0011\u0010\u008b\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b\u008b\u0001\u0010\u0003J\u0015\u0010\u008c\u0001\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0005\b\u008c\u0001\u0010BJ0\u0010\u0091\u0001\u001a\u00020\u000e2\u0007\u0010\u008d\u0001\u001a\u00020\u00152\u0007\u0010]\u001a\u00030\u008e\u00012\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J.\u0010\u0096\u0001\u001a\u00020\u000e2\u0007\u0010]\u001a\u00030\u008e\u00012\u0011\u0010\u0095\u0001\u001a\f\u0018\u00010\u0093\u0001j\u0005\u0018\u0001`\u0094\u0001H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0098\u0001\u001a\u00020j8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\t\u0010\u009a\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0005\u0010\u009b\u0001R\u0017\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0007\u0010\u009c\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001a\u0010¡\u0001\u001a\u00030 \u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010¤\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001a\u0010§\u0001\u001a\u00030¦\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010°\u0001\u001a\u00030¯\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R*\u0010³\u0001\u001a\u00030²\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R\u001c\u0010º\u0001\u001a\u0005\u0018\u00010¹\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u001a\u0010½\u0001\u001a\u00030¼\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001a\u0010À\u0001\u001a\u00030¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010Ã\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u001a\u0010Å\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Ä\u0001R\u001a\u0010Æ\u0001\u001a\u00030Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ä\u0001R1\u0010È\u0001\u001a\u00030Ç\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\bÈ\u0001\u0010É\u0001\u0012\u0005\bÎ\u0001\u0010\u0003\u001a\u0006\bÊ\u0001\u0010Ë\u0001\"\u0006\bÌ\u0001\u0010Í\u0001R.\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0081.¢\u0006\u001e\n\u0005\b\r\u0010Ï\u0001\u0012\u0005\bÔ\u0001\u0010\u0003\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Õ\u0001"}, m18067d2 = {"Lcom/statsig/androidsdk/StatsigClient;", "Lcom/statsig/androidsdk/LifecycleEventListener;", "<init>", "()V", "Landroid/app/Application;", SIPServerTransaction.CONTENT_TYPE_APPLICATION, "", "sdkKey", "Lcom/statsig/androidsdk/StatsigUser;", "user", "Lcom/statsig/androidsdk/IStatsigCallback;", "callback", "Lcom/statsig/androidsdk/StatsigOptions;", "options", "Lmm/C;", "initializeAsync", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Lcom/statsig/androidsdk/StatsigOptions;)V", "Lcom/statsig/androidsdk/InitializationDetails;", "initialize", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;Lqm/c;)Ljava/lang/Object;", "gateName", "", "checkGate", "(Ljava/lang/String;)Z", "checkGateWithExposureLoggingDisabled", "Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGate", "(Ljava/lang/String;)Lcom/statsig/androidsdk/FeatureGate;", "getFeatureGateWithExposureLoggingDisabled", "configName", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfig", "(Ljava/lang/String;)Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithExposureLoggingDisabled", "experimentName", "keepDeviceValue", "getExperiment", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentWithExposureLoggingDisabled", "layerName", "Lcom/statsig/androidsdk/Layer;", "getLayer", "(Ljava/lang/String;Z)Lcom/statsig/androidsdk/Layer;", "getLayerWithExposureLoggingDisabled", "parameterStoreName", "Lcom/statsig/androidsdk/ParameterStore;", "getParameterStore", "(Ljava/lang/String;)Lcom/statsig/androidsdk/ParameterStore;", "eventName", "", "value", "", "metadata", "logEvent", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map;)V", "", "values", "updateUserAsync", "(Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/IStatsigCallback;Ljava/util/Map;)V", "updateUser", "(Lcom/statsig/androidsdk/StatsigUser;Ljava/util/Map;Lqm/c;)Ljava/lang/Object;", "refreshCacheAsync", "(Lcom/statsig/androidsdk/IStatsigCallback;Lqm/c;)Ljava/lang/Object;", "refreshCache", "(Lqm/c;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/ExternalInitializeResponse;", "getInitializeResponseJson", "()Lcom/statsig/androidsdk/ExternalInitializeResponse;", "shutdownSuspend", "shutdown", "flush", "overrideGate", "(Ljava/lang/String;Z)V", "overrideConfig", "overrideLayer", DiagnosticsEntry.NAME_KEY, "removeOverride", "(Ljava/lang/String;)V", "removeAllOverrides", "getStableID", "()Ljava/lang/String;", "manuallyLogGateExposure", "manuallyLogConfigExposure", "manuallyLogExperimentExposure", "parameterName", "manuallyLogLayerParameterExposure", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/statsig/androidsdk/StatsigOverrides;", "getAllOverrides", "()Lcom/statsig/androidsdk/StatsigOverrides;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lcom/statsig/androidsdk/DebugViewCallback;", "openDebugView", "(Landroid/content/Context;LBm/k;)V", "setupAsync$build_release", "(Lcom/statsig/androidsdk/StatsigUser;Lqm/c;)Ljava/lang/Object;", "setupAsync", "layer", "isManual", "logLayerParameterExposure$build_release", "(Lcom/statsig/androidsdk/Layer;Ljava/lang/String;Z)V", "logLayerParameterExposure", "Lcom/statsig/androidsdk/Store;", "getStore$build_release", "()Lcom/statsig/androidsdk/Store;", "getStore", "isInitialized", "()Z", "functionName", "enforceInitialized$build_release", "enforceInitialized", "Landroid/content/SharedPreferences;", "getSharedPrefs$build_release", "()Landroid/content/SharedPreferences;", "getSharedPrefs", SubscriberAttributeKt.JSON_NAME_KEY, "saveStringToSharedPrefs$build_release", "(Ljava/lang/String;Ljava/lang/String;Lqm/c;)Ljava/lang/Object;", "saveStringToSharedPrefs", "onAppFocus", "onAppBlur", "setup", "(Landroid/app/Application;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/StatsigOptions;)Lcom/statsig/androidsdk/StatsigUser;", "resetUser", "updateUserImpl", "config", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Z)V", "gate", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Z)V", "updateStickyValues", "getLocalStorageStableID", "normalizeUser", "(Lcom/statsig/androidsdk/StatsigUser;)Lcom/statsig/androidsdk/StatsigUser;", "pollForUpdates", "populateStatsigMetadata", "shutdownImpl", "success", "Lcom/statsig/androidsdk/ContextType;", "Lcom/statsig/androidsdk/InitializeResponse;", "initResponse", "logEndDiagnostics", "(ZLcom/statsig/androidsdk/ContextType;Lcom/statsig/androidsdk/InitializeResponse;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "logEndDiagnosticsWhenException", "(Lcom/statsig/androidsdk/ContextType;Ljava/lang/Exception;)V", ProductResponseJsonKeys.STORE, "Lcom/statsig/androidsdk/Store;", "Lcom/statsig/androidsdk/StatsigUser;", "Landroid/app/Application;", "Ljava/lang/String;", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "lifecycleListener", "Lcom/statsig/androidsdk/StatsigActivityLifecycleListener;", "Lcom/statsig/androidsdk/StatsigLogger;", "logger", "Lcom/statsig/androidsdk/StatsigLogger;", "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigMetadata;", "LAn/D;", "exceptionHandler", "LAn/D;", "LAn/F;", "statsigScope", "LAn/F;", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "Lcom/statsig/androidsdk/Diagnostics;", "", "initTime", "J", "Lcom/statsig/androidsdk/ErrorBoundary;", "errorBoundary", "Lcom/statsig/androidsdk/ErrorBoundary;", "getErrorBoundary$build_release", "()Lcom/statsig/androidsdk/ErrorBoundary;", "setErrorBoundary$build_release", "(Lcom/statsig/androidsdk/ErrorBoundary;)V", "LAn/n0;", "pollingJob", "LAn/n0;", "LAn/t;", "statsigJob", "LAn/t;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isBootstrapped", "isInitializing", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigNetwork;", "getStatsigNetwork$build_release", "()Lcom/statsig/androidsdk/StatsigNetwork;", "setStatsigNetwork$build_release", "(Lcom/statsig/androidsdk/StatsigNetwork;)V", "getStatsigNetwork$build_release$annotations", "Lcom/statsig/androidsdk/StatsigOptions;", "getOptions$build_release", "()Lcom/statsig/androidsdk/StatsigOptions;", "setOptions$build_release", "(Lcom/statsig/androidsdk/StatsigOptions;)V", "getOptions$build_release$annotations", "build_release"}, m18068k = 1, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class StatsigClient implements LifecycleEventListener {
    private Application application;
    private Diagnostics diagnostics;
    private InterfaceC0567D exceptionHandler;
    private StatsigActivityLifecycleListener lifecycleListener;
    private StatsigLogger logger;
    public StatsigOptions options;
    private InterfaceC0627n0 pollingJob;
    private String sdkKey;
    private StatsigMetadata statsigMetadata;
    public StatsigNetwork statsigNetwork;
    private InterfaceC0571F statsigScope;
    private Store store;
    private StatsigUser user;
    private long initTime = System.currentTimeMillis();
    private ErrorBoundary errorBoundary = new ErrorBoundary();
    private InterfaceC0638t statsigJob = AbstractC0575H.m1176e();
    private CoroutineDispatcherProvider dispatcherProvider = new CoroutineDispatcherProvider(null, null, null, 7, null);
    private AtomicBoolean initialized = new AtomicBoolean(false);
    private AtomicBoolean isBootstrapped = new AtomicBoolean(false);
    private AtomicBoolean isInitializing = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$checkGate$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127851 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;
        final /* synthetic */ C16525B $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127851(String str, C16525B c16525b) {
            super(0);
            this.$gateName = str;
            this.$result = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22534invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22534invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            FeatureGate featureGateCheckGate = store.checkGate(this.$gateName);
            StatsigClient.logExposure$default(StatsigClient.this, this.$gateName, featureGateCheckGate, false, 4, (Object) null);
            this.$result.f51262Y = featureGateCheckGate;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$checkGateWithExposureLoggingDisabled$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127861 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;
        final /* synthetic */ C16525B $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127861(String str, C16525B c16525b) {
            super(0);
            this.$gateName = str;
            this.$result = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22535invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22535invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$gateName);
            Store store = StatsigClient.this.store;
            if (store != null) {
                this.$result.f51262Y = store.checkGate(this.$gateName);
            } else {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$flush$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$flush$2", m20656f = "StatsigClient.kt", m20657l = {562}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127872 extends AbstractC19694j implements InterfaceC1436k {
        int label;

        public C127872(InterfaceC18770c<? super C127872> interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C127872(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    AbstractC16544l.m18103p("logger");
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C127872) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getAllOverrides$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127881 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16525B $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127881(C16525B c16525b, StatsigClient statsigClient) {
            super(0);
            this.$result = c16525b;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22536invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22536invoke() {
            this.$result.f51262Y = this.this$0.getStore$build_release().getAllOverrides();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getConfig$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127891 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;
        final /* synthetic */ C16525B $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127891(C16525B c16525b, StatsigClient statsigClient, String str) {
            super(0);
            this.$result = c16525b;
            this.this$0 = statsigClient;
            this.$configName = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22537invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22537invoke() {
            C16525B c16525b = this.$result;
            Store store = this.this$0.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            c16525b.f51262Y = store.getConfig(this.$configName);
            StatsigClient.logExposure$default(this.this$0, this.$configName, (DynamicConfig) this.$result.f51262Y, false, 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getConfigWithExposureLoggingDisabled$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127901 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;
        final /* synthetic */ C16525B $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127901(String str, C16525B c16525b) {
            super(0);
            this.$configName = str;
            this.$result = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22538invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22538invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$configName);
            C16525B c16525b = this.$result;
            Store store = StatsigClient.this.store;
            if (store != null) {
                c16525b.f51262Y = store.getConfig(this.$configName);
            } else {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getExperiment$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127911 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $experimentName;
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ C16525B $res;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127911(C16525B c16525b, StatsigClient statsigClient, String str, boolean z6) {
            super(0);
            this.$res = c16525b;
            this.this$0 = statsigClient;
            this.$experimentName = str;
            this.$keepDeviceValue = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22539invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22539invoke() {
            C16525B c16525b = this.$res;
            Store store = this.this$0.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            c16525b.f51262Y = store.getExperiment(this.$experimentName, this.$keepDeviceValue);
            this.this$0.updateStickyValues();
            StatsigClient.logExposure$default(this.this$0, this.$experimentName, (DynamicConfig) this.$res.f51262Y, false, 4, (Object) null);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getExperimentWithExposureLoggingDisabled$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127921 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16525B $exp;
        final /* synthetic */ String $experimentName;
        final /* synthetic */ boolean $keepDeviceValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127921(String str, C16525B c16525b, boolean z6) {
            super(0);
            this.$experimentName = str;
            this.$exp = c16525b;
            this.$keepDeviceValue = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22540invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22540invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$experimentName);
            C16525B c16525b = this.$exp;
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            c16525b.f51262Y = store.getExperiment(this.$experimentName, this.$keepDeviceValue);
            StatsigClient.this.updateStickyValues();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getFeatureGate$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127931 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;
        final /* synthetic */ C16525B $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127931(String str, C16525B c16525b) {
            super(0);
            this.$gateName = str;
            this.$result = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22541invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22541invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            FeatureGate featureGateCheckGate = store.checkGate(this.$gateName);
            StatsigClient.logExposure$default(StatsigClient.this, this.$gateName, featureGateCheckGate, false, 4, (Object) null);
            this.$result.f51262Y = featureGateCheckGate;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getFeatureGateWithExposureLoggingDisabled$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127941 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;
        final /* synthetic */ C16525B $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127941(String str, C16525B c16525b) {
            super(0);
            this.$gateName = str;
            this.$result = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22542invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22542invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$gateName);
            Store store = StatsigClient.this.store;
            if (store != null) {
                this.$result.f51262Y = store.checkGate(this.$gateName);
            } else {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getInitializeResponseJson$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127951 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16525B $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127951(C16525B c16525b, StatsigClient statsigClient) {
            super(0);
            this.$result = c16525b;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22543invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22543invoke() {
            C16525B c16525b = this.$result;
            Store store = this.this$0.store;
            if (store != null) {
                c16525b.f51262Y = store.getCurrentCacheValuesAndEvaluationReason();
            } else {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLayer$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127961 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ C16525B $layer;
        final /* synthetic */ String $layerName;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127961(C16525B c16525b, StatsigClient statsigClient, String str, boolean z6) {
            super(0);
            this.$layer = c16525b;
            this.this$0 = statsigClient;
            this.$layerName = str;
            this.$keepDeviceValue = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22544invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22544invoke() {
            C16525B c16525b = this.$layer;
            Store store = this.this$0.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            c16525b.f51262Y = store.getLayer(this.this$0, this.$layerName, this.$keepDeviceValue);
            this.this$0.updateStickyValues();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLayerWithExposureLoggingDisabled$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127971 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ C16525B $layer;
        final /* synthetic */ String $layerName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127971(String str, C16525B c16525b, boolean z6) {
            super(0);
            this.$layerName = str;
            this.$layer = c16525b;
            this.$keepDeviceValue = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22545invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22545invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$layerName);
            C16525B c16525b = this.$layer;
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            c16525b.f51262Y = store.getLayer(null, this.$layerName, this.$keepDeviceValue);
            StatsigClient.this.updateStickyValues();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1", m20656f = "StatsigClient.kt", m20657l = {973}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127981 extends AbstractC19694j implements InterfaceC1439n {
        final /* synthetic */ C16525B $stableID;
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$getLocalStorageStableID$1$1", m20656f = "StatsigClient.kt", m20657l = {974}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ C16525B $stableID;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, C16525B c16525b, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$stableID = c16525b;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$stableID, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    StatsigClient statsigClient = this.this$0;
                    String str = (String) this.$stableID.f51262Y;
                    this.label = 1;
                    if (statsigClient.saveStringToSharedPrefs$build_release("STABLE_ID", str, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127981(C16525B c16525b, InterfaceC18770c<? super C127981> interfaceC18770c) {
            super(2, interfaceC18770c);
            this.$stableID = c16525b;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C127981(this.$stableID, interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C127981) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                AbstractC0563B io2 = StatsigClient.this.dispatcherProvider.getIo();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StatsigClient.this, this.$stableID, null);
                this.label = 1;
                if (AbstractC0575H.m1168P(io2, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getParameterStore$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C127991 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16525B $paramStore;
        final /* synthetic */ String $parameterStoreName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127991(String str, C16525B c16525b) {
            super(0);
            this.$parameterStoreName = str;
            this.$paramStore = c16525b;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22546invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22546invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.addNonExposedCheck(this.$parameterStoreName);
            C16525B c16525b = this.$paramStore;
            Store store = StatsigClient.this.store;
            if (store != null) {
                c16525b.f51262Y = store.getParamStore(StatsigClient.this, this.$parameterStoreName);
            } else {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$getStableID$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128001 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ C16525B $result;
        final /* synthetic */ StatsigClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128001(C16525B c16525b, StatsigClient statsigClient) {
            super(0);
            this.$result = c16525b;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22547invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22547invoke() {
            C16525B c16525b = this.$result;
            StatsigMetadata statsigMetadata = this.this$0.statsigMetadata;
            if (statsigMetadata == null) {
                AbstractC16544l.m18103p("statsigMetadata");
                throw null;
            }
            String stableID = statsigMetadata.getStableID();
            if (stableID == null) {
                stableID = "";
            }
            c16525b.f51262Y = stableID;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initialize$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$initialize$2", m20656f = "StatsigClient.kt", m20657l = {132}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m18067d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;"}, m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128012 extends AbstractC19694j implements InterfaceC1436k {
        final /* synthetic */ Application $application;
        final /* synthetic */ StatsigOptions $options;
        final /* synthetic */ String $sdkKey;
        final /* synthetic */ StatsigUser $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128012(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, InterfaceC18770c<? super C128012> interfaceC18770c) {
            super(1, interfaceC18770c);
            this.$application = application;
            this.$sdkKey = str;
            this.$user = statsigUser;
            this.$options = statsigOptions;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128012(this.$application, this.$sdkKey, this.$user, this.$options, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigUser upVar = StatsigClient.this.setup(this.$application, this.$sdkKey, this.$user, this.$options);
                StatsigClient statsigClient = StatsigClient.this;
                this.label = 1;
                obj = statsigClient.setupAsync$build_release(upVar, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            InitializationDetails initializationDetails = (InitializationDetails) obj;
            initializationDetails.setDuration(System.currentTimeMillis() - StatsigClient.this.initTime);
            return initializationDetails;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
            return ((C128012) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initialize$3 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$initialize$3", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\u008a@"}, m18067d2 = {"<anonymous>", "Lcom/statsig/androidsdk/InitializationDetails;", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;"}, m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128023 extends AbstractC19694j implements InterfaceC1439n {
        /* synthetic */ Object L$0;
        int label;

        public C128023(InterfaceC18770c<? super C128023> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            C128023 c128023 = StatsigClient.this.new C128023(interfaceC18770c);
            c128023.L$0 = obj;
            return c128023;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Exception exc, InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
            return ((C128023) create(exc, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
            Exception exc = (Exception) this.L$0;
            StatsigClient.this.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            if (!StatsigClient.this.isInitialized()) {
                return null;
            }
            return new InitializationDetails(System.currentTimeMillis() - StatsigClient.this.initTime, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128031 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ Application $application;
        final /* synthetic */ IStatsigCallback $callback;
        final /* synthetic */ StatsigOptions $options;
        final /* synthetic */ String $sdkKey;
        final /* synthetic */ StatsigUser $user;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1", m20656f = "StatsigClient.kt", m20657l = {82, 86}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ IStatsigCallback $callback;
            final /* synthetic */ StatsigUser $normalizedUser;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$initializeAsync$1$1$1", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
            @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
            public static final class C222311 extends AbstractC19694j implements InterfaceC1439n {
                final /* synthetic */ IStatsigCallback $callback;
                final /* synthetic */ InitializationDetails $initDetails;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222311(IStatsigCallback iStatsigCallback, InitializationDetails initializationDetails, InterfaceC18770c<? super C222311> interfaceC18770c) {
                    super(2, interfaceC18770c);
                    this.$callback = iStatsigCallback;
                    this.$initDetails = initializationDetails;
                }

                @Override // sm.AbstractC19685a
                public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                    return new C222311(this.$callback, this.$initDetails, interfaceC18770c);
                }

                @Override // p049Bm.InterfaceC1439n
                public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                    return ((C222311) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
                }

                @Override // sm.AbstractC19685a
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigInitialize(this.$initDetails);
                        }
                        return C17296C.f55119a;
                    } catch (Exception e10) {
                        throw new ExternalException(e10.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$normalizedUser = statsigUser;
                this.$callback = iStatsigCallback;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$normalizedUser, this.$callback, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                StatsigClient statsigClient = this.this$0;
                StatsigUser statsigUser = this.$normalizedUser;
                this.label = 1;
                obj = statsigClient.setupAsync$build_release(statsigUser, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
                InitializationDetails initializationDetails = (InitializationDetails) obj;
                initializationDetails.setDuration(System.currentTimeMillis() - this.this$0.initTime);
                AbstractC0563B main = this.this$0.dispatcherProvider.getMain();
                C222311 c222311 = new C222311(this.$callback, initializationDetails, null);
                this.label = 2;
                if (AbstractC0575H.m1168P(main, c222311, this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128031(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, IStatsigCallback iStatsigCallback) {
            super(0);
            this.$application = application;
            this.$sdkKey = str;
            this.$user = statsigUser;
            this.$options = statsigOptions;
            this.$callback = iStatsigCallback;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22548invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22548invoke() {
            StatsigUser upVar = StatsigClient.this.setup(this.$application, this.$sdkKey, this.$user, this.$options);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, upVar, this.$callback, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$initializeAsync$2 */
    @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lmm/C;", "<anonymous>", "(Ljava/lang/Exception;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128042 extends AbstractC16546n implements InterfaceC1436k {
        final /* synthetic */ IStatsigCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128042(IStatsigCallback iStatsigCallback) {
            super(1);
            this.$callback = iStatsigCallback;
        }

        @Override // p049Bm.InterfaceC1436k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws ExternalException {
            invoke((Exception) obj);
            return C17296C.f55119a;
        }

        public final void invoke(Exception exc) throws ExternalException {
            StatsigClient.this.logEndDiagnosticsWhenException(ContextType.INITIALIZE, exc);
            if (StatsigClient.this.isInitialized()) {
                try {
                    InitializationDetails initializationDetails = new InitializationDetails(System.currentTimeMillis() - StatsigClient.this.initTime, false, new InitializeResponse.FailedInitializeResponse(InitializeFailReason.InternalError, exc, null, 4, null));
                    IStatsigCallback iStatsigCallback = this.$callback;
                    if (iStatsigCallback == null) {
                        return;
                    }
                    iStatsigCallback.onStatsigInitialize(initializationDetails);
                } catch (Exception e10) {
                    throw new ExternalException(e10.getMessage());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEndDiagnosticsWhenException$3 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$logEndDiagnosticsWhenException$3", m20656f = "StatsigClient.kt", m20657l = {1074}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128053 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128053(InterfaceC18770c<? super C128053> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128053(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128053) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    AbstractC16544l.m18103p("logger");
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128061 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ Double $value;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$1$2, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$logEvent$1$2", m20656f = "StatsigClient.kt", m20657l = {378}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass2 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(StatsigClient statsigClient, LogEvent logEvent, InterfaceC18770c<? super AnonymousClass2> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass2(this.this$0, this.$event, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass2) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        AbstractC16544l.m18103p("logger");
                        throw null;
                    }
                    LogEvent logEvent = this.$event;
                    this.label = 1;
                    if (statsigLogger.log(logEvent, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128061(String str, Double d10, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            this.$eventName = str;
            this.$value = d10;
            this.$metadata = map;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22549invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22549invoke() {
            LogEvent logEvent = new LogEvent(this.$eventName);
            logEvent.setValue(this.$value);
            logEvent.setMetadata(this.$metadata);
            StatsigUser statsigUser = this.this$0.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            if (!this.this$0.getOptions$build_release().getDisableCurrentActivityLogging()) {
                StatsigActivityLifecycleListener statsigActivityLifecycleListener = this.this$0.lifecycleListener;
                if (statsigActivityLifecycleListener == null) {
                    AbstractC16544l.m18103p("lifecycleListener");
                    throw null;
                }
                Activity currentActivity = statsigActivityLifecycleListener.getCurrentActivity();
                if (currentActivity != null) {
                    logEvent.setStatsigMetadata(AbstractC17660E.m19258c(new C17309l("currentPage", currentActivity.getClass().getSimpleName())));
                }
            }
            InterfaceC0571F interfaceC0571F = this.this$0.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass2(this.this$0, logEvent, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128072 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ String $value;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$logEvent$2$1", m20656f = "StatsigClient.kt", m20657l = {399}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$event, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        AbstractC16544l.m18103p("logger");
                        throw null;
                    }
                    LogEvent logEvent = this.$event;
                    this.label = 1;
                    if (statsigLogger.log(logEvent, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128072(String str, String str2, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            this.$eventName = str;
            this.$value = str2;
            this.$metadata = map;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22550invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22550invoke() {
            LogEvent logEvent = new LogEvent(this.$eventName);
            logEvent.setValue(this.$value);
            logEvent.setMetadata(this.$metadata);
            StatsigUser statsigUser = this.this$0.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            InterfaceC0571F interfaceC0571F = this.this$0.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(this.this$0, logEvent, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128083 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $eventName;
        final /* synthetic */ Map<String, String> $metadata;
        final /* synthetic */ StatsigClient this$0;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$logEvent$3$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$logEvent$3$1", m20656f = "StatsigClient.kt", m20657l = {419}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ LogEvent $event;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, LogEvent logEvent, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$event = logEvent;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$event, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    StatsigLogger statsigLogger = this.this$0.logger;
                    if (statsigLogger == null) {
                        AbstractC16544l.m18103p("logger");
                        throw null;
                    }
                    LogEvent logEvent = this.$event;
                    this.label = 1;
                    if (statsigLogger.log(logEvent, this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128083(String str, Map<String, String> map, StatsigClient statsigClient) {
            super(0);
            this.$eventName = str;
            this.$metadata = map;
            this.this$0 = statsigClient;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22551invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22551invoke() {
            LogEvent logEvent = new LogEvent(this.$eventName);
            logEvent.setValue(null);
            logEvent.setMetadata(this.$metadata);
            StatsigUser statsigUser = this.this$0.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            logEvent.setUser(statsigUser);
            InterfaceC0571F interfaceC0571F = this.this$0.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(this.this$0, logEvent, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogConfigExposure$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128091 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128091(String str) {
            super(0);
            this.$configName = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22552invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22552invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigClient.this.logExposure(this.$configName, store.getConfig(this.$configName), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogExperimentExposure$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128101 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;
        final /* synthetic */ boolean $keepDeviceValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128101(String str, boolean z6) {
            super(0);
            this.$configName = str;
            this.$keepDeviceValue = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22553invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22553invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigClient.this.logExposure(this.$configName, store.getExperiment(this.$configName, this.$keepDeviceValue), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogGateExposure$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128111 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128111(String str) {
            super(0);
            this.$gateName = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22554invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22554invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigClient.this.logExposure(this.$gateName, store.checkGate(this.$gateName), true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$manuallyLogLayerParameterExposure$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128121 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ boolean $keepDeviceValue;
        final /* synthetic */ String $layerName;
        final /* synthetic */ String $parameterName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128121(String str, boolean z6, String str2) {
            super(0);
            this.$layerName = str;
            this.$keepDeviceValue = z6;
            this.$parameterName = str2;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22555invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22555invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigClient.this.logLayerParameterExposure$build_release(store.getLayer(null, this.$layerName, this.$keepDeviceValue), this.$parameterName, true);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$onAppBlur$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$onAppBlur$1", m20656f = "StatsigClient.kt", m20657l = {1093}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128131 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128131(InterfaceC18770c<? super C128131> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128131(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128131) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigLogger statsigLogger = StatsigClient.this.logger;
                if (statsigLogger == null) {
                    AbstractC16544l.m18103p("logger");
                    throw null;
                }
                this.label = 1;
                if (statsigLogger.flush(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$onAppFocus$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$onAppFocus$1", m20656f = "StatsigClient.kt", m20657l = {1087}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128141 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128141(InterfaceC18770c<? super C128141> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128141(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128141) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigNetwork statsigNetwork$build_release = StatsigClient.this.getStatsigNetwork$build_release();
                String eventLoggingAPI = StatsigClient.this.getOptions$build_release().getEventLoggingAPI();
                this.label = 1;
                if (statsigNetwork$build_release.apiRetryFailedLogs(eventLoggingAPI, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$openDebugView$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128151 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ InterfaceC1436k $callback;
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128151(Context context, InterfaceC1436k interfaceC1436k) {
            super(0);
            this.$context = context;
            this.$callback = interfaceC1436k;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22556invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22556invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            C17309l c17309l = new C17309l("values", store.getCurrentValuesAsString());
            Store store2 = StatsigClient.this.store;
            if (store2 == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            C17309l c17309l2 = new C17309l("evalReason", store2.getReason());
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            Map<String, ? extends Object> mapM19244f = AbstractC17659D.m19244f(c17309l, c17309l2, new C17309l("user", statsigUser.getCopyForEvaluation$build_release()), new C17309l("options", StatsigClient.this.getOptions$build_release().toMap$build_release()));
            DebugView.Companion companion = DebugView.INSTANCE;
            Context context = this.$context;
            String str = StatsigClient.this.sdkKey;
            if (str != null) {
                companion.show(context, str, mapM19244f, this.$callback);
            } else {
                AbstractC16544l.m18103p("sdkKey");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128161 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;
        final /* synthetic */ Map<String, Object> $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideConfig$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$overrideConfig$1$1", m20656f = "StatsigClient.kt", m20657l = {587}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128161(String str, Map<String, ? extends Object> map) {
            super(0);
            this.$configName = str;
            this.$value = map;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22557invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22557invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            store.overrideConfig(this.$configName, this.$value);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128171 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $gateName;
        final /* synthetic */ boolean $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideGate$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$overrideGate$1$1", m20656f = "StatsigClient.kt", m20657l = {574}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128171(String str, boolean z6) {
            super(0);
            this.$gateName = str;
            this.$value = z6;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22558invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22558invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            store.overrideGate(this.$gateName, this.$value);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128181 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $configName;
        final /* synthetic */ Map<String, Object> $value;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$overrideLayer$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$overrideLayer$1$1", m20656f = "StatsigClient.kt", m20657l = {600}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128181(String str, Map<String, ? extends Object> map) {
            super(0);
            this.$configName = str;
            this.$value = map;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22559invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22559invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            store.overrideLayer(this.$configName, this.$value);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$pollForUpdates$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$pollForUpdates$1", m20656f = "StatsigClient.kt", m20657l = {1010}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "it", "Lmm/C;", "<anonymous>", "(Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128191 extends AbstractC19694j implements InterfaceC1439n {
        /* synthetic */ Object L$0;
        int label;

        public C128191(InterfaceC18770c<? super C128191> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            C128191 c128191 = StatsigClient.this.new C128191(interfaceC18770c);
            c128191.L$0 = obj;
            return c128191;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128191) create(successfulInitializeResponse, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) this.L$0;
                if (AbstractC16544l.m18089b(successfulInitializeResponse == null ? null : Boolean.valueOf(successfulInitializeResponse.getHasUpdates()), Boolean.TRUE)) {
                    Store store = StatsigClient.this.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    StatsigUser statsigUser = StatsigClient.this.user;
                    if (statsigUser == null) {
                        AbstractC16544l.m18103p("user");
                        throw null;
                    }
                    this.label = 1;
                    if (store.save(successfulInitializeResponse, statsigUser, this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCache$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$refreshCache$2", m20656f = "StatsigClient.kt", m20657l = {521}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128202 extends AbstractC19694j implements InterfaceC1436k {
        int label;

        public C128202(InterfaceC18770c<? super C128202> interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128202(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
                StatsigClient statsigClient = StatsigClient.this;
                this.label = 1;
                if (statsigClient.updateUserImpl(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128202) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128212 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ IStatsigCallback $callback;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1", m20656f = "StatsigClient.kt", m20657l = {500, 501}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ IStatsigCallback $callback;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$refreshCacheAsync$2$1$1", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
            @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
            public static final class C222321 extends AbstractC19694j implements InterfaceC1439n {
                final /* synthetic */ IStatsigCallback $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222321(IStatsigCallback iStatsigCallback, InterfaceC18770c<? super C222321> interfaceC18770c) {
                    super(2, interfaceC18770c);
                    this.$callback = iStatsigCallback;
                }

                @Override // sm.AbstractC19685a
                public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                    return new C222321(this.$callback, interfaceC18770c);
                }

                @Override // p049Bm.InterfaceC1439n
                public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                    return ((C222321) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
                }

                @Override // sm.AbstractC19685a
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigUpdateUser();
                        }
                        return C17296C.f55119a;
                    } catch (Exception e10) {
                        throw new ExternalException(e10.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$callback = iStatsigCallback;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$callback, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                StatsigClient statsigClient = this.this$0;
                this.label = 1;
                if (statsigClient.updateUserImpl(this) == enumC19250a) {
                    return enumC19250a;
                }
                AbstractC0563B main = this.this$0.dispatcherProvider.getMain();
                C222321 c222321 = new C222321(this.$callback, null);
                this.label = 2;
                if (AbstractC0575H.m1168P(main, c222321, this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128212(IStatsigCallback iStatsigCallback) {
            super(0);
            this.$callback = iStatsigCallback;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22560invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22560invoke() {
            Diagnostics diagnostics = StatsigClient.this.diagnostics;
            if (diagnostics == null) {
                AbstractC16544l.m18103p("diagnostics");
                throw null;
            }
            Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, ContextType.UPDATE_USER, 6, null);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, this.$callback, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128221 extends AbstractC16546n implements InterfaceC1426a {

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$removeAllOverrides$1$1", m20656f = "StatsigClient.kt", m20657l = {624}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        public C128221() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22561invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22561invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            store.removeAllOverrides();
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128231 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ String $name;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$removeOverride$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$removeOverride$1$1", m20656f = "StatsigClient.kt", m20657l = {612}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    Store store = this.this$0.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    this.label = 1;
                    if (store.saveOverridesToLocalStorage(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128231(String str) {
            super(0);
            this.$name = str;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22562invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22562invoke() {
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(YladLSetV.NiLPvjJTcUhYAU);
                throw null;
            }
            store.removeOverride(this.$name);
            InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$resetUser$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128241 extends AbstractC16546n implements InterfaceC1426a {
        public C128241() {
            super(0);
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22563invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22563invoke() {
            StatsigLogger statsigLogger = StatsigClient.this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.onUpdateUser();
            InterfaceC0627n0 interfaceC0627n0 = StatsigClient.this.pollingJob;
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            Store store = StatsigClient.this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser != null) {
                store.resetUser(statsigUser);
            } else {
                AbstractC16544l.m18103p("user");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdown$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$shutdown$1", m20656f = "StatsigClient.kt", m20657l = {553}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128271 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdown$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$shutdown$1$1", m20656f = "StatsigClient.kt", m20657l = {554}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9233X.m9807c(obj);
                    StatsigClient statsigClient = this.this$0;
                    this.label = 1;
                    if (statsigClient.shutdownSuspend(this) == enumC19250a) {
                        return enumC19250a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                }
                return C17296C.f55119a;
            }
        }

        public C128271(InterfaceC18770c<? super C128271> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128271(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128271) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C3516e c3516e = AbstractC0593T.f1824a;
                C1451e c1451e = AbstractC2935m.f8797a.f3819q0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StatsigClient.this, null);
                this.label = 1;
                if (AbstractC0575H.m1168P(c1451e, anonymousClass1, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdownImpl$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient", m20656f = "StatsigClient.kt", m20657l = {1040}, m20658m = "shutdownImpl")
    @Metadata(m18068k = 3, m18069mv = {1, 5, 1}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class C128281 extends AbstractC19687c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C128281(InterfaceC18770c<? super C128281> interfaceC18770c) {
            super(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StatsigClient.this.shutdownImpl(this);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$shutdownSuspend$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$shutdownSuspend$2", m20656f = "StatsigClient.kt", m20657l = {542}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128292 extends AbstractC19694j implements InterfaceC1436k {
        int label;

        public C128292(InterfaceC18770c<? super C128292> interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128292(interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                StatsigClient statsigClient = StatsigClient.this;
                this.label = 1;
                if (statsigClient.shutdownImpl(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128292) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateStickyValues$1 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateStickyValues$1", m20656f = "StatsigClient.kt", m20657l = {964}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128301 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        public C128301(InterfaceC18770c<? super C128301> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128301(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128301) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                Store store = StatsigClient.this.store;
                if (store == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                this.label = 1;
                if (store.persistStickyValues(this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUser$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUser$2", m20656f = "StatsigClient.kt", m20657l = {481}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128312 extends AbstractC19694j implements InterfaceC1436k {
        final /* synthetic */ StatsigUser $user;
        final /* synthetic */ Map<String, Object> $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128312(StatsigUser statsigUser, Map<String, ? extends Object> map, InterfaceC18770c<? super C128312> interfaceC18770c) {
            super(1, interfaceC18770c);
            this.$user = statsigUser;
            this.$values = map;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128312(this.$user, this.$values, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                Diagnostics diagnostics = StatsigClient.this.diagnostics;
                if (diagnostics == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                KeyType keyType = KeyType.OVERALL;
                ContextType contextType = ContextType.UPDATE_USER;
                Diagnostics.markStart$default(diagnostics, keyType, null, null, contextType, 6, null);
                StatsigClient statsigClient = StatsigClient.this;
                statsigClient.user = statsigClient.normalizeUser(this.$user);
                StatsigClient.this.resetUser();
                if (this.$values != null) {
                    Store store = StatsigClient.this.store;
                    if (store == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    Map<String, ? extends Object> map = this.$values;
                    StatsigUser statsigUser = StatsigClient.this.user;
                    if (statsigUser == null) {
                        AbstractC16544l.m18103p("user");
                        throw null;
                    }
                    store.bootstrap(map, statsigUser);
                    StatsigClient.this.logEndDiagnostics(true, contextType, null);
                } else {
                    Store store2 = StatsigClient.this.store;
                    if (store2 == null) {
                        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                        throw null;
                    }
                    store2.loadCacheForCurrentUser();
                    StatsigClient statsigClient2 = StatsigClient.this;
                    this.label = 1;
                    if (statsigClient2.updateUserImpl(this) == enumC19250a) {
                        return enumC19250a;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128312) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128321 extends AbstractC16546n implements InterfaceC1426a {
        final /* synthetic */ IStatsigCallback $callback;
        final /* synthetic */ StatsigUser $user;
        final /* synthetic */ Map<String, Object> $values;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1", m20656f = "StatsigClient.kt", m20657l = {450, 451}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {
            final /* synthetic */ IStatsigCallback $callback;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1, reason: invalid class name and collision with other inner class name */
            @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUserAsync$1$1$1", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
            @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
            public static final class C222331 extends AbstractC19694j implements InterfaceC1439n {
                final /* synthetic */ IStatsigCallback $callback;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C222331(IStatsigCallback iStatsigCallback, InterfaceC18770c<? super C222331> interfaceC18770c) {
                    super(2, interfaceC18770c);
                    this.$callback = iStatsigCallback;
                }

                @Override // sm.AbstractC19685a
                public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                    return new C222331(this.$callback, interfaceC18770c);
                }

                @Override // p049Bm.InterfaceC1439n
                public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                    return ((C222331) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
                }

                @Override // sm.AbstractC19685a
                public final Object invokeSuspend(Object obj) throws ExternalException {
                    EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9233X.m9807c(obj);
                    try {
                        IStatsigCallback iStatsigCallback = this.$callback;
                        if (iStatsigCallback != null) {
                            iStatsigCallback.onStatsigUpdateUser();
                        }
                        return C17296C.f55119a;
                    } catch (Exception e10) {
                        throw new ExternalException(e10.getMessage());
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
                this.$callback = iStatsigCallback;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, this.$callback, interfaceC18770c);
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC9233X.m9807c(obj);
                    }
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                StatsigClient statsigClient = this.this$0;
                this.label = 1;
                if (statsigClient.updateUserImpl(this) == enumC19250a) {
                    return enumC19250a;
                }
                AbstractC0563B main = this.this$0.dispatcherProvider.getMain();
                C222331 c222331 = new C222331(this.$callback, null);
                this.label = 2;
                if (AbstractC0575H.m1168P(main, c222331, this) == enumC19250a) {
                    return enumC19250a;
                }
                return C17296C.f55119a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128321(StatsigUser statsigUser, Map<String, ? extends Object> map, IStatsigCallback iStatsigCallback) {
            super(0);
            this.$user = statsigUser;
            this.$values = map;
            this.$callback = iStatsigCallback;
        }

        @Override // p049Bm.InterfaceC1426a
        public /* bridge */ /* synthetic */ Object invoke() {
            m22564invoke();
            return C17296C.f55119a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m22564invoke() {
            Diagnostics diagnostics = StatsigClient.this.diagnostics;
            if (diagnostics == null) {
                AbstractC16544l.m18103p("diagnostics");
                throw null;
            }
            KeyType keyType = KeyType.OVERALL;
            ContextType contextType = ContextType.UPDATE_USER;
            Diagnostics.markStart$default(diagnostics, keyType, null, null, contextType, 6, null);
            StatsigClient statsigClient = StatsigClient.this;
            statsigClient.user = statsigClient.normalizeUser(this.$user);
            StatsigClient.this.resetUser();
            if (this.$values == null) {
                Store store = StatsigClient.this.store;
                if (store == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                store.loadCacheForCurrentUser();
                InterfaceC0571F interfaceC0571F = StatsigClient.this.statsigScope;
                if (interfaceC0571F != null) {
                    AbstractC0575H.m1156D(interfaceC0571F, null, null, new AnonymousClass1(StatsigClient.this, this.$callback, null), 3);
                    return;
                } else {
                    AbstractC16544l.m18103p("statsigScope");
                    throw null;
                }
            }
            Store store2 = StatsigClient.this.store;
            if (store2 == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            Map<String, ? extends Object> map = this.$values;
            StatsigUser statsigUser = StatsigClient.this.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            store2.bootstrap(map, statsigUser);
            StatsigClient.this.logEndDiagnostics(true, contextType, null);
            IStatsigCallback iStatsigCallback = this.$callback;
            if (iStatsigCallback == null) {
                return;
            }
            iStatsigCallback.onStatsigUpdateUser();
        }
    }

    /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2 */
    @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2", m20656f = "StatsigClient.kt", m20657l = {881}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
    public static final class C128332 extends AbstractC19694j implements InterfaceC1439n {
        int label;

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$1", m20656f = "StatsigClient.kt", m20657l = {885, 902}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1436k {
            Object L$0;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass1> interfaceC18770c) {
                super(1, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(InterfaceC18770c<?> interfaceC18770c) {
                return new AnonymousClass1(this.this$0, interfaceC18770c);
            }

            /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:49:0x010a  */
            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                Object objInitialize;
                InitializeResponse initializeResponse;
                Diagnostics diagnostics;
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC9233X.m9807c(obj);
                        objInitialize = obj;
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        initializeResponse = (InitializeResponse) this.L$0;
                        AbstractC9233X.m9807c(obj);
                    }
                    diagnostics = this.this$0.diagnostics;
                    if (diagnostics != null) {
                        AbstractC16544l.m18103p("diagnostics");
                        throw null;
                    }
                    diagnostics.markEnd(KeyType.INITIALIZE, true, (8 & 4) != 0 ? null : StepType.PROCESS, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : ContextType.UPDATE_USER);
                    this.this$0.pollForUpdates();
                    this.this$0.logEndDiagnostics(initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse, ContextType.UPDATE_USER, initializeResponse);
                    return C17296C.f55119a;
                }
                AbstractC9233X.m9807c(obj);
                Store store = this.this$0.store;
                if (store == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                StatsigUser statsigUser = this.this$0.user;
                if (statsigUser == null) {
                    AbstractC16544l.m18103p("user");
                    throw null;
                }
                Long lastUpdateTime = store.getLastUpdateTime(statsigUser);
                Store store2 = this.this$0.store;
                if (store2 == null) {
                    AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                    throw null;
                }
                StatsigUser statsigUser2 = this.this$0.user;
                if (statsigUser2 == null) {
                    AbstractC16544l.m18103p("user");
                    throw null;
                }
                Map<String, String> previousDerivedFields = store2.getPreviousDerivedFields(statsigUser2);
                StatsigNetwork statsigNetwork$build_release = this.this$0.getStatsigNetwork$build_release();
                String api = this.this$0.getOptions$build_release().getApi();
                StatsigUser statsigUser3 = this.this$0.user;
                if (statsigUser3 == null) {
                    AbstractC16544l.m18103p("user");
                    throw null;
                }
                StatsigMetadata statsigMetadata = this.this$0.statsigMetadata;
                if (statsigMetadata == null) {
                    AbstractC16544l.m18103p("statsigMetadata");
                    throw null;
                }
                InterfaceC0571F interfaceC0571F = this.this$0.statsigScope;
                if (interfaceC0571F == null) {
                    AbstractC16544l.m18103p("statsigScope");
                    throw null;
                }
                ContextType contextType = ContextType.UPDATE_USER;
                Diagnostics diagnostics2 = this.this$0.diagnostics;
                if (diagnostics2 == null) {
                    AbstractC16544l.m18103p("diagnostics");
                    throw null;
                }
                HashAlgorithm hashAlgorithm = AbstractC16544l.m18089b(this.this$0.getOptions$build_release().getDisableHashing(), Boolean.TRUE) ? HashAlgorithm.NONE : HashAlgorithm.DJB2;
                this.label = 1;
                objInitialize = statsigNetwork$build_release.initialize(api, statsigUser3, lastUpdateTime, statsigMetadata, interfaceC0571F, contextType, diagnostics2, hashAlgorithm, previousDerivedFields, this);
                if (objInitialize == enumC19250a) {
                    return enumC19250a;
                }
                initializeResponse = (InitializeResponse) objInitialize;
                if (initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse) {
                    InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (InitializeResponse.SuccessfulInitializeResponse) initializeResponse;
                    if (successfulInitializeResponse.getHasUpdates()) {
                        Diagnostics diagnostics3 = this.this$0.diagnostics;
                        if (diagnostics3 == null) {
                            AbstractC16544l.m18103p("diagnostics");
                            throw null;
                        }
                        Diagnostics.markStart$default(diagnostics3, KeyType.INITIALIZE, StepType.PROCESS, null, ContextType.UPDATE_USER, 4, null);
                        Store store3 = this.this$0.store;
                        if (store3 == null) {
                            AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                            throw null;
                        }
                        StatsigUser statsigUser4 = this.this$0.user;
                        if (statsigUser4 == null) {
                            AbstractC16544l.m18103p("user");
                            throw null;
                        }
                        this.L$0 = initializeResponse;
                        this.label = 2;
                        if (store3.save(successfulInitializeResponse, statsigUser4, this) == enumC19250a) {
                            return enumC19250a;
                        }
                        diagnostics = this.this$0.diagnostics;
                        if (diagnostics != null) {
                            AbstractC16544l.m18103p("diagnostics");
                            throw null;
                        }
                        diagnostics.markEnd(KeyType.INITIALIZE, true, (8 & 4) != 0 ? null : StepType.PROCESS, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : ContextType.UPDATE_USER);
                    }
                }
                this.this$0.pollForUpdates();
                this.this$0.logEndDiagnostics(initializeResponse instanceof InitializeResponse.SuccessfulInitializeResponse, ContextType.UPDATE_USER, initializeResponse);
                return C17296C.f55119a;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass1) create(interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }
        }

        /* JADX INFO: renamed from: com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2, reason: invalid class name */
        @InterfaceC19689e(m20655c = "com.statsig.androidsdk.StatsigClient$updateUserImpl$2$2", m20656f = "StatsigClient.kt", m20657l = {}, m20658m = "invokeSuspend")
        @Metadata(m18066d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "it", "Lmm/C;", "<anonymous>", "(Ljava/lang/Exception;)V"}, m18068k = 3, m18069mv = {1, 5, 1})
        public static final class AnonymousClass2 extends AbstractC19694j implements InterfaceC1439n {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ StatsigClient this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(StatsigClient statsigClient, InterfaceC18770c<? super AnonymousClass2> interfaceC18770c) {
                super(2, interfaceC18770c);
                this.this$0 = statsigClient;
            }

            @Override // sm.AbstractC19685a
            public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, interfaceC18770c);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // p049Bm.InterfaceC1439n
            public final Object invoke(Exception exc, InterfaceC18770c<? super C17296C> interfaceC18770c) {
                return ((AnonymousClass2) create(exc, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
            }

            @Override // sm.AbstractC19685a
            public final Object invokeSuspend(Object obj) {
                EnumC19250a enumC19250a = EnumC19250a.f61036Y;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
                this.this$0.logEndDiagnosticsWhenException(ContextType.UPDATE_USER, (Exception) this.L$0);
                return C17296C.f55119a;
            }
        }

        public C128332(InterfaceC18770c<? super C128332> interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c<C17296C> create(Object obj, InterfaceC18770c<?> interfaceC18770c) {
            return StatsigClient.this.new C128332(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(InterfaceC0571F interfaceC0571F, InterfaceC18770c<? super C17296C> interfaceC18770c) {
            return ((C128332) create(interfaceC0571F, interfaceC18770c)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                ErrorBoundary errorBoundary = StatsigClient.this.getErrorBoundary();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(StatsigClient.this, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(StatsigClient.this, null);
                this.label = 1;
                if (errorBoundary.captureAsync(anonymousClass1, anonymousClass2, this) == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            return C17296C.f55119a;
        }
    }

    public static /* synthetic */ DynamicConfig getExperiment$default(StatsigClient statsigClient, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return statsigClient.getExperiment(str, z6);
    }

    public static /* synthetic */ DynamicConfig getExperimentWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return statsigClient.getExperimentWithExposureLoggingDisabled(str, z6);
    }

    public static /* synthetic */ Layer getLayer$default(StatsigClient statsigClient, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return statsigClient.getLayer(str, z6);
    }

    public static /* synthetic */ Layer getLayerWithExposureLoggingDisabled$default(StatsigClient statsigClient, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return statsigClient.getLayerWithExposureLoggingDisabled(str, z6);
    }

    private final String getLocalStorageStableID() {
        C16525B c16525b = new C16525B();
        String string = getSharedPrefs$build_release().getString("STABLE_ID", null);
        c16525b.f51262Y = string;
        if (string == null) {
            c16525b.f51262Y = UUID.randomUUID().toString();
            InterfaceC0571F interfaceC0571F = this.statsigScope;
            if (interfaceC0571F == null) {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C127981(c16525b, null), 3);
        }
        return (String) c16525b.f51262Y;
    }

    public static /* synthetic */ void getOptions$build_release$annotations() {
    }

    public static /* synthetic */ void getStatsigNetwork$build_release$annotations() {
    }

    public static /* synthetic */ Object initialize$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        StatsigOptions statsigOptions2;
        StatsigUser statsigUser2 = (i10 & 4) != 0 ? null : statsigUser;
        if ((i10 & 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, null, null, null, false, false, 65535, null);
        } else {
            statsigOptions2 = statsigOptions;
        }
        return statsigClient.initialize(application, str, statsigUser2, statsigOptions2, interfaceC18770c);
    }

    public static /* synthetic */ void initializeAsync$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, StatsigOptions statsigOptions, int i10, Object obj) {
        StatsigOptions statsigOptions2;
        StatsigUser statsigUser2 = (i10 & 4) != 0 ? null : statsigUser;
        IStatsigCallback iStatsigCallback2 = (i10 & 8) != 0 ? null : iStatsigCallback;
        if ((i10 & 16) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, null, null, null, false, false, 65535, null);
        } else {
            statsigOptions2 = statsigOptions;
        }
        statsigClient.initializeAsync(application, str, statsigUser2, iStatsigCallback2, statsigOptions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnostics(boolean success, ContextType context, InitializeResponse initResponse) {
        Diagnostics diagnostics = this.diagnostics;
        if (diagnostics == null) {
            AbstractC16544l.m18103p("diagnostics");
            throw null;
        }
        KeyType keyType = KeyType.OVERALL;
        Store store = this.store;
        if (store == null) {
            AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
            throw null;
        }
        diagnostics.markEnd(keyType, success, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, store.getGlobalEvaluationDetails$build_release(), initResponse instanceof InitializeResponse.FailedInitializeResponse ? Diagnostics.INSTANCE.formatFailedResponse((InitializeResponse.FailedInitializeResponse) initResponse) : null, null, null, null, 950271, null), (8 & 16) != 0 ? null : context);
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger != null) {
            statsigLogger.logDiagnostics(context);
        } else {
            AbstractC16544l.m18103p("logger");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logEndDiagnosticsWhenException(ContextType context, Exception e10) {
        try {
            Diagnostics diagnostics = this.diagnostics;
            if (diagnostics == null || this.logger == null) {
                return;
            }
            KeyType keyType = KeyType.OVERALL;
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) (e10 == null ? null : e10.getClass().getName()));
            sb2.append(": ");
            sb2.append((Object) (e10 == null ? null : e10.getMessage()));
            diagnostics.markEnd(keyType, false, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Marker.ErrorMessage(sb2.toString(), null, null, 6, null), null, null, null, 983039, null), (8 & 16) != 0 ? null : context);
            StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            statsigLogger.logDiagnostics(context);
            InterfaceC0571F interfaceC0571F = this.statsigScope;
            if (interfaceC0571F != null) {
                AbstractC0575H.m1156D(interfaceC0571F, null, null, new C128053(null), 3);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, Double d10, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, d10, (Map<String, String>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(String name, DynamicConfig config, boolean isManual) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            AbstractC16544l.m18103p("logger");
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(name, config, statsigUser, isManual);
        } else {
            AbstractC16544l.m18103p("user");
            throw null;
        }
    }

    public static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, DynamicConfig dynamicConfig, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        statsigClient.logExposure(str, dynamicConfig, z6);
    }

    public static /* synthetic */ void logLayerParameterExposure$build_release$default(StatsigClient statsigClient, Layer layer, String str, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        statsigClient.logLayerParameterExposure$build_release(layer, str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatsigUser normalizeUser(StatsigUser user) {
        StatsigUser statsigUser = new StatsigUser(null);
        if (user != null) {
            statsigUser = user.getCopyForEvaluation$build_release();
        }
        statsigUser.setStatsigEnvironment$build_release(getOptions$build_release().getEnvironment());
        InterfaceC1436k userObjectValidator = getOptions$build_release().getUserObjectValidator();
        if (userObjectValidator != null) {
            userObjectValidator.invoke(statsigUser);
        }
        return statsigUser;
    }

    public static /* synthetic */ void openDebugView$default(StatsigClient statsigClient, Context context, InterfaceC1436k interfaceC1436k, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC1436k = null;
        }
        statsigClient.openDebugView(context, interfaceC1436k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollForUpdates() {
        if (getOptions$build_release().getEnableAutoValueUpdate()) {
            InterfaceC0627n0 interfaceC0627n0 = this.pollingJob;
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            Store store = this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigUser statsigUser = this.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            Long lastUpdateTime = store.getLastUpdateTime(statsigUser);
            StatsigNetwork statsigNetwork$build_release = getStatsigNetwork$build_release();
            String api = getOptions$build_release().getApi();
            StatsigUser statsigUser2 = this.user;
            if (statsigUser2 == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            StatsigMetadata statsigMetadata = this.statsigMetadata;
            if (statsigMetadata == null) {
                AbstractC16544l.m18103p("statsigMetadata");
                throw null;
            }
            C1970n c1970n = new C1970n(statsigNetwork$build_release.pollForChanges(api, statsigUser2, lastUpdateTime, statsigMetadata), 5, new C128191(null));
            InterfaceC0571F interfaceC0571F = this.statsigScope;
            if (interfaceC0571F != null) {
                this.pollingJob = AbstractC2124C.m3226y(c1970n, interfaceC0571F);
            } else {
                AbstractC16544l.m18103p("statsigScope");
                throw null;
            }
        }
    }

    private final void populateStatsigMetadata() {
        StatsigMetadata statsigMetadata = this.statsigMetadata;
        if (statsigMetadata == null) {
            AbstractC16544l.m18103p("statsigMetadata");
            throw null;
        }
        statsigMetadata.overrideStableID$build_release(getOptions$build_release().getOverrideStableID());
        try {
            Application application = this.application;
            if (application == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            if (application.getPackageManager() == null || getOptions$build_release().getOptOutNonSdkMetadata()) {
                return;
            }
            Application application2 = this.application;
            if (application2 == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            PackageManager packageManager = application2.getPackageManager();
            Application application3 = this.application;
            if (application3 == null) {
                AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
                throw null;
            }
            PackageInfo packageInfo = packageManager.getPackageInfo(application3.getPackageName(), 0);
            AbstractC16544l.m18093f(packageInfo, "application.packageManager.getPackageInfo(application.packageName, 0)");
            StatsigMetadata statsigMetadata2 = this.statsigMetadata;
            if (statsigMetadata2 == null) {
                AbstractC16544l.m18103p("statsigMetadata");
                throw null;
            }
            statsigMetadata2.setAppVersion(packageInfo.versionName);
            StatsigMetadata statsigMetadata3 = this.statsigMetadata;
            if (statsigMetadata3 != null) {
                statsigMetadata3.setAppIdentifier(packageInfo.packageName);
            } else {
                AbstractC16544l.m18103p("statsigMetadata");
                throw null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static /* synthetic */ Object refreshCacheAsync$default(StatsigClient statsigClient, IStatsigCallback iStatsigCallback, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iStatsigCallback = null;
        }
        return statsigClient.refreshCacheAsync(iStatsigCallback, interfaceC18770c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetUser() {
        ErrorBoundary.capture$default(this.errorBoundary, new C128241(), null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatsigUser setup(Application application, String sdkKey, StatsigUser user, StatsigOptions options) {
        if (!AbstractC21329w.m21734u(sdkKey, "client-", false) && !AbstractC21329w.m21734u(sdkKey, "test-", false)) {
            throw new IllegalArgumentException("Invalid SDK Key provided.  You must provide a client SDK Key from the API Key page of your Statsig console");
        }
        this.initTime = System.currentTimeMillis();
        Diagnostics diagnostics = new Diagnostics(options.getDisableDiagnosticsLogging());
        this.diagnostics = diagnostics;
        Diagnostics.markStart$default(diagnostics, KeyType.OVERALL, null, null, null, 14, null);
        this.application = application;
        this.sdkKey = sdkKey;
        setOptions$build_release(options);
        StatsigUser statsigUserNormalizeUser = normalizeUser(user);
        Map<String, ? extends Object> initializeValues = options.getInitializeValues();
        this.user = statsigUserNormalizeUser;
        if (this.statsigNetwork == null) {
            setStatsigNetwork$build_release(StatsigNetworkKt.StatsigNetwork(application, sdkKey, this.errorBoundary, getSharedPrefs$build_release(), options));
        }
        StatsigMetadata statsigMetadataCreateCoreStatsigMetadata = options.getOptOutNonSdkMetadata() ? StatsigMetadataKt.createCoreStatsigMetadata() : StatsigMetadataKt.createStatsigMetadata();
        this.statsigMetadata = statsigMetadataCreateCoreStatsigMetadata;
        ErrorBoundary errorBoundary = this.errorBoundary;
        if (statsigMetadataCreateCoreStatsigMetadata == null) {
            AbstractC16544l.m18103p("statsigMetadata");
            throw null;
        }
        errorBoundary.setMetadata(statsigMetadataCreateCoreStatsigMetadata);
        ErrorBoundary errorBoundary2 = this.errorBoundary;
        Diagnostics diagnostics2 = this.diagnostics;
        if (diagnostics2 == null) {
            AbstractC16544l.m18103p("diagnostics");
            throw null;
        }
        errorBoundary2.setDiagnostics(diagnostics2);
        this.exceptionHandler = this.errorBoundary.getExceptionHandler();
        InterfaceC18776i interfaceC18776iPlus = this.statsigJob.plus(this.dispatcherProvider.getMain());
        InterfaceC0567D interfaceC0567D = this.exceptionHandler;
        if (interfaceC0567D == null) {
            AbstractC16544l.m18103p("exceptionHandler");
            throw null;
        }
        C2925c c2925cM1174c = AbstractC0575H.m1174c(interfaceC18776iPlus.plus(interfaceC0567D));
        this.statsigScope = c2925cM1174c;
        this.store = new Store(c2925cM1174c, getSharedPrefs$build_release(), statsigUserNormalizeUser, sdkKey, options);
        this.initialized.set(true);
        this.lifecycleListener = new StatsigActivityLifecycleListener(application, this);
        InterfaceC0571F interfaceC0571F = this.statsigScope;
        if (interfaceC0571F == null) {
            AbstractC16544l.m18103p("statsigScope");
            throw null;
        }
        String eventLoggingAPI = options.getEventLoggingAPI();
        StatsigMetadata statsigMetadata = this.statsigMetadata;
        if (statsigMetadata == null) {
            AbstractC16544l.m18103p("statsigMetadata");
            throw null;
        }
        StatsigNetwork statsigNetwork$build_release = getStatsigNetwork$build_release();
        Diagnostics diagnostics3 = this.diagnostics;
        if (diagnostics3 == null) {
            AbstractC16544l.m18103p("diagnostics");
            throw null;
        }
        this.logger = new StatsigLogger(interfaceC0571F, sdkKey, eventLoggingAPI, statsigMetadata, statsigNetwork$build_release, statsigUserNormalizeUser, diagnostics3);
        populateStatsigMetadata();
        if (options.getOverrideStableID() == null) {
            String localStorageStableID = getLocalStorageStableID();
            StatsigMetadata statsigMetadata2 = this.statsigMetadata;
            if (statsigMetadata2 == null) {
                AbstractC16544l.m18103p("statsigMetadata");
                throw null;
            }
            statsigMetadata2.overrideStableID$build_release(localStorageStableID);
        }
        if (!getOptions$build_release().getLoadCacheAsync()) {
            Diagnostics diagnostics4 = this.diagnostics;
            if (diagnostics4 == null) {
                AbstractC16544l.m18103p("diagnostics");
                throw null;
            }
            KeyType keyType = KeyType.INITIALIZE;
            StepType stepType = StepType.LOAD_CACHE;
            Diagnostics.markStart$default(diagnostics4, keyType, stepType, new Marker(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.TRUE, 524287, null), null, 8, null);
            Store store = this.store;
            if (store == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            store.syncLoadFromLocalStorage();
            Diagnostics diagnostics5 = this.diagnostics;
            if (diagnostics5 == null) {
                AbstractC16544l.m18103p("diagnostics");
                throw null;
            }
            diagnostics5.markEnd(keyType, true, (8 & 4) != 0 ? null : stepType, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
        }
        if (initializeValues != null) {
            Store store2 = this.store;
            if (store2 == null) {
                AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
                throw null;
            }
            StatsigUser statsigUser = this.user;
            if (statsigUser == null) {
                AbstractC16544l.m18103p("user");
                throw null;
            }
            store2.bootstrap(initializeValues, statsigUser);
            this.isBootstrapped.set(true);
        }
        return statsigUserNormalizeUser;
    }

    public static /* synthetic */ StatsigUser setup$default(StatsigClient statsigClient, Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, int i10, Object obj) {
        StatsigOptions statsigOptions2;
        StatsigUser statsigUser2 = (i10 & 4) != 0 ? null : statsigUser;
        if ((i10 & 8) != 0) {
            statsigOptions2 = new StatsigOptions(null, null, false, false, 0L, false, null, false, null, false, null, null, null, null, false, false, 65535, null);
        } else {
            statsigOptions2 = statsigOptions;
        }
        return statsigClient.setup(application, str, statsigUser2, statsigOptions2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object shutdownImpl(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        C128281 c128281;
        StatsigClient statsigClient;
        if (interfaceC18770c instanceof C128281) {
            c128281 = (C128281) interfaceC18770c;
            int i10 = c128281.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c128281.label = i10 - Integer.MIN_VALUE;
            } else {
                c128281 = new C128281(interfaceC18770c);
            }
        } else {
            c128281 = new C128281(interfaceC18770c);
        }
        Object obj = c128281.result;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c128281.label;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            this.initialized.set(false);
            InterfaceC0627n0 interfaceC0627n0 = this.pollingJob;
            if (interfaceC0627n0 != null) {
                interfaceC0627n0.mo1275e(null);
            }
            StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            c128281.L$0 = this;
            c128281.label = 1;
            if (statsigLogger.shutdown(c128281) == enumC19250a) {
                return enumC19250a;
            }
            statsigClient = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            statsigClient = (StatsigClient) c128281.L$0;
            AbstractC9233X.m9807c(obj);
        }
        StatsigActivityLifecycleListener statsigActivityLifecycleListener = statsigClient.lifecycleListener;
        if (statsigActivityLifecycleListener == null) {
            AbstractC16544l.m18103p("lifecycleListener");
            throw null;
        }
        statsigActivityLifecycleListener.shutdown();
        statsigClient.isBootstrapped.set(false);
        statsigClient.setErrorBoundary$build_release(new ErrorBoundary());
        statsigClient.statsigJob = AbstractC0575H.m1176e();
        statsigClient.isInitializing.set(false);
        return C17296C.f55119a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStickyValues() {
        InterfaceC0571F interfaceC0571F = this.statsigScope;
        if (interfaceC0571F != null) {
            AbstractC0575H.m1156D(interfaceC0571F, this.dispatcherProvider.getIo(), null, new C128301(null), 2);
        } else {
            AbstractC16544l.m18103p("statsigScope");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateUser$default(StatsigClient statsigClient, StatsigUser statsigUser, Map map, InterfaceC18770c interfaceC18770c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        return statsigClient.updateUser(statsigUser, map, interfaceC18770c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUserAsync$default(StatsigClient statsigClient, StatsigUser statsigUser, IStatsigCallback iStatsigCallback, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iStatsigCallback = null;
        }
        if ((i10 & 4) != 0) {
            map = null;
        }
        statsigClient.updateUserAsync(statsigUser, iStatsigCallback, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateUserImpl(InterfaceC18770c<? super C17296C> interfaceC18770c) throws Throwable {
        Object objM1168P = AbstractC0575H.m1168P(this.dispatcherProvider.getIo(), new C128332(null), interfaceC18770c);
        return objM1168P == EnumC19250a.f61036Y ? objM1168P : C17296C.f55119a;
    }

    public final boolean checkGate(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        enforceInitialized$build_release("checkGate");
        C16525B c16525b = new C16525B();
        ErrorBoundary.capture$default(this.errorBoundary, new C127851(gateName, c16525b), "checkGate", null, gateName, 4, null);
        FeatureGate error = (FeatureGate) c16525b.f51262Y;
        if (error == null) {
            error = FeatureGate.INSTANCE.getError(gateName);
        }
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error.getValue();
    }

    public final boolean checkGateWithExposureLoggingDisabled(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        enforceInitialized$build_release("checkGateWithExposureLoggingDisabled");
        C16525B c16525b = new C16525B();
        ErrorBoundary.capture$default(this.errorBoundary, new C127861(gateName, c16525b), "checkGateWithExposureLoggingDisabled", null, gateName, 4, null);
        FeatureGate error = (FeatureGate) c16525b.f51262Y;
        if (error == null) {
            error = FeatureGate.INSTANCE.getError(gateName);
        }
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error.getValue();
    }

    public final void enforceInitialized$build_release(String functionName) {
        AbstractC16544l.m18094g(functionName, "functionName");
        if (!this.initialized.get()) {
            throw new IllegalStateException(AbstractC16544l.m18100m(functionName, "The SDK must be initialized prior to invoking "));
        }
    }

    public final Object flush(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        enforceInitialized$build_release("flush");
        return getErrorBoundary().captureAsync(new C127872(null), interfaceC18770c);
    }

    public final StatsigOverrides getAllOverrides() {
        C16525B c16525b = new C16525B();
        ErrorBoundary.capture$default(this.errorBoundary, new C127881(c16525b, this), null, null, null, 14, null);
        StatsigOverrides statsigOverrides = (StatsigOverrides) c16525b.f51262Y;
        return statsigOverrides == null ? StatsigOverrides.INSTANCE.empty() : statsigOverrides;
    }

    public final DynamicConfig getConfig(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        enforceInitialized$build_release("getConfig");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = DynamicConfig.INSTANCE.getError(configName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127891(c16525b, this, configName), "getConfig", null, configName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (DynamicConfig) c16525b.f51262Y;
    }

    public final DynamicConfig getConfigWithExposureLoggingDisabled(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        enforceInitialized$build_release("getConfigWithExposureLoggingDisabled");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = DynamicConfig.INSTANCE.getError(configName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127901(configName, c16525b), "getConfigWithExposureLoggingDisabled", null, configName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (DynamicConfig) c16525b.f51262Y;
    }

    /* JADX INFO: renamed from: getErrorBoundary$build_release, reason: from getter */
    public final ErrorBoundary getErrorBoundary() {
        return this.errorBoundary;
    }

    public final DynamicConfig getExperiment(String experimentName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        enforceInitialized$build_release("getExperiment");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = DynamicConfig.INSTANCE.getError(experimentName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127911(c16525b, this, experimentName, keepDeviceValue), "getExperiment", null, experimentName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (DynamicConfig) c16525b.f51262Y;
    }

    public final DynamicConfig getExperimentWithExposureLoggingDisabled(String experimentName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(experimentName, "experimentName");
        enforceInitialized$build_release("getExperimentWithExposureLoggingDisabled");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = DynamicConfig.INSTANCE.getError(experimentName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127921(experimentName, c16525b, keepDeviceValue), "getExperimentWithExposureLoggingDisabled", null, experimentName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (DynamicConfig) c16525b.f51262Y;
    }

    public final FeatureGate getFeatureGate(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        enforceInitialized$build_release("getFeatureGate");
        C16525B c16525b = new C16525B();
        ErrorBoundary.capture$default(this.errorBoundary, new C127931(gateName, c16525b), "getFeatureGate", null, gateName, 4, null);
        FeatureGate error = (FeatureGate) c16525b.f51262Y;
        if (error == null) {
            error = FeatureGate.INSTANCE.getError(gateName);
        }
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error;
    }

    public final FeatureGate getFeatureGateWithExposureLoggingDisabled(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        enforceInitialized$build_release("getFeatureGateWithExposureLoggingDisabled");
        C16525B c16525b = new C16525B();
        ErrorBoundary.capture$default(this.errorBoundary, new C127941(gateName, c16525b), "getFeatureGateWithExposureLoggingDisabled", null, gateName, 4, null);
        FeatureGate error = (FeatureGate) c16525b.f51262Y;
        if (error == null) {
            error = FeatureGate.INSTANCE.getError(gateName);
        }
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(error);
        }
        return error;
    }

    public final ExternalInitializeResponse getInitializeResponseJson() {
        C16525B c16525b = new C16525B();
        enforceInitialized$build_release("getInitializeResponseJson");
        ErrorBoundary.capture$default(this.errorBoundary, new C127951(c16525b, this), "getInitializeResponseJson", null, null, 12, null);
        ExternalInitializeResponse externalInitializeResponse = (ExternalInitializeResponse) c16525b.f51262Y;
        return externalInitializeResponse == null ? ExternalInitializeResponse.INSTANCE.getUninitialized() : externalInitializeResponse;
    }

    public final Layer getLayer(String layerName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        enforceInitialized$build_release("getLayer");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = Layer.INSTANCE.getError(layerName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127961(c16525b, this, layerName, keepDeviceValue), "getLayer", null, layerName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (Layer) c16525b.f51262Y;
    }

    public final Layer getLayerWithExposureLoggingDisabled(String layerName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        enforceInitialized$build_release("getLayerWithExposureLoggingDisabled");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = Layer.INSTANCE.getError(layerName);
        ErrorBoundary.capture$default(this.errorBoundary, new C127971(layerName, c16525b, keepDeviceValue), "getLayerWithExposureLoggingDisabled", null, layerName, 4, null);
        InterfaceC1436k evaluationCallback = getOptions$build_release().getEvaluationCallback();
        if (evaluationCallback != null) {
            evaluationCallback.invoke(c16525b.f51262Y);
        }
        return (Layer) c16525b.f51262Y;
    }

    public final StatsigOptions getOptions$build_release() {
        StatsigOptions statsigOptions = this.options;
        if (statsigOptions != null) {
            return statsigOptions;
        }
        AbstractC16544l.m18103p("options");
        throw null;
    }

    public final ParameterStore getParameterStore(String parameterStoreName) {
        AbstractC16544l.m18094g(parameterStoreName, "parameterStoreName");
        enforceInitialized$build_release("getParameterStore");
        C16525B c16525b = new C16525B();
        HashMap map = new HashMap();
        Store store = this.store;
        if (store == null) {
            AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
            throw null;
        }
        c16525b.f51262Y = new ParameterStore(this, map, Store.getEvaluationDetails$build_release$default(store, false, null, 2, null));
        ErrorBoundary.capture$default(this.errorBoundary, new C127991(parameterStoreName, c16525b), "getParameterStore", null, parameterStoreName, 4, null);
        return (ParameterStore) c16525b.f51262Y;
    }

    public final SharedPreferences getSharedPrefs$build_release() {
        Application application = this.application;
        if (application == null) {
            AbstractC16544l.m18103p(SIPServerTransaction.CONTENT_TYPE_APPLICATION);
            throw null;
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
        AbstractC16544l.m18093f(sharedPreferences, "application.getSharedPreferences(SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final String getStableID() {
        enforceInitialized$build_release("getStableID");
        C16525B c16525b = new C16525B();
        c16525b.f51262Y = "";
        ErrorBoundary.capture$default(this.errorBoundary, new C128001(c16525b, this), "getStableID", null, null, 12, null);
        return (String) c16525b.f51262Y;
    }

    public final StatsigNetwork getStatsigNetwork$build_release() {
        StatsigNetwork statsigNetwork = this.statsigNetwork;
        if (statsigNetwork != null) {
            return statsigNetwork;
        }
        AbstractC16544l.m18103p("statsigNetwork");
        throw null;
    }

    public final Store getStore$build_release() {
        Store store = this.store;
        if (store != null) {
            return store;
        }
        AbstractC16544l.m18103p(ProductResponseJsonKeys.STORE);
        throw null;
    }

    public final Object initialize(Application application, String str, StatsigUser statsigUser, StatsigOptions statsigOptions, InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
        if (this.isInitializing.getAndSet(true)) {
            return null;
        }
        getErrorBoundary().setKey(str);
        return getErrorBoundary().captureAsync(new C128012(application, str, statsigUser, statsigOptions, null), new C128023(null), interfaceC18770c);
    }

    public final void initializeAsync(Application application, String sdkKey, StatsigUser user, IStatsigCallback callback, StatsigOptions options) {
        AbstractC16544l.m18094g(application, "application");
        AbstractC16544l.m18094g(sdkKey, "sdkKey");
        AbstractC16544l.m18094g(options, "options");
        if (this.isInitializing.getAndSet(true)) {
            return;
        }
        this.errorBoundary.setKey(sdkKey);
        ErrorBoundary.capture$default(this.errorBoundary, new C128031(application, sdkKey, user, options, callback), null, new C128042(callback), null, 10, null);
    }

    public final boolean isInitialized() {
        return this.initialized.get();
    }

    public final void logEvent(String eventName, Double value, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new C128061(eventName, value, metadata, this), "logEvent", null, null, 12, null);
    }

    public final void logLayerParameterExposure$build_release(Layer layer, String parameterName, boolean isManual) {
        AbstractC16544l.m18094g(layer, "layer");
        AbstractC16544l.m18094g(parameterName, "parameterName");
        if (isInitialized()) {
            Map<String, String>[] undelegatedSecondaryExposures$build_release = layer.getUndelegatedSecondaryExposures$build_release();
            Set<String> explicitParameters$build_release = layer.getExplicitParameters$build_release();
            boolean zM18089b = AbstractC16544l.m18089b(explicitParameters$build_release == null ? null : Boolean.valueOf(explicitParameters$build_release.contains(parameterName)), Boolean.TRUE);
            String str = "";
            if (zM18089b) {
                undelegatedSecondaryExposures$build_release = layer.getSecondaryExposures$build_release();
                String allocatedExperimentName$build_release = layer.getAllocatedExperimentName();
                if (allocatedExperimentName$build_release != null) {
                    str = allocatedExperimentName$build_release;
                }
            }
            Map<String, String>[] mapArr = undelegatedSecondaryExposures$build_release;
            String str2 = str;
            StatsigLogger statsigLogger = this.logger;
            if (statsigLogger == null) {
                AbstractC16544l.m18103p("logger");
                throw null;
            }
            String name = layer.getName();
            String ruleID = layer.getRule();
            StatsigUser statsigUser = this.user;
            if (statsigUser != null) {
                statsigLogger.logLayerExposure(name, ruleID, mapArr, statsigUser, str2, parameterName, zM18089b, layer.getDetails(), isManual);
            } else {
                AbstractC16544l.m18103p("user");
                throw null;
            }
        }
    }

    public final void manuallyLogConfigExposure(String configName) {
        AbstractC16544l.m18094g(configName, "configName");
        enforceInitialized$build_release("logManualConfigExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new C128091(configName), "logManualConfigExposure", null, configName, 4, null);
    }

    public final void manuallyLogExperimentExposure(String configName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(configName, "configName");
        enforceInitialized$build_release("logManualExperimentExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new C128101(configName, keepDeviceValue), "logManualExperimentExposure", null, configName, 4, null);
    }

    public final void manuallyLogGateExposure(String gateName) {
        AbstractC16544l.m18094g(gateName, "gateName");
        enforceInitialized$build_release("logManualGateExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new C128111(gateName), "logManualGateExposure", null, gateName, 4, null);
    }

    public final void manuallyLogLayerParameterExposure(String layerName, String parameterName, boolean keepDeviceValue) {
        AbstractC16544l.m18094g(layerName, "layerName");
        AbstractC16544l.m18094g(parameterName, "parameterName");
        enforceInitialized$build_release("logManualLayerExposure");
        ErrorBoundary.capture$default(this.errorBoundary, new C128121(layerName, keepDeviceValue, parameterName), "logManualLayerExposure", null, layerName, 4, null);
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppBlur() {
        InterfaceC0571F interfaceC0571F = this.statsigScope;
        if (interfaceC0571F != null) {
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C128131(null), 3);
        } else {
            AbstractC16544l.m18103p("statsigScope");
            throw null;
        }
    }

    @Override // com.statsig.androidsdk.LifecycleEventListener
    public void onAppFocus() {
        if (getOptions$build_release().getDisableLogEventRetries()) {
            return;
        }
        InterfaceC0571F interfaceC0571F = this.statsigScope;
        if (interfaceC0571F != null) {
            AbstractC0575H.m1156D(interfaceC0571F, null, null, new C128141(null), 3);
        } else {
            AbstractC16544l.m18103p("statsigScope");
            throw null;
        }
    }

    public final void openDebugView(Context context, InterfaceC1436k callback) {
        AbstractC16544l.m18094g(context, "context");
        ErrorBoundary.capture$default(this.errorBoundary, new C128151(context, callback), null, null, null, 14, null);
    }

    public final void overrideConfig(String configName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(value, "value");
        ErrorBoundary.capture$default(this.errorBoundary, new C128161(configName, value), "overrideConfig", null, null, 12, null);
    }

    public final void overrideGate(String gateName, boolean value) {
        AbstractC16544l.m18094g(gateName, "gateName");
        ErrorBoundary.capture$default(this.errorBoundary, new C128171(gateName, value), "overrideGate", null, null, 12, null);
    }

    public final void overrideLayer(String configName, Map<String, ? extends Object> value) {
        AbstractC16544l.m18094g(configName, "configName");
        AbstractC16544l.m18094g(value, "value");
        ErrorBoundary.capture$default(this.errorBoundary, new C128181(configName, value), "overrideLayer", null, null, 12, null);
    }

    public final Object refreshCache(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        enforceInitialized$build_release("refreshCache");
        return getErrorBoundary().captureAsync(new C128202(null), interfaceC18770c);
    }

    public final Object refreshCacheAsync(IStatsigCallback iStatsigCallback, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        enforceInitialized$build_release("refreshCacheAsync");
        ErrorBoundary.capture$default(getErrorBoundary(), new C128212(iStatsigCallback), "refreshCacheAsync", null, null, 12, null);
        return C17296C.f55119a;
    }

    public final void removeAllOverrides() {
        ErrorBoundary.capture$default(this.errorBoundary, new C128221(), null, null, null, 14, null);
    }

    public final void removeOverride(String name) {
        AbstractC16544l.m18094g(name, "name");
        ErrorBoundary.capture$default(this.errorBoundary, new C128231(name), null, null, null, 14, null);
    }

    public final Object saveStringToSharedPrefs$build_release(String str, String str2, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        Object objSaveStringToSharedPrefs$build_release = StatsigUtil.INSTANCE.saveStringToSharedPrefs$build_release(getSharedPrefs$build_release(), str, str2, interfaceC18770c);
        return objSaveStringToSharedPrefs$build_release == EnumC19250a.f61036Y ? objSaveStringToSharedPrefs$build_release : C17296C.f55119a;
    }

    public final void setErrorBoundary$build_release(ErrorBoundary errorBoundary) {
        AbstractC16544l.m18094g(errorBoundary, "<set-?>");
        this.errorBoundary = errorBoundary;
    }

    public final void setOptions$build_release(StatsigOptions statsigOptions) {
        AbstractC16544l.m18094g(statsigOptions, "<set-?>");
        this.options = statsigOptions;
    }

    public final void setStatsigNetwork$build_release(StatsigNetwork statsigNetwork) {
        AbstractC16544l.m18094g(statsigNetwork, "<set-?>");
        this.statsigNetwork = statsigNetwork;
    }

    public final Object setupAsync$build_release(StatsigUser statsigUser, InterfaceC18770c<? super InitializationDetails> interfaceC18770c) {
        return AbstractC0575H.m1168P(this.dispatcherProvider.getIo(), new StatsigClient$setupAsync$2(this, statsigUser, null), interfaceC18770c);
    }

    public final void shutdown() throws Throwable {
        enforceInitialized$build_release("shutdown");
        AbstractC0575H.m1161I(C18777j.f59682Y, new C128271(null));
    }

    public final Object shutdownSuspend(InterfaceC18770c<? super C17296C> interfaceC18770c) {
        enforceInitialized$build_release("shutdownSuspend");
        return getErrorBoundary().captureAsync(new C128292(null), interfaceC18770c);
    }

    public final Object updateUser(StatsigUser statsigUser, Map<String, ? extends Object> map, InterfaceC18770c<? super C17296C> interfaceC18770c) {
        enforceInitialized$build_release("updateUser");
        return getErrorBoundary().captureAsync(new C128312(statsigUser, map, null), interfaceC18770c);
    }

    public final void updateUserAsync(StatsigUser user, IStatsigCallback callback, Map<String, ? extends Object> values) {
        enforceInitialized$build_release("updateUserAsync");
        ErrorBoundary.capture$default(this.errorBoundary, new C128321(user, values, callback), "updateUserAsync", null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logEvent$default(StatsigClient statsigClient, String str, String str2, Map map, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = null;
        }
        statsigClient.logEvent(str, str2, (Map<String, String>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logExposure(String name, FeatureGate gate, boolean isManual) {
        StatsigLogger statsigLogger = this.logger;
        if (statsigLogger == null) {
            AbstractC16544l.m18103p("logger");
            throw null;
        }
        StatsigUser statsigUser = this.user;
        if (statsigUser != null) {
            statsigLogger.logExposure(name, gate, statsigUser, isManual);
        } else {
            AbstractC16544l.m18103p("user");
            throw null;
        }
    }

    public static /* synthetic */ void logExposure$default(StatsigClient statsigClient, String str, FeatureGate featureGate, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        statsigClient.logExposure(str, featureGate, z6);
    }

    public final void logEvent(String eventName, String value, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        AbstractC16544l.m18094g(value, "value");
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new C128072(eventName, value, metadata, this), "logEvent", null, null, 12, null);
    }

    public final void logEvent(String eventName, Map<String, String> metadata) {
        AbstractC16544l.m18094g(eventName, "eventName");
        AbstractC16544l.m18094g(metadata, "metadata");
        enforceInitialized$build_release("logEvent");
        ErrorBoundary.capture$default(this.errorBoundary, new C128083(eventName, metadata, this), "logEvent", null, null, 12, null);
    }
}
